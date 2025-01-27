package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {
        menu();

        int opcion = opcion();

        int num = 0;
        switch (opcion) {
            case 1:
                num = pedir();
                int res = dig(num, 0);
                System.out.println(res);
                System.out.println("");
                break;
            case 2:
                num = pedir();
                int num2 = pedir2();
                int resp = pot(num, num2, 1);
                System.out.println(resp);
                break;
            case 3:
                num = pedircaso();
                if (num == 1) {
                    inv_num(num);
                } else if (num == 2) {
                    inv_pal(num);
                }
                System.out.println("");
                break;
            case 4:
                num = pedir();
                bin(num);
                break;
            case 5:
                num = pedir();
                a_bin(num);
                break;
            case 6:
                num = pedir();
                alfa(num);
                break;
            case 7:
                num = pedir();
                suma(num);
                break;
        }

        String opcion2 = salir_menu();
        switch (opcion2) {
            case "m":
                menu();
                break;
            case "x":
                borrar();
        }
    }

    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }


    public static void inv_pal(int num) {
        System.out.println("Introduce una palabra:");
        String pal = scanner.next();
        palabra = pal.toCharArray();
        array(palabra.length-1);
    }

    public static void array(int cont) {
        if (cont == 0) {
            System.out.print(palabra[cont]);
        } else {
            System.out.print(palabra[cont]);
            array(cont - 1);
        }
    }

    public static void menu() {
        System.out.println("*** Batería de Ejercicios sobre Recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("    1 - Dígitos.");
        System.out.println("    2 - Potencias.");
        System.out.println("    3 - Del Revés.");
        System.out.println("    4 - Binario.");
        System.out.println("    5 - A Binario");
        System.out.println("    6 - Orden Alfabético");
        System.out.println("    7 - Mostrar Suma.");
        System.out.println("");
    }

    public static int opcion() {
        return scanner.nextInt();
    }

    public static int pedir() {
        System.out.println("Introduce un número");
        return scanner.nextInt();
    }

    public static int pedir2() {
        System.out.println("Introduce su potencia");
        return scanner.nextInt();
    }

    public static int pedircaso() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("    1. Invertir un número.");
        System.out.println("    2. Invertir una palabra");
        return scanner.nextInt();
    }

    static char palabra[];

    public static String salir_menu() {
        System.out.println("Elige una opción:");
        System.out.println("    [M] - Volver al menú principal.");
        System.out.println("    [X] - Salir.");

        String opcion = scanner.next();
        
        opcion = opcion.toLowerCase();

        switch (opcion) {
            case "m":
                return "m";
            case "x":
                return "x";
            default:
                salir_menu();
                break;
        }
        return opcion;
    }

    public static void suma(int num) {
    }

    public static void alfa(int num) {
    }

    public static void a_bin(int num) {
    }

    public static void bin(int num) {
    }

    public static void inv_num(int num) {

    }

    public static int pot(int num, int num2, int cont) {

        if (cont == num2) {
            return num;
        }
        return pot(num * num, num2,cont + 1);
    }

    public static int dig(int num, int cont) {
        if (num < 10) {
            return cont + 1;
        }

        return dig(num/10, cont + 1);
    }
}