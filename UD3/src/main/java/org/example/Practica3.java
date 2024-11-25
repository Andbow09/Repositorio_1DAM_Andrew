package org.example;
import java.util.Scanner;

public class Practica3 {
    public void practica3() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce número de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Introduce número de columnas: ");
        int columnas = entrada.nextInt();

        String[][] sopaletras = new String[filas][columnas];

        for (int i = 0; i < filas; i++) {
            System.out.print("Introduce las letras de la fila " + (i+1) + ": ");
            String letras = entrada.next();

            boolean let = letras.matches("[a-zA-Z]+");

            if (!let) {
                System.out.println("ERROR. Introduce datos válidos: " + columnas + " letras.");
                return;
            }

            String letras_vector[] = letras.split("");

            for (int j = 0; j < sopaletras[i].length; j++) {
                sopaletras[i][j] = letras_vector[j];
            }
        }

//        for (String[] i : sopaletras) {
//            System.out.println(i);
//        }

        System.out.print("Introduce la palabra a buscar: ");
        String palabra = entrada.next();

        String[] palabra_vector = palabra.split("");

        int posicion_actual;

        String[] comparar = new String[palabra_vector.length];

        palabranoencontrada:
        for (int i = 0; i < filas; i++) {
            buscarpalabra:
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < palabra_vector.length; k++) {
                    if (palabra_vector[k].equals(sopaletras[j][i])) {
                        comparar[k] = palabra_vector[k];
                        if (comparar.equals(palabra_vector)) {
                            System.out.println("Encontrada");
                        }
                        continue buscarpalabra;
                    } else {
                        continue palabranoencontrada;
                    }
                }
            }
        }
    }
}
