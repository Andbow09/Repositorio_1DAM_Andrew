package org.example;
import java.util.Scanner;

public class Ejer2 {
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
}
