package org.example.casa;

public class AppCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 40.9);
        casa.agregarHabitacion("Cocina", 35.2);
        casa.agregarHabitacion("Baño", 10.6);

        casa.mostrarHabitaciones();
        System.out.println(casa.getHabMasGrande());

        casa.agregarHabitacion("Baño", 10);
        casa.mostrarHabitaciones();
        casa.eliminarHabitación("Baño");
        casa.mostrarHabitaciones();

        casa.getHabitaciones().get(1).agregarElectrodomestico("calefaccion", 36);
        casa.getHabitaciones().get(1).agregarElectrodomestico("microondas", 28);
        casa.getHabitaciones().get(1).agregarElectrodomestico("nevera", 42);
        casa.getHabitaciones().get(1).mostrarElectrodomestico();
        System.out.println(casa.getHabitaciones().get(1).calcularConsumo());

    }
}
