package org.example.Lambda.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        VerificadorVoto vv = (nombre,edad) -> {
            if (edad > 18) {
                return true;
            }

            return false;
        };

        System.out.print("Probando María con 14 años... ");
        System.out.print(vv.puedeVotar("María",14));

        System.out.print("\n\nProbando Javier con 25 años... ");
        System.out.print(vv.puedeVotar("Javier",25));
    }
}
