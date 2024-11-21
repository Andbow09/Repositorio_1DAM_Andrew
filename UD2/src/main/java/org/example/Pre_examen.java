package org.example;
import java.util.Scanner;

public class Pre_examen {
    public void ejer1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres comprobar?");
        int cant = entrada.nextInt();

        int may = 0;
        int men = 0;
        int eq = 0;

        for (int i = 1; i <= cant; i++) {
            System.out.print("Ingrese nº" + i + ": ");
            int num = entrada.nextInt();

            if (num > 0) {
                may++;
            } else if (num < 0) {
                men++;
            } else {
                eq++;
            }
        }

        System.out.println("Mayores a 0: " + may);
        System.out.println("Menores a 0: " + men);
        System.out.println("Iguales a 0: " + eq);
    }
    public void ejer2() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dime un número base: ");
        int base = entrada.nextInt();
        int base2 = base;

        System.out.print("Dime un exponente (positivo): ");
        int exp = entrada.nextInt();

        if (exp < 0) {
            System.out.println("El exponente debe ser positivo.");
        } else {
            for (int i = 1; i < exp; i++) {
                base = base * base2;
            }
        }

        System.out.println(base2 + "^" + exp + " = " + base);
    }
    public void ejer3() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿A cuántos meses quieres financiar?");
        int cant_mes = entrada.nextInt();

        int inicio = 10;
        int total = 0;

        System.out.println("Financiación a " + cant_mes + " mes/es:");
        for (int i = 1; i <= cant_mes; i++) {
            System.out.println("Mes " + i + ": " + inicio + "€");

            total += inicio;
            inicio *= 2;
        }

        System.out.println("Total a pagar: " + total + "€");
    }
    public void ejer4() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 1,2,3,4:
                System.out.println("INSUFICIENTE");
            break;
            case 5:
                System.out.println("SUFICIENTE");
            break;
            case 6:
                System.out.println("BIEN");
            break;
            case 7,8:
                System.out.println("NOTABLE");
            break;
            case 9,10:
                System.out.println("SOBRESALIENTE");
            break;
            default:
                System.out.println("No válido.");
            break;
        }
    }
    public void ejer5() {
        Scanner entrada = new Scanner(System.in);

        int mil = 0;
        int sueldo = 0;
        int sueldo_max = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Dime el " + i + "º sueldo: ");
            sueldo = entrada.nextInt();

            if (sueldo > 999) {
                mil++;
            }
            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }
        }

        System.out.println("Nº de sueldos mayores a 1000€: " + mil);
        System.out.println("Sueldo máximo: " + sueldo_max);
    }
    public void ejer6() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿De cuántos alumnos quieres sacar datos?: ");
        int cant = entrada.nextInt();

        int edad = 0;
        int alt = 0;
        int edadtotal = 0;
        int altotal = 0;
        int may = 0;
        int alt175 = 0;
        int i;

        for (i = 1; i <= cant; i++) {
            System.out.print("Edad de alumno nº" + i + ": ");
            edad = entrada.nextInt();

            System.out.print("Altura de alumno nº" + i + ": ");
            alt = entrada.nextInt();

            if (edad >= 18) {
                may++;
            }

            if (alt >= 175) {
                alt175++;
            }

            edadtotal+=edad;
            altotal+=alt;
        }

        int edad_media = edadtotal / cant;
        int alt_media = altotal / cant;

        System.out.println(" ");
        System.out.println("Edad media: " + edad_media);
        System.out.println("Altura media: " + alt_media);
        System.out.println(" ");
        System.out.println("Alumnos mayores de edad: " + may);
        System.out.println("Alumnos que miden más de 175cm: " + alt175);
    }
    public void ejer7() {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Dime un número: ");
        int num = entrada.nextInt();

        int res = 0;
        int res2 = 1;

        if (num <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            System.out.print("Secuencia de Números: ");
            for (int i = 0; i < num; i++) {
                System.out.print(res + " ");

                int total = res + res2;
                res = res2;
                res2 = total;
            }
        }
    }
}