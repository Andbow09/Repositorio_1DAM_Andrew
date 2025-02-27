package org.example.Practica2;

/**
 * Excepción personalizada que se lanza cuando un dorsal ya está ocupado por otro jugador.
 */
public class MismoDorsal extends Exception {
    /**
     * Constructor que inicializa la excepción con un mensaje de error.
     * @param message Mensaje de error.
     */
    public MismoDorsal(String message) {
        super(message);
    }
}
