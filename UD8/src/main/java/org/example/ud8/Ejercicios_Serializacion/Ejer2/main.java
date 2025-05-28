package org.example.ud8.Ejercicios_Serializacion.Ejer2;

import java.io.*;

public class main {
    public static void main(String[] args) {
        Persona persona = new Persona("Javier","Obrero",37);

        System.out.println("Persona normal: " + persona);

        serializar(persona);

        deserializar();
    }

    public static void serializar(Persona persona) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personas.ser"))) {
            out.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        Persona p = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("personas.ser"))) {
            p = (Persona) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nPersona deserializada con atributo transient: " + p);
    }
}