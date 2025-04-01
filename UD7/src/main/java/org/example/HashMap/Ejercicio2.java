package org.example.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,Integer> mapa = new HashMap<>();

        System.out.println("Introduce una palabra:");
        String palabra = scanner.next();

        String[] letras = palabra.split("");

        for (String let : letras) {
            mapa.put(let, (mapa.getOrDefault(let,0) + 1));
        }

        for (Map.Entry<String,Integer> lets : mapa.entrySet()) {
            System.out.println(lets.getKey() + ": " + lets.getValue());
        }
    }
}
