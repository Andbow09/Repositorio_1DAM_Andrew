package org.example;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public void ejer1() {
        Random random = new Random();

        int[] num = new int[8];

        int suma = 0;

        for (int i = 0; i <= 8; i++) {
            num[i] = random.nextInt(500) + 1;

            suma += num[i];
        }

        System.out.println("La suma de todos los elementos es: " + suma);
    }

    public void ejer2() {
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[7];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número entero: ");
            num[i] = entrada.nextInt();
        }

        System.out.print("Array invertido: ");

        for (int i = num.length; i >= 0; i--) {
            System.out.print(num[i] + ", ");
        }
    }

    public void ejer3() {
        Random random = new Random();

        Scanner entrada = new Scanner(System.in);

        int[] num = new int[25];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }

        System.out.print("Ingresa un número para buscar [0,100]: ");
        int ing = entrada.nextInt();

        int igual = 0;

        if (ing < 0 || ing > 100) {
            System.out.println("Número inválido");
        } else {
            for (int j = 0; j < num.length; j++) {
                if (num[j] == ing) {
                    igual++;
                }
            }
            System.out.println("El número " + ing + " aparece " + igual + " veces en el array.");
        }
    }

    public void ejer4() {
        Random random = new Random();

        Scanner entrada = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce la posición " + i + ": ");
            num[i] = entrada.nextInt();
        }

        System.out.println(" ");
        System.out.print("Ingresa el índice a eliminar: ");
        int in = entrada.nextInt();

        int j = 0;

        int[] num2 = new int[num.length - 1];
        for (int i = 0; i < num.length; i++) {
            if (i == in) {
                continue;
            } else {
                num2[j] = num[i];
                j++;
            }
        }

        System.out.print("Array resultante: ");
        for (int i : num2) {
            System.out.print(i + ", ");
        }
    }

    public void ejer5() {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres crear?: ");
        int arr = entrada.nextInt();

        int[] num = new int[arr];

        System.out.print("Array original: ");
        for (int i : num) {
            num[i] = random.nextInt(10) + 1;
            System.out.print(num[i] + ", ");
        }

        int j = 0;
        System.out.println(" ");
        System.out.print("Array rotado: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = num[num.length];
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ", ");
                j++;
            }
        }
    }

    public void ejer6() {

    }

    public void ejer7() {

    }

    public void ejer8() {

    }

    public void ejer9() {

    }

    public void ejer10() {

    }
}
