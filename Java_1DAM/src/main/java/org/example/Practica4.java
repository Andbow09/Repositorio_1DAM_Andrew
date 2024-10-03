package org.example;
import java.util.Scanner;

public class Practica4 {
    public void practica4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el multiplicando (3 cifras):");
        int mult1 = entrada.nextInt();
        while( mult1 <= 99 || mult1 >= 1000 ){
            System.out.println("ERROR: El multiplicando debe ser de 3 cifras");
            System.out.println("Introduce el multiplicando (3 cifras):");
            mult1 = entrada.nextInt();
        }

        System.out.println("Introduce el multiplicador (3 cifras):");
        int mult2 = entrada.nextInt();
        while( mult2 <= 99 || mult2 >= 1000 ){
            System.out.println("ERROR: El multiplicador debe ser de 3 cifras");
            System.out.println("Introduce el multiplicador (3 cifras):");
            mult2 = entrada.nextInt();
        }
        // Convertimos el tercer dígito.
        String mult2C = Integer.toString(mult2);
        String mult2C_1 = mult2C.substring(2,3);
        int mult2_1 = Integer.parseInt(mult2C_1);
        // Multiplicamos el tercer dígito por el multiplicando.
        int res1 = mult2_1 * mult1;

        // Convertimos el segundo dígito.
        String mult2C_2 = mult2C.substring(1,2);
        int mult2_2 = Integer.parseInt(mult2C_2);
        // Multiplicamos el segundo dígito por el multiplicando.
        int res2 = mult2_2 * mult1;

        // Convertimos el primer dígito.
        String mult2C_3 = mult2C.substring(0,1);
        int mult2_3 = Integer.parseInt(mult2C_3);
        // Multiplicamos el primer dígito por el multiplicando.
        int res3 = mult2_3 * mult1;

        int res_final = mult1 * mult2;
        System.out.println("El producto de la multiplicación es: " + res_final);

        System.out.println("  " + mult1);
        System.out.println("x " + mult2);
        System.out.println("------");
        System.out.println("  " + res1);
        System.out.println(" " + res2 + "x");
        System.out.println(res3 + "xx");
        System.out.println("------");
        System.out.println(res_final);
    }
}
