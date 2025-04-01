package org.example.Recaudacion_Cine;

import java.util.LinkedHashSet;
import java.util.Random;

public class AppCine {
    static LinkedHashSet<Persona> listaPersonas = new LinkedHashSet<>();
    public static void main(String[] args) {
        System.out.println("*** CINE AL POBLE ***");
        generarCola();
        System.out.println(listaPersonas);
        pagar();
    }

    public static void generarCola() {
        Random random = new Random();

        int edad = 0;

        for (int i = 0; i < 250; i++) {
            edad = random.nextInt(3,97);
            Persona persona = new Persona(edad);
            listaPersonas.add(persona);
        }
    }

    public static void pagar() {
        double recaudacion = 0;

        for (Persona p : listaPersonas) {
            if (p.getEdad() >= 3 && p.getEdad() <= 10) {
                recaudacion += 1;
            } else if (p.getEdad() >= 11 && p.getEdad() <= 17) {
                recaudacion += 2.50;
            } else {
                recaudacion += 3.50;
            }
        }

        while (!listaPersonas.isEmpty()) {
            listaPersonas.removeFirst();
        }

        System.out.println("La recaudación ha sido de " + recaudacion + "€");
    }
}