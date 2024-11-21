package org.example;
import java.util.Random;

public class Ramp {
    public void ramp() {
        Random altr = new Random();

        int num = altr.nextInt();
        System.out.println(num);

        num = altr.nextInt(3) + 1;
        System.out.println(num);

        double num2 = altr.nextDouble();
        System.out.println(num2);

        num2 = altr.nextDouble()* 6 + 1;
        System.out.println(num2);

        num = (int) altr.nextDouble()* 6 + 1;
        System.out.println(num);

        num2 = Math.random();
        System.out.println(num2);
    }
}