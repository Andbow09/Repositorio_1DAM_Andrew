package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodos {
    public static void ejer1() {
        pedirNumero();
        int num = numero();
        int cub = calcularCubo(num);
        calcularCubo(num);
        resultado(num,cub);
    }

    public static void pedirNumero() {
        System.out.println("Dime un número, calcularé su cubo: ");
    }

    public static int numero() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        return numero;
    }

    public static int calcularCubo(int numero) {
        int cubo = numero * numero * numero;

        return cubo;
    }

    public static void resultado(int numero,int cubo) {
        System.out.println(numero + " al cubo es: " + cubo);
    }

    public static void ejer2() {
        int menu_ = menu();
        opcion(menu_);
    }

    public static Integer menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas opciones tendrá el menú?");
        Integer menu = scanner.nextInt();

        int[] menu_ = new int[menu];

        for (Integer i = 0; i < menu; i++) {
            if (i == menu) {
                System.out.println("Opción " + (i + 1) + ". Salir.");
                menu_[i] = i + 1;
                break;
            }

            System.out.println("Opción " + (i + 1) + ".");
            menu_[i] = i + 1;
        }

        return menu;
    }

    public static int opcion(int menu_) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige opción: ");
        Integer opcion = scanner.nextInt();

        boolean opcion_elegida = Arrays.asList(menu_).contains(opcion);

        if (opcion_elegida) {
            System.exit(0);
        }

        return opcion;
    }

    public static void ejer3() {
        String p = palabra();
        String may = mayus(p);
        vocales(may);
    }

    private static String palabra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe:");
        String palabra = scanner.next();

        return palabra;
    }

    public static String mayus(String palabra) {
        String mayus = palabra.toUpperCase();
        System.out.println("Palabra introducida en mayúsculas: " + mayus);
        
        return mayus;
    }

    public static int vocales(String mayus) {
        int mayus_length = mayus.length();
        String[] pal = new String[mayus_length];
        pal = mayus.split("");

        int vocales = 0;

        for (int i = 0; i < pal.length; i++) {
            if (pal[i].equals("A") || pal[i].equals("E") || pal[i].equals("I") || pal[i].equals("O") || pal[i].equals("U")) {
                vocales++;
            }
        }

        if (vocales != 0) {
            System.out.println("Hay " + vocales + " vocal/es.");
        } else {
            System.out.println("No hay vocales en tu palabra.");
        }

        return vocales;
    }

    public static void ejer4() {

    }

    public static float introducirValores() {
        Scanner scanner = new Scanner(System.in);

        float semana[] = new float[6];

        System.out.println("Introduce los valores para cada día de la semana:");
        float valor = 0;
        for (int i = 0; i < 7; i++) {
            valor = scanner.nextFloat();
        }

        return valor;
    }

    public static float masVentas() {


        return "";
    }
}

