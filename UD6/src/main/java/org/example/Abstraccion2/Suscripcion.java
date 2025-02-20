package org.example.Abstraccion2;

abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Plan: " + nombrePlan);
        System.out.println("Precio: " + precio);
    }

    abstract void obtenerBeneficios();

    abstract void obtenerPeriodoPrueba();
}
