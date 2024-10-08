package org.example;
import java.util.Scanner;

public class Ejer1 {
    public void ejer1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Di una frase");
        String frase = entrada.nextLine();
        System.out.println(frase);

        int longitud = frase.length();
        int midlongitud = longitud / 2;
        System.out.println("La longitud de la frase es de: " + longitud);

        String sinespacios = frase.replace(" ", "");
        System.out.println("La frase sin espacios es: " + sinespacios);

        String parte1 = frase.substring(0,midlongitud);
        String parte2 = frase.substring(midlongitud,longitud);
        String concat = frase.concat(parte2);
        System.out.println("Primera mitad del texto es: " + parte1 + ", y la segunda mitad del texto es: " + parte2);
        System.out.print(concat);

        String mayus = frase.toUpperCase();
        System.out.println(mayus);
    }
}