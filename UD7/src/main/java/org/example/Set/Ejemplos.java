package org.example.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejemplos {
    public static void main(String[] args) {
        Set<Character> conjunto = new HashSet<>();
        conjunto.add('a');
        conjunto.add('b');
        conjunto.add('c');
        conjunto.add('d');
        conjunto.add('a');
        System.out.println(conjunto);

        Set<Character> conjunto_ordenado = new TreeSet<>();
        conjunto_ordenado.add('g');
        conjunto_ordenado.add('e');
        conjunto_ordenado.add('v');
        conjunto_ordenado.add('y');
        System.out.println(conjunto_ordenado);
    }
}
