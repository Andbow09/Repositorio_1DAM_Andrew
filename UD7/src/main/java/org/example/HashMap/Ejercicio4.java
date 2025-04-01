package org.example.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,Integer> votaciones = new HashMap<>();

        System.out.println("Introduce las votaciones:");

        ArrayList<String> nombres = new ArrayList<>();
        String voto = "";
        while (!voto.toLowerCase().equals("fin")) {
            voto = scanner.next();

            if (voto.toLowerCase().equals("fin")) {
                continue;
            } else {
                nombres.add(voto);
            }
        }

        for (String nom : nombres) {
            votaciones.put(nom, (votaciones.getOrDefault(nom,0) + 1));
        }

        System.out.println("\nResultados:");
        for (Map.Entry<String,Integer> map : votaciones.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue() + " votos.");
        }
    }
}