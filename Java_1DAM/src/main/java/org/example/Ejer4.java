package org.example;
import java.util.Scanner;

public class Ejer4 {
    public void ejer4(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime el valor de la base");
        int b = entrada.nextInt();
        while( b <= 0 ){
            System.out.println("El valor de la base debe ser positivo.");
            System.out.println("Dime el valor de la base");
            b = entrada.nextInt();
        }
        System.out.println("Dime el valor de la altura");
        int h = entrada.nextInt();
        while( h <= 0 ){
            System.out.println("El valor de la altura debe ser positivo.");
            System.out.println("Dime el valor de la altura");
            h = entrada.nextInt();
        }
        int a = ( b * h ) / 2;
        System.out.println("El área del triángulo es " + a);
    }
}
