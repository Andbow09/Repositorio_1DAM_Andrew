package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraABSTest {
    private Calculadora calc;

    @BeforeEach
    public void inicioPruebas() {
        calc = new Calculadora(15, 5);
    }

    @AfterEach
    public void finPruebas() {
        calc = null;
    }

    @Test
    void testSuma() {
        int valorEsperado = 20;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testSumaValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5);
        int valorEsperado = num + 5;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 3",
            "2, 2, 4",
            "3, 2, 5",
            "-1, -2, -3"
    })
    public void testSumaCvsSource(int a, int b, int valorEsperado) {
        Calculadora calc = new Calculadora(a, b);
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testResta() {
        int valorEsperado = 10;
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,6,7,8,9})
    public void testRestaValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5);
        int valorEsperado = num - 5;
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 1",
            "2, 2, 0",
            "3, 2, 1",
            "-1, -2, 1"
    })
    public void testRestaConCvsSource(int a, int b, int valorEsperado) {
        Calculadora calc = new Calculadora(a, b);
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testMultiplica() {
        int valorEsperado = 75;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,4,3,2,1})
    public void testMultiplicaValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5);
        int valorEsperado = num * 5;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 2",
            "2, 2, 4",
            "3, 2, 6",
            "-1, -2, 2"
    })
    public void testMultiplicaCvsSource(int a, int b, int valorEsperado) {
        Calculadora calc = new Calculadora(a, b);
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testDivide() {
        int valorEsperado = 3;
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {30,25,20,15,10})
    public void testDivideValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5);
        int valorEsperado = num / 5;
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 2",
            "2, 2, 1",
            "6, 2, 3",
            "-2, -1, 2"
    })
    public void testDivideCvsSource(int a, int b, int valorEsperado) {
        Calculadora calc = new Calculadora(a, b);
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void testDivideExcepcion() {
        Calculadora calc = new Calculadora(15, 0);
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