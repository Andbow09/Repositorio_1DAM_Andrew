package org.example;

import java.util.Scanner;

public class Ejer5 {
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
