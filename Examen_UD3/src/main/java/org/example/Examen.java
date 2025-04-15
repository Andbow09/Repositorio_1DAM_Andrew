package org.example;

import java.util.Random;
import java.util.Scanner;

public class Examen {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public void Ejercicio1() {
        int[] bolas = new int[random.nextInt(10,30)];
        System.out.println(bolas.length);
    }
}
