package org.example;
import java.util.Scanner;

public class Ejer4 {
    public void ejer4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Di una frase");
        String frase = entrada.nextLine();

        System.out.println("¿Qué palabra quieres contar?");
        String subcad = entrada.next();
    }
}
