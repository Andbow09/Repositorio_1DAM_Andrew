package org.example;
import java.util.Scanner;

public class Anid {
    public void anid1() {
        //a)
        //  suma  |   i   |   j   | salida
        //---------------------------------
        //    0   |   0   |   3   |   3
        //    3   |   1   |   2   |   2
        //    2   |   2   |   1   |   1
        //    1   |   3   |   0   |   13
        //   13   |   4   |   3   |   12
        //   12   |       |   2   |   11
        //   11   |       |   1   |   23
        //   23   |       |   0   |   22
        //   22   |       |   3   |   21
        //   21   |       |   2   |   33
        //   33   |       |   1   |   32
        //   32   |       |   0   |   31
        //   31   |       |   3   |
        //        |       |   2   |
        //        |       |   1   |
        //        |       |   0   |

        //b)
        //   j   |   i   | salida
        //------------------------
        //   0   |   0   |   0
        //   1   |   1   |   1
        //   2   |   2   |   1
        //   2   |   3
        //   3   |
        //   4
    }
    public void anid2() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce altura: ");
        int alt = entrada.nextInt();

        for (int i = 1; i <= alt; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
    public void anid3() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "*" + i + "= " + (j*i));
            }
        }
    }
    public void anid4() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el valor 'm': ");
        int m = entrada.nextInt();

        System.out.print("Números primos: ");

        bucle1:
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue bucle1;
                }
            }
            System.out.print(i + " ");
        }
    }
}
