package org.example.Practica2;

/**
 * Excepción personalizada que se lanza cuando una formación táctica es incorrecta.
 */
public class formacionErronea extends Exception {
    /**
     * Constructor que inicializa la excepción con un mensaje de error.
     * @param message Mensaje de error.
     */
    public formacionErronea(String message) {
        super(message);
    }
}
