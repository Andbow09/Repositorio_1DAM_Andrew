package org.example;
import java.util.Scanner;

public class Ejer2 {
    public void ejer2(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime un número");
        int num1 = entrada.nextInt();
        System.out.println("Dime otro");
        int num2 = entrada.nextInt();
        if( num1 > num2 ){
            System.out.println(num1 +" es mayor a "+ num2);
        }else{
            if( num1 < num2 ){
                System.out.println(num1 +" es menor a "+ num2);
            }else{
                System.out.println("ERROR: Los números introducidos son iguales");
            }
        }
    }
}
