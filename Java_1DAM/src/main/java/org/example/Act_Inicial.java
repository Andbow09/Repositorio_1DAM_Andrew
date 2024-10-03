package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Act_Inicial {
    public void ejecutar() {
        System.out.println("¿Cómo te llamas?");

        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + " bienvenido/a a " + curso + ".");

        System.out.println("Introduce un número");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        int num2 = entrada.nextInt();

        int res = num1 + num2;
        System.out.println("El resultado es: " + res + ".");
    }
}