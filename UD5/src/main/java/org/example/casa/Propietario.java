package org.example.casa;

public class Propietario {
    private String nombre;
    private int edad;

    public Propietario() {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Propietario [Nombre:" + nombre + ", Edad:" + edad + "]";
    }
}
