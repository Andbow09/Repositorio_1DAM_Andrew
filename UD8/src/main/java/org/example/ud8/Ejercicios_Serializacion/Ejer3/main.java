package org.example.ud8.Ejercicios_Serializacion.Ejer3;

import java.io.*;

public class main {
    public static void main(String[] args) {
        File archivo = new File("archivo_no_accesible.ser");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Persona persona = (Persona) ois.readObject();
            System.out.println("Persona: " + persona);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Creando con datos por defecto...");
            crearArchivoPorDefecto(archivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error leyendo archivo. Creando con datos por defecto...");
            crearArchivoPorDefecto(archivo);
        }
    }

    private static void crearArchivoPorDefecto(File archivo) {
        Persona defecto = new Persona("Default","Default",100);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(defecto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}