package org.example.Abstraccion2;

public class PlanPremium extends Suscripcion {
    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 14 días de prueba.");
    }
}