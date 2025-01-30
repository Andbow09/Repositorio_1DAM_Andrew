package org.example.casa;

public class Habitacion {
    private String nombre;
    private float metrosCuadrados;

    public Habitacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Habitacion [Nombre: " + nombre + ", Tamaño: " + metrosCuadrados + "]";
    }
}
