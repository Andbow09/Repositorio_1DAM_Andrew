package org.example;
import java.util.Scanner;

public class Ejer_char {
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
    public void ejer2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Di una frase");
        String frase = entrada.nextLine();
        int longitud = frase.length();

        System.out.println("Di otra frase");
        String frase2 = entrada.nextLine();
        int longitud2 = frase2.length();

        if(longitud > longitud2){
            System.out.println(frase + " es más larga que " +  frase2);
        }else{
            System.out.println(frase2 + " es más larga que " + frase);
        }
    }
    public void ejer3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dale un valor a N");
        int n = entrada.nextInt();
        String ns = Integer.toString(n);
        int longitud = ns.length();

        System.out.println("Dale un valor a M");
        int m = entrada.nextInt();
        int res = longitud - m;
        String ns_1 = ns.substring(0,res);
        System.out.println("El nuevo valor de N es " + ns_1);
    }
    public void ejer4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Di una frase");
        String frase = entrada.nextLine();

        System.out.println("¿Qué palabra quieres contar?");
        String subcad = entrada.next();
    }
    public void ejer5(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una frase, jugador 1");
        String frase = entrada.nextLine();

        System.out.println("Adivina la palabra, Jugador 2");
        String palabra = entrada.next();

        int intentos = 10;

        while (intentos > 1){
            if (frase.contains(palabra)){
                System.out.println("¡Enhorabuena Jugador 2, ha acertado la palabra!");
                break;
            }else{
                intentos = intentos - 1;
                System.out.println("Intento fallido, tienes " + intentos + " intentos, así que vuelve a intentarlo");
                System.out.println("Adivina la  palabra, Jugador 2");
                palabra = entrada.next();
            }
        }
        if(intentos==1){
            System.out.println("Te has quedado sin vidas");
        }
    }
}