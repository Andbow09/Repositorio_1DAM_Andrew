package org.example.CajeroAutomatico;

public class SaldoInsuficiente extends Exception {
    public SaldoInsuficiente() {
        super("No es posible retirar el dinero, pues la cantidad excede el saldo actual.");
    }
}
