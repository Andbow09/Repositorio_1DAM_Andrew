package org.example.casa;
import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String nombre, double metrosCuadrados) {
        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene las siguientes habitaciones: " + habitaciones);
    }
}
