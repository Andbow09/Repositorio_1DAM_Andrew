package org.example.Practica2;

/**
 * Interfaz que define las acciones deportivas que puede realizar un integrante del equipo.
 */
public interface AccionesDeportivas {
    /**
     * Simula un entrenamiento.
     */
    void entrenar();

    /**
     * Simula la participación en un partido.
     * @param rival Nombre del equipo rival.
     */
    void jugarPartido(String rival);
}
