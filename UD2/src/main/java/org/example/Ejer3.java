package org.example;
import java.util.Scanner;

public class Ejer3 {
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

}
