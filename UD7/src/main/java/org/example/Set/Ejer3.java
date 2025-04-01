package org.example.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enlace = "";

        Set<String> historial = new LinkedHashSet<>();

        boolean cond = true;

        do {
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            enlace = scanner.next();

            if (enlace.equals("salir")) {
                cond = false;
                break;
            }

            historial.add(enlace);
        } while (cond);

        int i = 1;

        System.out.println("Historial de navegación:");
        for (String link : historial) {
            System.out.println((i++) + ". " + link);
        }
    }
}