package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica1 {
    public void practica1() {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Equipo 1: ");
        System.out.print("Introduce potencia de los samuráis: ");
        String pot1 = entrada.next(); //introducimos la potencia de los samuráis del equipo 1.
        String[] sam1 = pot1.split(","); //los valores introducidos deben estar separados por comas, si es así, guardará dichos valores en un array.

        if (sam1.length != 7) {
            System.out.println("Tiene que haber 7 samuráis por equipo."); //Comprueba que hayas introducido 7 samuráis.
            return;
        }
        int num = 0;
        int suma = 0;

        int[] sam1_op = new int[7]; //Creamos un array vacío con 7 espacios.

        for (int i = 0; i < sam1_op.length; i++) {
            sam1_op[i] = Integer.parseInt(sam1[i]); //Guardamos en el array anteriormente creado los valores numéricos del array del equipo 1 convirtiendolos de string a int.
            suma = sam1_op[i] + num;
            num = suma; //sumamos consecutivamente los valores del array nuevo y lo guardamos en una variable nueva.
        }
        if (suma != 30) {
            System.out.println("ERROR. La potencia total no suma 30."); //saltará error si el valor de la suma hecha no da 30.
        } else {
            System.out.println("Equipo completado.");
            System.out.println("Equipo 2: ");
            System.out.print("Introduce potencia de los samurais: "); //hacemos los mismo con el equipo 2.
            String pot2 = entrada.next();
            String[] sam2 = pot2.split(",");

            if (sam2.length != 7) {
                System.out.println("Tiene que haber 7 samuráis por equipo.");
            } else {
                int num2 = 0;
                int suma2 = 0;

                int[] sam2_op = new int[7];
                for (int i = 0; i < sam2_op.length; i++) {
                    sam2_op[i] = Integer.parseInt(sam2[i]);
                    suma2 = sam2_op[i] + num2;
                    num2 = suma2;
                }
                if (suma2 != 30) {
                    System.out.println("ERROR. La potencia total no suma 30.");
                } else {
                    System.out.println("Equipo completado.");
                    System.out.println("¡Empieza la batalla!");

                    int sam_rand = random.nextInt(7); //creamos una variable numérica que contenga un número random del 0 al 6, para saber con qué samurái vamos a comenzar la batalla.

                    System.out.println("La batalla empieza con el Samurai Nº" + sam_rand);

                    int bajas1 = 0;
                    int bajas2 = 0;
                    int total = 0; //creamos variables que contengan el número de bajas por equipo.
                    for (int i = 0; i < 7; i++) { //Este es un bucle que se repetirá 7 veces, 1 vez por cada samurai.
                        if (sam_rand == 7) {
                            sam_rand = 0; //verifica que el samurai con el que se empieza no sea el número 7. ya que éste se sale del rango del array, y si lo hace, el valor de el samurai inicial será 0.
                        }
                        if (sam1_op[sam_rand] > sam2_op[sam_rand]) {
                            System.out.println("Samurai " + (sam_rand+1) + ". Gana Equipo 1. " + sam1_op[sam_rand] + " vs " + sam2_op[sam_rand]);
                            bajas2++; //cuando el samurai del equipo 1 gana, salta un mensaje y el número de bajas del equipo 2 se incrementa en 1.
                        } else if (sam2_op[sam_rand] > sam1_op[sam_rand]) {
                            System.out.println("Samurai " + (sam_rand+1) + ". Gana Equipo 2. " + sam1_op[sam_rand] + " vs " + sam2_op[sam_rand]);
                            bajas1++;//cuando el samurai del equipo 2 gana, salta un mensaje y el número de bajas del equipo 1 se incrementa en 1.
                        } else {
                            System.out.println("Samurai " + (sam_rand+1) + ". EMPATE. " + sam1_op[sam_rand] + " vs " + sam2_op[sam_rand]);
                            bajas1++;
                            bajas2++; //en caso de empate, el número de bajas de ambos equipos se incrementa en 1.
                        }
                        sam_rand++; //la variable que contiene el samurái con el que se empieza se incrementa en 1 por cada vez que el bucle se repite, para que cada turno sea el samurai siguiente.
                    }

                    if (bajas1 > bajas2) {
                        System.out.println("¡Equipo 2 gana! Equipo 1 ha tenido " + bajas1 + " bajas.");
                    } else if (bajas2 > bajas1) {
                        System.out.println("¡Equipo 1 gana! Equipo 2 ha tenido " + bajas2 + " bajas.");
                    } else {
                        System.out.println("¡Empate!"); //compara el número de bajas de ambos equipos, y dictamina un ganador en base a quien tenga menos bajas.
                    }
                }
            }
        }
    }
}