package org.example.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = scanner.nextLine();

        Set<String> palabras = new HashSet<>();
        String[] pal = frase.split(" ");

        for (int i = 0; i < pal.length; i++) {
            palabras.add(pal[i]);
        }

        System.out.println(palabras);
    }
}
