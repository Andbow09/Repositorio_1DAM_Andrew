package org.example.ud8.Ejercicios_Serializacion.Ejer4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        HashMap<String,Persona> mapa = new HashMap<>();
        mapa.put("p1",new Persona("Julian","Niñero",20));
        mapa.put("p2",new Persona("Loana","Carpintera",35));
        mapa.put("p3",new Persona("Pedro","Cocinero",29));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("mapa.ser"))) {
            out.writeObject(mapa);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<String,Persona> mapa2 = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("mapa.ser"))) {
            mapa2 = (HashMap<String,Persona>) in.readObject();
            TreeMap<String, Persona> ordenado = new TreeMap<>(mapa2);

            System.out.println("Contenido ordenado por claves:");
            for (Map.Entry<String, Persona> entrada : ordenado.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
