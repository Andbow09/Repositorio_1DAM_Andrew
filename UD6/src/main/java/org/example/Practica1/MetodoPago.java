package org.example.Practica1;

/**
 * Clase abstracta que representa un metodo de pago.
 * Las clases derivadas deben implementar el metodo procesarPago.
 */
abstract class MetodoPago {

    /**
     * Metodo abstracto para procesar el pago.
     * @param importe Cantidad de dinero a procesar.
     */
    abstract void procesarPago(double importe);
}