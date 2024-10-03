package org.example;
import java.util.Scanner;

public class Ejer5 {
    public void ejer5(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime un número");
        int num1 = entrada.nextInt();
        System.out.println("Dime otro");
        int num2 = entrada.nextInt();
        System.out.println("Dime otro");
        int num3 = entrada.nextInt();

        if( num1 == num2 || num1 == num3 || num2 == num3 ) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        } else {
            int menor = num1;
            if( num2 < num1 ) {
                menor = num2;
            }
            if( num3 < num2 ){
                menor = num3;
            }
            System.out.println("El mínimo es " + menor);
        }
    }
}
