package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class tablaTest {

    @Test
    void validar() {
        assertAll(
                () -> assertTrue(tabla.validar(7)),
                () -> assertTrue(tabla.validar(5)),
                () -> assertFalse(tabla.validar(-3)),
                () -> assertFalse(tabla.validar(37))
        );
    }

    @Test
    void cuadrado() {
        assertAll(
                () -> assertEquals(64,tabla.cuadrado(8)),
                () -> assertEquals(9,tabla.cuadrado(3))
        );
    }
}