package org.example.Abstraccion2;

public class PlanGratis extends Suscripcion {
    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: Sin periodo de prueba.");
    }
}
