package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraABSTest {

    @Test
    void testSuma() {
        Calculadora calc = new Calculadora(3, 5);
        int valorEsperado = 8;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testResta() {
        Calculadora calc = new Calculadora(8, 2);
        int valorEsperado = 6;
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testMultiplica() {
        Calculadora calc = new Calculadora(2, 4);
        int valorEsperado = 8;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testDivide() {
        Calculadora calc = new Calculadora(15, 5);
        int valorEsperado = 3;
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testDivideExcepcion() {
        Calculadora calc = new Calculadora(15, "prueba");
        String valorEsperado = "División por 0";
        String valorDevuelto = "";

        try{
            calc.divide();
        } catch (ArithmeticException e) {
            valorDevuelto = e.getMessage();
        }

        assertEquals(valorEsperado, valorDevuelto);
    }
}