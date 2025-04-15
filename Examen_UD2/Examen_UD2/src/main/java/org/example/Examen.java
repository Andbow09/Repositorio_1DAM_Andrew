package org.example;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public void Ejercicio1() {
        int ronda = 1;
        int puntosJ = 0;
        int puntosP = 0;

        do {
            System.out.println("\nRonda " + ronda);

            char opcionpc = "pat".charAt(random.nextInt(3));
            String opcion_pc = "";
            switch (opcionpc) {
                case 'p':
                    opcion_pc = "Piedra";
                    break;
                case 'a':
                    opcion_pc = "Papel";
                    break;
                case 't':
                    opcion_pc = "Tijera";
                    break;
            }

            System.out.print("¿Piedra, papel o tijera? (p/a/t): ");
            String op = scanner.next();

            if ((op.equals("p") && opcion_pc.equals("Piedra")) || (op.equals("a") && opcion_pc.equals("Papel")) || (op.equals("t") && opcion_pc.equals("Tijera"))) {
                System.out.println("El ordenador a elegido: " + opcion_pc);
                System.out.println("¡EMPATE!");
            } else if ((op.equals("p") && opcion_pc.equals("Tijera")) || (op.equals("a") && opcion_pc.equals("Piedra")) || (op.equals("t") && opcion_pc.equals("Papel"))) {
                System.out.println("El ordenador a elegido: " + opcion_pc);
                System.out.println("¡HAS GANADO!");
                puntosJ++;
                System.out.println("Marcador actual (PC-Jugador): " + puntosP + "-" + puntosJ);
                ronda++;
            } else if ((op.equals("p") && opcion_pc.equals("Papel")) || (op.equals("a") && opcion_pc.equals("Tijera")) || (op.equals("t") && opcion_pc.equals("Piedra"))) {
                System.out.println("El ordenador a elegido: " + opcion_pc);
                System.out.println("¡HAS PERDIDO!");
                puntosP++;
                System.out.println("Marcador actual (PC-Jugador): " + puntosP + "-" + puntosJ);
                ronda++;
            }
        } while(ronda <= 3);

        if (puntosJ > puntosP) {
            System.out.println("¡GANA EL USUARIO!");
        } else {
            System.out.println("¡GANA EL PC!");
        }
    }

    public void Ejercicio2() {
        System.out.println("Dame tu año de nacimiento: ");
        int an_nac = scanner.nextInt();
        int edad = 0;

        LocalDate fecha_actual = LocalDate.now();

        if (an_nac > 1900 && an_nac <= fecha_actual.getYear()) {
            do {
                System.out.println(an_nac + " - Edad: " + edad);
                an_nac++;
                edad++;
            } while (an_nac <= fecha_actual.getYear());
        } else {
            System.out.println("fecha de nacimiento incorrecta o no válida");
        }
    }
}
