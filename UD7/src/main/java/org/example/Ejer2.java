package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        pila.push(num1);

        System.out.println("\nIntroduce el segundo número: ");
        int num2 = scanner.nextInt();
        pila.push(num2);

        System.out.println("\nIntroduce el tercer número: ");
        int num3 = scanner.nextInt();
        pila.push(num3);
    }
}