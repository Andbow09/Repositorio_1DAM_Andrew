package org.example.ud8.Practica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        encontrarPalabra("hola");
    }

    public static void encontrarPalabra(String palabra) {
        int contador = 0;

        try (Scanner scanner = new Scanner(new File("src/main/resources/prueba.txt"))) {
            while (scanner.hasNext()) {
                String p = scanner.next();
                if (p.equalsIgnoreCase(palabra)) {
                    contador++;
                }
            }

            System.out.println("La palabra " + palabra + " se ha encontrado " + contador + " veces.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
