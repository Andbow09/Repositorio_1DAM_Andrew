package org.example.Comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4));
        Collections.sort(numeros);
        System.out.println(numeros);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("A","B","C","D"));
        Collections.sort(nombres);
        System.out.println(nombres);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("jersei",8));
        listaProductos.add(new Producto("polo",7));
        listaProductos.add(new Producto("pantalon",7));

        Collections.sort(listaProductos,new CompararPorPrecio());
        System.out.println(listaProductos);
    }
}
