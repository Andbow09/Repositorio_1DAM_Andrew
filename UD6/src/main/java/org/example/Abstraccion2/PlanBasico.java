package org.example.Abstraccion2;

public class PlanBasico extends Suscripcion {
    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 30 días de prueba.");
    }
}
