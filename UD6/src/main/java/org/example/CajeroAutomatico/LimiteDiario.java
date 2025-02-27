package org.example.CajeroAutomatico;

public class LimiteDiario extends Exception {
    public LimiteDiario() {
        super("Has superado el límite de retiro establecido.");
    }
}
