package org.example.ud8.Practica3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad6 {
    public static void main(String[ ] args) throws IOException {
        encontrarPalabra("hola");
    }

    public static void encontrarPalabra(String palabra) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/prueba.txt"));

        int contador = 0;

        String linea;

        while ((linea = lector.readLine()) != null) {
            String[] palabras = linea.split(" ");

            for (String pal : palabras) {
                if (pal.equalsIgnoreCase(palabra)) {
                    contador++;
                }
            }
        }

        lector.close();

        System.out.println("La palabra " + palabra + " se ha encontrado " + contador + " veces.");
    }
}

