package org.example.CajeroAutomatico;

public class DepositoMaximo extends Exception {
    public DepositoMaximo() {
        super("Has superado el límite de ingreso establecido.");
    }
}
