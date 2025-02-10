package org.example;

import org.example.biblioteca.Estudiante;
import org.example.biblioteca.Libro;
import org.example.lombok_prueba.Instituto;

public class Main {
    public static void main(String[] args) {
        Instituto insti = null;

        try {
            insti = new Instituto(null,"alicante","calle 2");
        } catch (NullPointerException err) {
            System.out.println("El nombre no puede ser nulo");
        }

        System.out.println(insti);
    }
}