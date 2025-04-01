package org.example.HashMap.EspIng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    private HashMap<String,String> dict = new HashMap<>();

    public Diccionario() {
        dict.put("","");
    }

    public void nuevoPar(String esp, String ing) {
        dict.put(esp,ing);
        System.out.println("Palabra '" + esp + "' añadida al diccionario.");
    }

    public void traduce(String esp) {
        if (dict.containsKey(esp)) {
            System.out.println("Traducción de " + esp + ": " + dict.get(esp));
        } else {
            System.out.println("El diccionario no dispone de la traducción para esa palabra.");
        }
    }

    public void palabraAleatoria() {
        Random random = new Random();

        ArrayList<String> listaPal = new ArrayList<>();
        for (String palabra : dict.keySet()) {
            listaPal.add(palabra);
        }

        int alt = random.nextInt(0,listaPal.size());

        if (alt == listaPal.indexOf(alt)) {

        }
    }

    public void cuestionario(String respuesta) {

    }
}
