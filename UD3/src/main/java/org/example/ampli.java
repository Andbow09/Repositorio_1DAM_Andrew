package org.example;
import java.util.Scanner;

public class ampli {
    public void ampli() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cuántas letras quieres en la palabra NAVIDAD (separado por una coma):");
        String cant = entrada.next();

        String[] num = cant.split(",");

        String nav = "N,A,V,I,D,A,D";
        String[] nav2 = nav.split(",");

        int[] num_op = new int[7];
        for (int i = 0; i < cant.length(); i++) {
            num_op[i] = Integer.parseInt(num[i]);

            for (int j = 0; j < num_op[i]; j++) {
                System.out.print(nav2[i]);
            }
        }
    }
}
