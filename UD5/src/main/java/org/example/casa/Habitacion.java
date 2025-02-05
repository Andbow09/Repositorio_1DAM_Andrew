package org.example.casa;

import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.electrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void agregarElectrodomestico(String nombre, int consumo) {
        for (Electrodomestico elec : electrodomesticos) {
            if (elec.getNombre().equals(nombre)) {
                System.out.println("El electrodoméstico ya existe");

                return;
            }
        }

        Electrodomestico elec = new Electrodomestico(nombre, consumo);
        electrodomesticos.add(elec);
    }

    public void mostrarElectrodomestico() {
        for (Electrodomestico elec : electrodomesticos) {
            System.out.println(nombre + " tiene " + elec.getNombre() + " con consumo de " + elec.getConsumo() + "kWh");
        }
    }

    public double calcularConsumo() {
        int suma = 0;

        for (Electrodomestico elec : electrodomesticos) {
            suma += elec.getConsumo();
        }

        return suma;
    }

    @Override
    public String toString() {
        return "Habitacion [Nombre: " + nombre + ", Tamaño: " + metrosCuadrados + "]";
    }
}
