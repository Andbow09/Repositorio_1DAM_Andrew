package org.example;
import java.util.Scanner;

public class Practica3 {
    public void practica3(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = entrada.next();
        System.out.println("Hola " + nombre + ", ¿cuál es tu edad?");
        int edad = entrada.nextInt();

        while( edad < 0 ){
            System.out.println("Introduce de nuevo tu edad:");
            edad = entrada.nextInt();
        }
        if ( edad < 18 ){
            System.out.println("Lo siento " + nombre + ", no puedes votar");
            int resto = 18 - edad;
            System.out.println("Te faltan " + resto + " años para ser mayor de edad");
        } else {
            System.out.println("Enhorabuena " + nombre + ", puedes votar");
        }
    }
}
