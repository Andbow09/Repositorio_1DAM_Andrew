package org.example.Abstraccion2;

public class PlataformaStreaming {
    public static void main(String[] args) {
        Suscripcion[] planes = {
                new PlanGratis("Gratis",0.0),
                new PlanBasico("Básico",9.99),
                new PlanPremium("Premium",14.99),
                new PlanFamiliar("Familiar",19.99)
        };

        for (Suscripcion sus : planes) {
            sus.mostrarInfo();
            sus.obtenerBeneficios();
            sus.obtenerPeriodoPrueba();
        }
    }
}