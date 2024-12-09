package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();

        double conejo = 0;
        double caballo = 0;
        double total = 0;
        double porcentaje_conejo = 0;
        for (int i = 0; i < casos; i++) {
            conejo = scanner.nextFloat();
            caballo = scanner.nextFloat();

            if((conejo < 0 || conejo > 100) || (caballo < 0 || caballo > 100)) {
                return;
            }

            total = conejo + caballo;

            porcentaje_conejo = (conejo / total) * 100;
            int porcentaje = (int) porcentaje_conejo;

            System.out.println(porcentaje);
        }
    }
}