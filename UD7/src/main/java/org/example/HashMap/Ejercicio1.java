package org.example.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,Integer> pals = new HashMap<>();

        System.out.println("Dime una frase:");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            pals.put(palabra,(pals.getOrDefault(palabra,0) + 1));
        }

        for (Map.Entry<String,Integer> pal : pals.entrySet()) {
            System.out.println(pal.getKey() + ": " + pal.getValue());
        }
    }
}
