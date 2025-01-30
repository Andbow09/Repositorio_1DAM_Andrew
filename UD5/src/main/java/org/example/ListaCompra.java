package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaCompra {
    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList<>();

        if (listaCompra.isEmpty()) {
            System.out.println("La lista de la compra está vacía.");
            listaCompra.add("Jamón York");
        }

        listaCompra.addAll(Arrays.asList("Huevos","Tomate","Leche","Ensalada","Cereales"));
        System.out.println("Lista de la compra: " + listaCompra);

        System.out.println(listaCompra.get(2));

//        listaCompra.
    }
}