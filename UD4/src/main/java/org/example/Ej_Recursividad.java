package org.example;
import java.util.Scanner;

public class Ej_Recursividad {

    static Scanner scanner = new Scanner(System.in);

    public static int fact(int num) {
        int fact = 1;



        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }}

//    public void Main {
//        int num = scanner.nextInt();
//    }
//}
