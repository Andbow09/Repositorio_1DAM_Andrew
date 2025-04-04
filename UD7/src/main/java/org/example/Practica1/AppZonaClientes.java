package org.example.Practica1;

import java.util.*;

public class AppZonaClientes {
    static Scanner scanner = new Scanner(System.in);
    static Cliente cliente;

    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();
        mercadam.generarClientes();
        System.out.println("Cliente de prueba: " + mercadam.getListaClientes());

        autenticacion(mercadam.getListaClientes());
        iniciarCompra();
        gestionarPedido();
    }

    public static void autenticacion(List<Cliente> clientes) {
        System.out.println("\n*** COMPRA ONLINE DE MERCADAM ***");

        for (int i = 0; i < 3; i++) {
            System.out.print("\nUsuario: ");
            String usuario = scanner.next();
            System.out.print("Contraseña: ");
            String contrasena = scanner.next();

            for (Cliente cli : clientes) {
                if (cli.getUsuario().equals(usuario) && cli.getContrasena().equals(contrasena)) {
                    System.out.println("\nBienvenid@ " + cli.getUsuario() + "!");
                    cliente = cli;
                    return;
                }
            }

            if (i < 2) {
                System.out.println("\nAlgo no coincide o no existe! Vuelve a intentarlo...");
            }
        }

        System.out.println("\nERROR DE AUTENTICACION.");
        System.exit(0);
    }

    public static void iniciarCompra() {
        cliente.crearPedido();
        System.out.println("\nAñade productos a tu lista de la compra:");

        boolean continuar = true;
        while (continuar) {
            imprimirProductos();
            System.out.print("\nElige un producto: ");
            String producto = scanner.next();

            try {
                cliente.insertarProducto(producto);
                System.out.println("\nHas añadido " + producto.toUpperCase() + "con un precio de " + Producto.valueOf(producto.toUpperCase()).getPrecio() + "€. Importe total: " + cliente.getPedido().getImporte() + "€. ¿Añadir más? [S/N]: ");
                continuar = scanner.next().equalsIgnoreCase("S");
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: Producto no válido!");
            }
        }
    }

    public static void gestionarPedido() {
        boolean terminar = false;

        while (!terminar) {
            System.out.println("\n¿QUÉ DESEA HACER?");
            System.out.println("[1]. Aplicar promo");
            System.out.println("[2]. Mostrar resumen ordenado");
            System.out.println("[3]. Terminar pedido");
            System.out.print("\nElige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (cliente.getPedido().isPromoAplicada()) {
                        System.out.println("\nYa has aplicado las promociones!");
                    } else {
                        cliente.getPedido().aplicarPromociones();
                        System.out.println("\nPROMO 3X2 y 10% APLICADAS!");
                    }
                    mostrarResumen(false);
                    break;
                case 2:
                    mostrarResumen(true);
                    break;
                case 3:
                    terminar = true;
                    System.out.println("\nGracias por tu compra, " + cliente.getUsuario() + "! Tu pedido llegará a: Dirección de ejemplo");
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        }
    }

    public static void mostrarResumen(boolean ordenado) {
        System.out.println("\nRESUMEN DE TU CARRITO:");
        if (ordenado) {
            cliente.getPedido().mostrarProductosOrdenados();
        } else {
            cliente.getPedido().mostrarProductos();
        }
        System.out.printf("IMPORTE TOTAL: %.2f€\n", cliente.getPedido().getImporte());
    }

    public static void imprimirProductos() {
        System.out.println();
        for (Producto prod : Producto.values()) {
            System.out.println("\t" + prod + " | Precio: " + prod.getPrecio() + "€");
        }
        System.out.println("========================================");
    }
}