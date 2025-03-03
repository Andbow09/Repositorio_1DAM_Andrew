package org.example.Practica2;

/**
 * Clase abstracta que representa a un integrante del equipo Mutxamel FC.
 */
public abstract class MutxamelFC implements FuncionesIntegrantes {
    String nombre; // Nombre del integrante.
    private int edad; // Edad del integrante.

    /**
     * Constructor que inicializa un integrante del equipo con su nombre y edad.
     * @param nombre Nombre del integrante.
     * @param edad Edad del integrante.
     */
    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del integrante.
     * @return Nombre del integrante.
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del integrante.
     * @return Edad del integrante.
     */
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
