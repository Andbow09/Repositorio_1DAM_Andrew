package org.example;
import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        int tabla = pedir();
        boolean valid = validar(tabla);

        if(valid) {
            calcular(tabla);
            System.out.println("El cuadrado de " + tabla + " es: " + cuadrado(tabla));
        }else{
            System.out.println("La tabla introducida no es válida. Saliendo...");
        }
    }

    public static int cuadrado(int tabla) {
        return tabla*tabla;
    }

    public static int pedir() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la tabla que quieras: ");
        int tabla = in.nextInt();

        return tabla;
    }

    public static boolean validar(int tabla) {
        if (tabla < 1 || tabla > 10) {
            return false;
        }

        return true;
    }

    public static void calcular(int tabla) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(tabla + "*" + i + " = " + (tabla * i));
        }
    }
}