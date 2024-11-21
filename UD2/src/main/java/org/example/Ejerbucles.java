package org.example;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Ejerbucles {
    public void ejer1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu contraseña (numérica):");
        int contrasenya = entrada.nextInt();

        System.out.println("Escríbela de nuevo:");
        int contrasenya2 = entrada.nextInt();

        while (contrasenya2 != contrasenya) {
            System.out.println("Escríbela de nuevo:");
            contrasenya2 = entrada.nextInt();
        }

        System.out.println("Acceso correcto.");
    }
    public void ejer2() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un número:");
        int num = entrada.nextInt();

        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
    public void ejer3() {
        for (int i = 1; i <= 50; i++) {
            if ((i & 3) == 0) {
                System.out.println(i);
            }
        }
    }
    public void ejer4() {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Escribe una palabra");
        String palabra = entrada.next();

        int longitud = palabra.length();

        for (int i = 0; i < longitud; i++) {
            char letra = palabra.charAt(i);
            System.out.println(letra);
        }
    }
    public void ejer5() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un número:");
        int num = entrada.nextInt();

        for (int i = 1; i <=10; i++) {
            int res = i * num;
            System.out.println( num + " * " + i + " = " + res);
        }
    }
    public void ejer6() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime cuántos números quieres sumar:");
        int cant = entrada.nextInt();

        int res = 0;

        for (int i = 1; i <= cant; i++) {
            System.out.println("Inserta nº" + i + ":");
            int num = entrada.nextInt();

            res += num;
        }

        System.out.println("El resultado es: " + res);
    }
    public void ejer7() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un número");
        int num = entrada.nextInt();

        int res = 1;

        for (int i = 2; i <= num; i++) {
            res *= i;
        }

        System.out.println("El factorial de " + num + " es: " + res);
    }
    public void ejer8() {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Escribe una palabra");
        String palabra = entrada.next();

        int longitud = palabra.length();
        int i;
        for (i = longitud; i > 0; i--) {
            char letra = palabra.charAt(i - 1);
            System.out.print(letra);
        }
    }
}