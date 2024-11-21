package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class casino {
    public void casino() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String col = "rojo,negro";
        String[] color = col.split(",");

        Integer[] num = new Integer[37];
        for (int i = 0; i <= 36; i++) {
            num[i] = i;
        }

        String p_i = "par,impar";
        String[] parim = p_i.split("[-/]");

        int n = 0;
        int c = 0;
        int p = 0;

        System.out.println("Dime un número:");
        int num_guess = entrada.nextInt();

        boolean num_ad = Arrays.asList(num).contains(num_guess);

        int num_random = random.nextInt(37);

        if (!num_ad) {
            System.out.println("ERROR. Tu número no es válido.");
            return;
        } else if (num_random == 0 && num_guess == num_random) {
            System.out.println("¡Has ganado!");
            return;
        } else if (num_guess == num_random) {
            n++;
        }

        System.out.println("Dime un color:");
        String color_guess = entrada.next().toLowerCase();
        boolean color_ad = Arrays.asList(color).contains(color_guess);

        int col_random = random.nextInt(2);

        if (!color_ad) {
            System.out.println("ERROR. Tu color no es válido.");
            return;
        } else if (color_guess.equals("rojo") && col_random == 0 || (color_guess.equals("negro") && col_random == 1)) {
            c++;
        }

        System.out.println("¿Par o impar?");
        String parim_guess = entrada.next().toLowerCase();
        boolean parim_ad = Arrays.asList(parim).contains(parim_guess);

        int parim_random = num_random % 2;

        if (!parim_ad) {
            System.out.println("ERROR. Tu opción no es válida.");
            return;
        } else if ((parim_guess.equals("par") && parim_random == 0) || (parim_guess.equals("impar") && parim_random == 1)) {
            p++;
        }

        if (n == 1 && c == 1 && p == 1) {
            System.out.println("¡Has ganado!");
        } else if (n == 1 && c == 1) {
            System.out.println("Has acertado el número y el color.");
        } else if (p == 1 && c == 1) {
            System.out.println("Has acertado el color y si es par o impar.");
        } else if (n == 1 && p == 1) {
            System.out.println("Has acertado el número y si es par o impar.");
        } else if (n == 1) {
            System.out.println("Has acertado el número.");
        } else if (c == 1) {
            System.out.println("Has acertado el color.");
        } else if (p == 1) {
            System.out.println("Has acertado si es par o impar.");
        } else {
            System.out.println("Has perdido.");
        }
    }
}