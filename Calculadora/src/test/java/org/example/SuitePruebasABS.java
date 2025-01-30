package org.example;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CalculadoraABSTest.class, //clase principal de las pruebas de Calculadora.
        OtraPrueba.class //otra prueba de ejemplo
})
public class SuitePruebasABS {
}




