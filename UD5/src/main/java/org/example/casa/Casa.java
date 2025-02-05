package org.example.casa;
import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    Scanner scanner = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.propietario = new Propietario();
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        System.out.print("Inserte propietario: ");
        String nombre = scanner.next();

        System.out.print("Dime su edad: ");
        int edad = scanner.nextInt();

        propietario = new Propietario();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void agregarHabitacion(String nombre, double metrosCuadrados) {
        for (Habitacion hab : habitaciones) {
            if (hab.getNombre().equals(nombre)) {
                System.out.println("La habitación ya existe");

                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados);
        habitaciones.add(habitacion);
    }

    public void eliminarHabitación(String nombre) {
        for (Habitacion hab : habitaciones) {
            if (hab.getNombre().equals(nombre)) {
                habitaciones.remove(hab);
                System.out.println(hab + " ha sido eliminado correctamente.");

                return;
            } else {
                System.out.println("No es posible eliminar una habitación que no existe");
            }
        }
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones:");

        for (Habitacion hab : habitaciones) {
            System.out.println("- " + hab.getNombre() + " (" + hab.getMetrosCuadrados() + " m2)");
        }
    }

    public Habitacion getHabMasGrande() {
        Habitacion may = habitaciones.get(0);

        for (Habitacion hab : habitaciones) {
            if(hab.getMetrosCuadrados() > may.getMetrosCuadrados()) {
                may = hab;
            }
        }

        return may;
    }


}
