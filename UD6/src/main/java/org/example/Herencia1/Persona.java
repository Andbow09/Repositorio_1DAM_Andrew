package org.example.Herencia1;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadValida {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) throws EdadValida {
        if (edad < 18) {
            throw new EdadValida();
        } else {
            this.edad = edad;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento() {
        System.out.println("Accediendo al evento...");
    }
}
