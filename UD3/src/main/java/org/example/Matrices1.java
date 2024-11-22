package org.example;
import java.util.Random;
import java.util.Scanner;

public class Matrices1 {
    public void ejer1() {
        Scanner entrada = new Scanner(System.in);

        int mat[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor de la posición " + i + " de la fila " + j + ": ");
                mat[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println(" ");
        }

        System.out.print("Introduce el valor a encontrar en la matriz: ");
        int valor = entrada.nextInt();

        int fallos = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == valor) {
                    System.out.println("El número " + valor + " se encuentra en la posición (" + i + "," + j + ").");
                    return;
                } else {
                    fallos++;
                }
                if (fallos == 9) {
                    System.out.println("El número " + valor + " no se ha encontrado en la matriz.");
                    return;
                }
            }
        }

    }
    public void ejer2() {
        Random random = new Random();

        int filas = random.nextInt(5) + 1;
        int columnas = random.nextInt(5) + 1;

        int mat[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mat[i][j] = random.nextInt(15) + 1;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println(" ");
        }

        System.out.println(" ");

        System.out.println("Suma de filas:");
        int suma_filas = 0;
        for (int i = 0; i < mat.length; i++) {
            suma_filas = 0;

            for (int j = 0; j < mat[i].length; j++) {
                suma_filas += mat[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + suma_filas);
        }

        System.out.println(" ");

        System.out.println("Suma de columnas:");
        int suma_columnas = 0;
        for (int i = 0; i < mat[0].length; i++) {
            suma_columnas = 0;

            for (int j = 0; j < mat.length; j++) {
                suma_columnas += mat[j][i];
            }
            System.out.println("Columna " + (i + 1) + ": " + suma_columnas);
        }
    }
    public void ejer3(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos alumnos tienes? ");
        int st_cant = entrada.nextInt();

        System.out.print("¿Cuántas asignaturas hay? ");
        int sign_cant = entrada.nextInt();

        String matriz[][] = new String[st_cant+1][sign_cant+1];

        for (int i = 0; i < st_cant; i++) {
            System.out.println("Introduce el nombre del estudiante " + (i + 1) + ":");
            matriz[i+1][0] = entrada.next();
        }

        for (int i = 0; i < sign_cant; i++) {
            System.out.println("Introduce la asignatura " + (i + 1) + ":");
            matriz[0][i+1] = entrada.next();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println(" ");
        }
    }
}
