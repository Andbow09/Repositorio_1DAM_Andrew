package org.example.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Character> pal = new LinkedList<>();

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.next();

        for (int i = 0; i < palabra.length(); i++) {
            pal.offer(palabra.charAt(i));
        }
    }

    public static boolean esPalindromo(Deque<Character> pal) {
        if (pal.getFirst() == pal.getLast()) {
            pal.pollFirst();
            pal.pollLast();
            return false;
        } else {
            return true;
        }
    }


}