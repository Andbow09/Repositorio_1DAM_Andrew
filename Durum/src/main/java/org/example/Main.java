package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

///**
// * @author Andrew Bowen
// * @version 1.0.0
// */

public class Main {
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

//        System.out.print("Escribe el número de casos de prueba: ");
        int numCasos;
        try {
            numCasos = in.nextInt();
            in.nextLine();
        } catch (InputMismatchException err) {
            return;
        }
        for (int i = 0; i < numCasos; i++) {
            durum();
        }
    }

    public static void durum() {
//        System.out.print("Introduce la cantidad de carne de conejo y caballo (<conejo> <caballo>): ");
        String carnes = in.nextLine();
        String[] carne = carnes.split(" ");

        int conejo = 0;
        int caballo = 0;

        try {
            conejo = Integer.parseInt(carne[0]);
            caballo = Integer.parseInt(carne[1]);
        } catch (NumberFormatException err) {
//            System.out.println("Introduce variables numéricas, por favor. Saliendo...");
            return;
        }

        if((conejo <= 0 || conejo > 100) || (caballo <= 0 || caballo > 100)) {
//            System.out.print("La cantidad de carne debe ser una razonable, entre 0 y 100. Saliendo...");
            return;
        }

        double total = conejo + caballo;
        double porcentaje_conejo = ((double) conejo / total) * 100;
        int porcentaje = (int) Math.round(porcentaje_conejo);

//        System.out.println("Porcentaje de carne de conejo: " + porcentaje);
//        System.out.println(" ");
    }
}