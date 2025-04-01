package org.example.Impresora_Online;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public class AppImpresora {
    static final String ID = "PC3493";
    static LinkedHashSet<Peticion> listaDocumentos = new LinkedHashSet<>();

    public static void main(String[] args) {
        System.out.println("*** BIENVENIDO A TU IMPRESORA ONLINE ***");
        anyadirDocumento("archivo.pdf");
        anyadirDocumento("archivo2.pdf");
        anyadirDocumento("archivo.exe");
        anyadirDocumento("archivo3.pdf");
        anyadirDocumento("archivo3.pdf");
        anyadirDocumento("archivo.java");
        verTodo();
        System.out.println(getNumPeticiones());
        imprimirDocumento();
        imprimirDocumento();
        imprimirDocumento();

        try {
            imprimirDocumento();
        } catch (NoSuchElementException e) {
            System.out.println("No hay nada que imprimir");
        }

        verTodo();
    }

    public static void anyadirDocumento(String documento) {
        if (documento.endsWith(".pdf")) {
            if (listaDocumentos.add(new Peticion(ID,documento))) {
                System.out.println("Fichero " + documento + " añadido a la cola.");
            } else {
                System.out.println("El fichero " + documento + " ya existe en la cola.");
            }
        } else {
            System.out.println("El archivo debe ser un pdf");
        }
    }

    public static void imprimirDocumento() {
        System.out.println("Imprimiendo... " + listaDocumentos.getFirst().getNombre());
        listaDocumentos.removeFirst();
    }

    public static int getNumPeticiones() {
        return listaDocumentos.size();
    }

    public static void verTodo() {
        System.out.println("Cola de Impresión: " + listaDocumentos);
    }
}
