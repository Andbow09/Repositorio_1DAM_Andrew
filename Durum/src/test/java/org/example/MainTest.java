package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void introducirConejo() {
        int conejo = 40;
        int caballo = 60;

        double total = conejo + caballo;
        double porcentajeConejo = (conejo / total) * 100;

        assertEquals(40, (int) porcentajeConejo); // El porcentaje debe ser 40%
    }

    @Test
    void introducirCarne() {
        String input = "30 70";
        String[] carne = input.split(" ");


        assertEquals("30", carne[0]);
        assertEquals("70", carne[1]);


        int conejo = Integer.parseInt(carne[0]);
        int caballo = Integer.parseInt(carne[1]);

        double total = conejo + caballo;
        double porcentajeConejo = (conejo / total) * 100;

        assertEquals(30, (int) porcentajeConejo);
    }

    @Test
    public void testIntroducirCarneEntradaIncorrecta() {
        String input = "30 70 50";
        String[] carne = input.split(" ");

        assertNotEquals(2, carne.length, "Debe haber exactamente dos valores para carne.");
    }

    @Test
    public void testCalcularConejoRangoIncorrecto() {
        int conejo = 120;
        int caballo = 50;
        double total = conejo + caballo;
        double porcentajeConejo = (conejo / total) * 100;

        assertTrue(conejo <= 100 && conejo > 0, "La cantidad de carne debe estar entre 0 y 100.");
        assertTrue(caballo <= 100 && caballo > 0, "La cantidad de carne debe estar entre 0 y 100.");
    }
}