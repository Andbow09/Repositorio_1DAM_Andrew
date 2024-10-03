package org.example;
import java.util.Scanner;

public class Ejer1 {
    public void ejer1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un número");
        int num=entrada.nextInt();
        if( num>0 ) {
            System.out.println("El número es positivo");
        }else{
            if( num<0 ){
                System.out.println("El número es negativo");
            }else{
                System.out.println("El número es igual a 0");
            }
        }
    }
}
