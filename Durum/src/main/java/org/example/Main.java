package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Andrew Bowen
 * @version 1.0.0
 */
public class Main {
    static Scanner in;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        in = new Scanner(System.in);

        System.out.print("Escribe el número de casos de prueba: ");
        int numCasos;

        try {
            numCasos = in.nextInt();

            if (numCasos == 0) {
                System.out.println("Saliendo...");
                return;
            }

            in.nextLine();
        } catch (InputMismatchException err) {
            System.out.println("Introduzca un valor válido.");
            return;
        }

        for (int i = 0; i < numCasos; i++) {
            String[] carne = introducirCarne();

            int conejo = 0;
            int caballo = 0;

            try {
                conejo = Integer.parseInt(carne[0]);
                caballo = Integer.parseInt(carne[1]);
            } catch (NumberFormatException e) {
                System.out.println("Introduce variables numéricas, por favor. Saliendo...");
                return;
            }

            calcularConejo(conejo, caballo);
        }
    }

    /**
     *
     * @return
     */
    public static String[] introducirCarne() {
        System.out.print("Introduce la cantidad de carne de conejo y caballo (<conejo> <caballo>): ");
        String carnes = in.nextLine();

        String[] carne = carnes.split(" ");

        for (int i = 0; i < carne.length; i++) {
            boolean num = carne[i].matches("\\d{1,2}");

            if (!num) {
                System.out.println("Introduzca números.");
                System.exit(0);
            }
        }

        if (carne.length != 2) {
            System.out.println("Debe introducir exactamente dos tipos de carne diferentes.");
            System.exit(0);
        }

        return carne;
    }

    /**
     *
     * @param conejo
     * @param caballo
     */
    public static void calcularConejo(int conejo, int caballo) {

        if((conejo <= 0 || conejo > 100) || (caballo <= 0 || caballo > 100)) {
            System.out.print("La cantidad de carne debe ser una razonable, entre 0 y 100. Saliendo...");
            return;
        }

        double total = conejo + caballo;
        double porcentaje_conejo = ((double) conejo / total) * 100;
        int porcentaje = (int)porcentaje_conejo;

        System.out.println("Porcentaje de carne de conejo: " + porcentaje);
        System.out.println(" ");
    }
}