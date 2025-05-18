package org.example.ud8.Practica3;

import java.io.*;
import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        File archivo1 = new File("src/main/resources/ejemplo1.txt");
        File archivo2 = new File("src/main/resources/prueba.txt");

        combinarArchivosPorPalabra(archivo1, archivo2);
    }

    public static void combinarArchivosPorPalabra(File archivo1, File archivo2) {
        File archivoCombinado = new File(archivo1.getParent(), "combinado.txt");

        try (
            Scanner scanner1 = new Scanner(archivo1);
            Scanner scanner2 = new Scanner(archivo2);
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCombinado))
        ) {
            while (scanner1.hasNext() || scanner2.hasNext()) {
                if (scanner1.hasNext()) {
                    escritor.write(scanner1.next() + " ");
                }
                if (scanner2.hasNext()) {
                    escritor.write(scanner2.next() + " ");
                }
            }

            System.out.println("Archivo combinado creado: " + archivoCombinado.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
