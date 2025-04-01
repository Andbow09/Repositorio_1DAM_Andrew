package org.example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa = new HashMap<>();

        mapa.put("Adrián",3);
        mapa.put("Raúl",6);
        mapa.put("Manuel",7);

        System.out.println("Nota de Adrián: " + mapa.get("Adrián"));
        System.out.println("Nota de Raúl: " + mapa.get("Raúl"));

        mapa.put("Adrián",4);
        System.out.println("Nota de Adrián: " + mapa.get("Adrián"));

        System.out.println(mapa);
        mapa.remove("Manuel");
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

        if (mapa.containsKey("Adrián")) {
            System.out.println("Adrián existe.");
        } else {
            System.out.println("Adrián no existe.");
        }

        if (mapa.containsValue(10)) {
            System.out.println("Alguien tiene un diez.");
        } else {
            System.out.println("Nadie tiene un diez.");
        }

        for (String clave : mapa.keySet()) {
            System.out.println("Clave: " + clave);
        }

        for (Integer nota : mapa.values()) {
            System.out.println("Nota: " + nota);
        }

        for (Map.Entry<String,Integer> alumnos : mapa.entrySet()) {
            System.out.println(alumnos);
        }
    }
}
