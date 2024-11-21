package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2 {
    public void practica2() {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce los números con los que vas a jugar: ");
        String num = entrada.next();

        boolean formato = num.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

        String[] num_jugador;
        if (!formato) {
            System.out.println("Formato incorrecto.");
            return;
        } else {
            num_jugador = num.split("[-/]");
            System.out.println(Arrays.toString(num_jugador));
        }

        int[] sorteo = new int[6];

        int[] nodup;
        do {
            for (int i = 0; i < sorteo.length; i++) {
                sorteo[i] = random.nextInt(49) + 1;
            }

            Arrays.sort(sorteo);

            nodup = Arrays.stream(sorteo).distinct().toArray();
        } while (nodup.length != 6);

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(sorteo));

        int comp = random.nextInt(49) + 1;
        System.out.println("Complementario: " + comp);

        int r = random.nextInt(10);
        System.out.println("Reintegro: " + r);

        int segunda = 0;
        int premio = 0;
        int j = 0;

        while (j != 6) {
            for (int i = 0; i < num_jugador.length-1; i++) {
                int intento = Integer.parseInt(num_jugador[i]);
                if (intento == sorteo[j]) {
                    premio++;
                } else if (num_jugador[6].equals(comp)) {
                    segunda++;
                }
            }
            j++;
        }
        System.out.println("RESULTADOS:");
        if (num_jugador[6].equals(r)) {
            System.out.println(premio + " acierto");
            System.out.println("Reintegro");
        } else if (premio == 3) {
            System.out.println(premio + " aciertos");
            System.out.println("5ª Categoría");
        } else if (premio == 4) {
            System.out.println(premio + " aciertos");
            System.out.println("4ª Categoría");
        } else if (premio == 5) {
            System.out.println(premio + " aciertos");
            System.out.println("3ª Categoría");
        } else if (premio == 5 && segunda == 1) {
            System.out.println(premio + " aciertos + complementario");
            System.out.println("2ª Categoría");
        } else if (premio == 6) {
            System.out.println(premio + " aciertos");
            System.out.println("1ª Categoría");
        } else if (premio == 6 && num_jugador[6].equals(r)) {
            System.out.println((premio + 1) + " aciertos");
            System.out.println("Categoría Especial");
        } else {
            System.out.println("No premiado");
        }
    }
}