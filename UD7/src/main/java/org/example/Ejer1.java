package org.example;

import java.util.Stack;

public class Ejer1 {
    public static void main(String[] args) {
        Stack<Character> pila = new Stack<>();

        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');

        System.out.println(pila.isEmpty());

        System.out.println(pila.size());

        System.out.println(pila.peek());

        for (char i : pila) {
            System.out.println(i);
        }
    }
}