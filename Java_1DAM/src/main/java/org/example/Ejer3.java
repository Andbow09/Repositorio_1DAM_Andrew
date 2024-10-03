package org.example;
import java.util.Scanner;

public class Ejer3 {
    public void ejer3(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime un número");
        int num1 = entrada.nextInt();
        System.out.println("Dime otro");
        int num2 = entrada.nextInt();
        if( num2!=0 ){
            int res = num1 / num2;
            System.out.println("El resultado es " + res);
        }else{
            System.out.println("ERROR: No se puede dividir entre 0");
        }
    }
}
