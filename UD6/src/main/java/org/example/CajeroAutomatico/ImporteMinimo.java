package org.example.CajeroAutomatico;

public class ImporteMinimo extends Exception {
    public ImporteMinimo() {
        super("El importe debe ser mayor a 0.");
    }
}
