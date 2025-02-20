package org.example.Abstraccion2;

public class PlanFamiliar extends Suscripcion {
    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 7 días de prueba.");
    }
}