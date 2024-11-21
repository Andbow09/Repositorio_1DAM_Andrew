package org.example;
import java.util.Scanner;

public class Ejer6 {
    public void ejer6(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Tienes tomate?");
        String op1 = entrada.next();
        System.out.println("¿Tienes aceite?");
        String op2 = entrada.next();
        System.out.println("¿Tienes jamón?");
        String op3 = entrada.next();
        if( op1.equals("no") || op2.equals("no") || op3.equals("no") ){
            System.out.println("Tenemos que ir a comprar");
        } else if( op1.equals("si") || op2.equals("si") || op3.equals("si") ){
            System.out.println("No tenemos que ir a comprar");
        }
    }
}
