package org.example;
import java.util.Arrays;
import java.util.Random;

public class duplicado {
    public void dupli() {
        Random random = new Random();

        int num[] = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(49) + 1;
        }

        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        boolean dupli_sort = true;
        while (dupli_sort) {
            dupli_sort = false;

            for (int i = 0; i < num.length; i++) {
                if (i != (num.length - 1) && num[i] == num[i + 1]) {
                    System.out.println("Duplicado: " + num[i]);
                    num[i] = random.nextInt(49) + 1;
                }
            }

            Arrays.sort(num);
        }

        System.out.println(Arrays.toString(num));
    }
}
