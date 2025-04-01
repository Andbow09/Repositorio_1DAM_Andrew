package org.example.Practica1;

import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Mercadam mercadam = new Mercadam();
        mercadam.generarClientes();
        mercadam.generarClientes();
        mercadam.generarClientes();
        System.out.println(mercadam.getListaClientes());

        autenticacion(mercadam.getListaClientes());

        iniciarCompra();
    }

    static Cliente cliente;

    public static void autenticacion(List<Cliente> clientes) {

        System.out.println("*** COMPRA ONLINE DE MERCADAM ***");

        boolean salir = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("\nUsuario: ");
            String usuario = scanner.next();
            System.out.print("Contraseña: ");
            String contrasena = scanner.next();

            for (Cliente cli : clientes) {
                if (cli.getUsuario().equals(usuario) && cli.getContrasena().equals(contrasena)) {
                    System.out.println("\nBienvenid@ " + cli.getUsuario() + "!");
                    cliente = cli;
                    salir = true;
                    break;
                }
            }

            if (salir) {
                break;
            }

            if (i == 2) {
                System.out.println("\nERROR DE AUTENTICACION.");
                System.exit(0);
            } else {
                System.out.println("\nAlgo no coincide o no existe! Vuelve a intentarlo...");
            }
        }
    }

    public static void iniciarCompra() {
        Pedido pedido = new Pedido();
        System.out.println("\nAñade productos a tu lista de la compra:");

        imprimirProducto();
    }

    public static void imprimirProducto() {
        Scanner scanner = new Scanner(System.in);

        boolean estado = true;
        double importe = 0;

        do {
            System.out.println();

            for (Producto prod : Producto.values()) {
                System.out.println("\t" + prod + " | Precio: " + prod.getPrecio() + "€,");
            }
            System.out.println("========================================");

            System.out.print("\nElige un producto: ");
            String producto = scanner.next();

            System.out.println("\n========================================");

            for (Producto prod : Producto.values()) {
                if (prod.toString().toLowerCase().equals(producto)) {
                    importe += prod.getPrecio();
                    System.out.print("\nHas añadido " + prod + " con un precio de " + prod.getPrecio() + "€. Importe total del carrito: " + importe + "€. ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");
                    String respuesta = scanner.next();

                    if (respuesta.equalsIgnoreCase("s")) {
                        break;
                    } else if (respuesta.equalsIgnoreCase("n")) {
                        estado = false;
                    }
                }
            }

            if (!estado) {
                System.out.println("¡El producto deseado no existe! Elige otro.");
            }

        } while (estado);
    }

    public void imprimirDespedida() {
        System.out.println("Adiós.");
    }
}
