package org.example.ud8.Ejercicios_Serializacion.Ejer1;

import java.io.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Javier","Obrero",37));
        listaPersonas.add(new Persona("Olga","Profesora",29));
        listaPersonas.add(new Persona("Pablo","Deportista",30));

        System.out.println("Lista normal: ");
        for (Persona p : listaPersonas) {
            System.out.println(p);
        }

        serializar(listaPersonas);

        deserializar();
    }

    public static void serializar(ArrayList<Persona> listaPersonas) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("listaPersonas.ser"))) {
            out.writeObject(listaPersonas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        ArrayList<Persona> listaDeserializada = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("listaPersonas.ser"))) {
            listaDeserializada = (ArrayList<Persona>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nLista deserializada: ");
        for (Persona p : listaDeserializada) {
            System.out.println(p);
        }
    }
}