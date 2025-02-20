package org.example.Practica1;

import java.util.Random;

/**
 * Clase que representa el metodo de pago con Bizum.
 */
public class Bizum extends MetodoPago {
    Random random = new Random();

    private String telefono; // Número de teléfono asociado al Bizum
    private int pin; // PIN para autenticar la transacción.

    /**
     * Constructor que inicializa el teléfono y el PIN para Bizum, este se generará automáticamente con un número aleatorio.
     * @param telefono Número de teléfono asociado a Bizum.
     */
    public Bizum(String telefono) {
        this.telefono = validarTelefono(telefono);
        this.pin = random.nextInt(100000, 999999); // Genera un PIN aleatorio de 6 dígitos
    }

    /**
     * Obtiene el PIN de la cuenta Bizum.
     * @return pin.
     */
    public int getPin() {
        return this.pin;
    }

    /**
     * Actualiza el pin de una cuenta de bizum en específico con el que le pases.
     * @param pin Nuevo pin de la cuenta Bizum.
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * Valida el número de teléfono verificando que tenga 9 dígitos.
     * @param telefono Número de teléfono a validar.
     * @return El número de teléfono si es válido, nulo en caso contrario.
     */
    public String validarTelefono(String telefono) {
        // Verifica si el número de teléfono tiene 9 dígitos.
        if (telefono.matches("\\d{9}")) {
            return telefono;
        }
        return null;
    }

    /**
     * Valida el PIN.
     * @param pin PIN a validar.
     * @return El PIN si es válido, 0 en caso contrario.
     */
    public int validarPin(int pin) {
        // Verifica si el PIN es igual al que se le pasa por teclado, si es igual devuelve el pin, si no, devuelve 0.
        if (this.pin == pin) {
            return pin;
        }
        return 0;
    }

    /**
     * Valida los datos de Bizum (teléfono y PIN) llamando a validarTelefono y validarPin.
     * @param telefono Número de teléfono.
     * @param pin PIN.
     * @return Verdadero si ambos datos son válidos, falso en caso contrario.
     */
    public boolean validarBizum(String telefono, int pin) {
        // Verifica el número de teléfono y el PIN
        validarTelefono(telefono);
        validarPin(pin);

        // Si alguno es nulo o incorrecto, la validación falla y devuelve false, si no, true.
        if (validarTelefono(telefono) == null || validarPin(pin) == 0) {
            return false;
        }
        return true;
    }

    /**
     * Procesa el pago con Bizum.
     * @param importe a procesar.
     */
    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum.");
    }
}