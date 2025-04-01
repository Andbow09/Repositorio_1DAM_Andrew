package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(2);
        pila.push(7);
        pila.push(9);
        pila.push(3);

        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());
    }
}