package org.example.Lambda.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        Producto prod1 = new Producto("Silla",45.00,"Mueble");
        Producto prod2 = new Producto("Plato",3.00,"Cubertería");
        Producto prod3 = new Producto("Ordenador de Sobremesa",759.50,"Informática");
        Producto prod4 = new Producto("Televisión",580.00,"Electrónica");
        Producto prod5 = new Producto("Mesa",60.00,"Mueble");
        Producto prod6 = new Producto("Cuchillo",1.50,"Cubertería");
        listaProductos.add(prod3);
        listaProductos.add(prod2);
        listaProductos.add(prod1);
        listaProductos.add(prod4);
        listaProductos.add(prod5);
        listaProductos.add(prod6);

        FiltroProducto filtroProducto = producto -> producto.getCategoria().equals("Informática") && producto.getPrecio() > 600;

        System.out.println("Productos filtrados (Informática y Precio > 600):");
        for (Producto producto : listaProductos) {
            if (filtroProducto.filtrar(producto)) {
                System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + "€");
            }
        }
    }
}
