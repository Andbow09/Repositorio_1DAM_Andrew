package org.example;
import java.util.Random;
import java.util.Scanner;

public class Ejerrand {
    public void ejer1r() {
        Random random = new Random();

        int num1 = random.nextInt(6) + 1;
        System.out.println("El dado 1 da " + num1);

        int num2 = random.nextInt(6) + 1;
        System.out.println("El dado 2 da " + num2);

        int res = num1 + num2;
        System.out.println("El total de los dos dados es " + res);
    }
    public void ejer2r() {
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tam = caracteres.length();

        int pwdlength = 12;
        int ind;
        String pwd = "";

        for (int i = 0; i < pwdlength; i++) {
            ind = random.nextInt(tam);
            pwd += caracteres.charAt(ind);
        }

        System.out.println(pwd);
    }
    public void ejer3r() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Dime un número (mínimo de un rango):");
        int num1 = entrada.nextInt();

        System.out.println("Dime otro número (máximo de un rango):");
        int num2 = entrada.nextInt();

        if (num2 < num1) {
            System.out.println("El número máximo  no puede ser menor al mínimo.");
        } else {
            System.out.println("¿Cuántos números generados quieres?");
            int num3 = entrada.nextInt();

            for (int i = 0; i < num3; i++) {
                int num = random.nextInt(num2 - num1 + 1) + num1;
                System.out.println(num);
            }
        }
    }
    public void ejer4r() {
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tam = caracteres.length();

        int pwdlength = random.nextInt(3) + 6;
        int ind;
        String pwd = "";

        for (int i = 0; i < pwdlength; i++) {
            ind = random.nextInt(tam);
            pwd += caracteres.charAt(ind);
        }

        System.out.println(pwd);
    }
}
