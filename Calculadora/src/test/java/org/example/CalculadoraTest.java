package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora calc = new Calculadora(3, 5);
        int valorEsperado = 8;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testResta() {
    }

    @Test
    void testMultiplica() {
    }

    @Test
    void testDivide() {
    }
}