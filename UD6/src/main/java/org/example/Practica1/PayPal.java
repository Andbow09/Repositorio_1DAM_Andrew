package org.example.Practica1;

/**
 * Clase que representa el metodo de pago con PayPal.
 */
public class PayPal extends MetodoPago {
    private String cuenta; // Dirección de correo de la cuenta PayPal.
    private double saldo = 23.00; // Saldo inicial.

    /**
     * Constructor que inicializa la cuenta de PayPal.
     * @param cuenta Dirección de correo de la cuenta PayPal.
     */
    public PayPal(String cuenta) {
        this.cuenta = validarPayPal(cuenta);
    }

    /**
     * Valida el formato del correo de la cuenta de PayPal.
     * @param cuenta Dirección de correo de la cuenta PayPal.
     * @return La cuenta si es válida, nulo en caso contrario.
     */
    public String validarPayPal(String cuenta) {
        // Verifica si la cuenta tiene un formato válido
        if (cuenta.matches(".*@*\\.com")) {
            return cuenta;
        }
        return null;
    }

    /**
     * Valida si el saldo es suficiente para realizar el pago.
     * @param importe Cantidad de dinero a pagar.
     * @return Verdadero si el saldo es suficiente, falso en caso contrario.
     */
    public boolean validarSaldo(double importe) {
        // Verifica si el saldo es suficiente, es decir, mayor o igual al importe a realizar.
        if (this.saldo < importe) {
            System.out.println("El saldo no es suficiente para poder realizar el pago.");
            return false;
        }
        return true;
    }

    /**
     * Procesa el pago con PayPal.
     * @param importe a procesar.
     */
    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal.");
    }
}