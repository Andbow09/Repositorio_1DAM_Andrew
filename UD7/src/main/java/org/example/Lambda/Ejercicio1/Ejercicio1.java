package org.example.Lambda.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejecutor ejec = (param1) -> {
            if (param1 > 10) {
                return true;
            }

            return false;
        };

        System.out.println("Comprobando para el 5");
        System.out.println(ejec.ejecutar(5));

        System.out.println("\nComprobando para el 20");
        System.out.println(ejec.ejecutar(20));
    }
}
