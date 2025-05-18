package org.example.ud8.Practica3;

import java.io.*;

public class Actividad9 {
    public static void main(String[] args) {
        File archivo = new File("src/main/resources/prueba.txt");

        palabrasMayusculas(archivo);
    }

    public static void palabrasMayusculas(File archivoOriginal) {
        File archivoTemporal = new File("archivo_temp.txt");

        try (
                BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemporal))
        ) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                StringBuilder nuevaLinea = new StringBuilder();
                String[] palabras = linea.split(" ");

                for (int i = 0; i < palabras.length; i++) {
                    String palabra = palabras[i];
                    if (!palabra.isEmpty()) {
                        String mayus = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
                        nuevaLinea.append(mayus);
                    }
                    if (i < palabras.length - 1) {
                        nuevaLinea.append(" ");
                    }
                }

                writer.write(nuevaLinea.toString());
                writer.newLine();
            }

            if (archivoOriginal.delete()) {
                archivoTemporal.renameTo(archivoOriginal);
            } else {
                System.out.println("No se pudo reemplazar el archivo original.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

