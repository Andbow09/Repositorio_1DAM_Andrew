package org.example.ud8.Ejercicios_Serializacion.Ejer3;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String profesion;
    private int edad;

    public Persona(String nombre, String profesion, int edad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getEdad() + " años) trabaja de " + getProfesion() + ".";
    }
}