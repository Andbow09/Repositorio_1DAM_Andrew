package org.example.ud8.Practica3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Actividad4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("¿Cuántos archivos quieres crear?: ");
        int cantidad = scanner.nextInt();

        System.out.println("¿En qué carpeta?");
        String ruta = scanner.next();

        for (int i = 1; i <= cantidad; i++) {
            File archivo = new File("src/main/" + ruta + "/nuevoArchivo(" + i + ").txt");

            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo " + archivo.getName() + " creado en " + ruta + ".");
                } else {
                    System.out.println("El archivo " + archivo.getName() + " ya existe");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File directorio = new File("nuevoDirectorio");

        if (directorio.mkdir()) {
            System.out.println("Directorio creado");
        } else {
            System.out.println("No se pudo crear el directorio");
        }

        File archivoBorrar = new File("archivoParaEliminar.txt");

        if (archivoBorrar.delete()) {
            System.out.println("Archivo eliminado");
        } else {
            System.out.println("No se pudo eliminar el archivo");
        }
    }
}
