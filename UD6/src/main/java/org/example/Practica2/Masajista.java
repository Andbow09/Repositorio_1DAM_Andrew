package org.example.Practica2;

/**
 * Clase que representa a un masajista del equipo Mutxamel FC.
 */
public class Masajista extends MutxamelFC implements FuncionesIntegrantes {
    private String titulacion; // Titulación del masajista.
    private int anosExperiencia; // Años de experiencia del masajista.

    /**
     * Constructor que inicializa un masajista con su información.
     * @param nombre Nombre del masajista.
     * @param edad Edad del masajista.
     * @param titulacion Titulación profesional del masajista.
     * @param anosExperiencia Años de experiencia del masajista.
     */
    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    /**
     * Obtiene el nombre del masajista.
     * @return Nombre del masajista.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Obtiene los años de experiencia del masajista.
     * @return Años de experiencia del masajista.
     */
    public int getAnosExperiencia() {
        return this.anosExperiencia;
    }

    /**
     * Simula que el masajista da un masaje a un jugador.
     * @param jugador Jugador que recibe el masaje.
     */
    public void darMasaje(Jugador jugador) {
        System.out.println("Masajista " + getNombre() + " dando un masaje a " + jugador.getNombre() + " increíble gracias a sus " + getAnosExperiencia() + " años de experiencia.");
    }

    /**
     * Simula la concentración del masajista antes del partido.
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra en su movimiento de manos para dar un grandioso masaje.");
    }

    /**
     * Simula el viaje del masajista con el equipo.
     * @param ciudad Ciudad de destino.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajó junto al equipo a " + ciudad);
    }

    /**
     * Simula la celebración de un gol por parte del masajista.
     */
    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + ": toma!!.");
    }
}
