package org.example;
import java.util.Random;
import java.util.Scanner;

public class Cara_Cruz {
    public static void caraCruz() {
        mostrarOpciones();
        String opcion_usuario = recogerOpcion();
        String opcion_sorteo = sorteo();
        comprobarResultado(opcion_usuario, opcion_sorteo);
    }

    public static void mostrarOpciones() {
        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opción: ");
        System.out.println("C - Cara");
        System.out.println("X - Cruz");
    }

    public static String recogerOpcion() {
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.next();

        return opcion;
    }

    public static String sorteo() {
        Random random = new Random();
        String[] opciones = {"cara","cruz"};

        String sorteo = opciones[random.nextInt(2)];

        return sorteo;
    }

    public static void comprobarResultado(String opcion, String sorteo) {
        if (opcion.equals(sorteo)) {
            System.out.println("Has ganado!, ha salido: " + sorteo);
        } else {
            System.out.println("Has perdido!, ha salido: " + sorteo);
        }
    }
}
