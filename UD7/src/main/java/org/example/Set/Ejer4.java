package org.example.Set;

import java.util.Set;
import java.util.TreeSet;

public class Ejer4 {
    public static void main(String[] args) {
        Set<Integer> numeros1 = new TreeSet<>();
        numeros1.add(1);
        numeros1.add(3);
        numeros1.add(9);
        numeros1.add(7);
        numeros1.add(5);

        Set<Integer> numeros2 = new TreeSet<>();
        numeros2.add(8);
        numeros2.add(6);
        numeros2.add(4);
        numeros2.add(2);

        Set<Integer> numeros = new TreeSet<>();
        for (int num : numeros1) {
            numeros.add(num);
        }

        for (int num : numeros2) {
            numeros.add(num);
        }

        System.out.println(numeros);
    }
}
