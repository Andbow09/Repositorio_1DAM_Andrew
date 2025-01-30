package org.example.casa;

public class AppCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 40);
        casa.agregarHabitacion("Cocina", 35);
        casa.agregarHabitacion("Baño", 10);

        casa.mostrarHabitaciones();

    }
}
