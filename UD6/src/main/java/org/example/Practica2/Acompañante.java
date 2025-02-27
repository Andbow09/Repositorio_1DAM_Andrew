package org.example.Practica2;

/**
 * Clase que representa a un acompañante de un jugador del equipo Mutxamel FC.
 */
public class Acompañante extends MutxamelFC implements FuncionesIntegrantes {
    private Jugador integrante; // Jugador al que acompaña.
    private String parentesco; // Relación del acompañante con el jugador.

    /**
     * Constructor que inicializa un acompañante con su información.
     * @param nombre Nombre del acompañante.
     * @param edad Edad del acompañante.
     * @param integrante Jugador al que acompaña.
     * @param parentesco Relación con el jugador.
     */
    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    /**
     * Obtiene el nombre del acompañante.
     * @return Nombre del acompañante.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Simula que el acompañante anima al equipo.
     */
    public void animarEquipo() {
        System.out.println(getNombre() + " animando al equipo de " + integrante.getNombre());
    }

    /**
     * Simula la concentración del acompañante antes del partido.
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " está expectante al partido.");
    }

    /**
     * Simula el viaje del acompañante a una ciudad.
     * @param ciudad Ciudad a la que viaja.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viaja a " + ciudad + " para animar a " + integrante.getNombre());
    }

    /**
     * Simula la celebración de un gol por parte del acompañante.
     */
    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL");
    }
}
