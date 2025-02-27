package org.example.Practica2;

import java.util.ArrayList;

/**
 * Clase que representa a un jugador del equipo Mutxamel FC.
 */
public class Jugador extends MutxamelFC implements FuncionesIntegrantes, AccionesDeportivas {
    private Equipos categoria; // Categoría en la que juega el jugador.
    private int dorsal; // Número de dorsal del jugador.
    private Posiciones posicion; // Posición en la que juega.
    private static ArrayList<Integer> listaDorsales = new ArrayList<>(); // Lista para evitar dorsales repetidos.

    /**
     * Constructor que inicializa un jugador con su información básica.
     * @param nombre Nombre del jugador.
     * @param edad Edad del jugador.
     * @param categoria Categoría en la que juega.
     * @param dorsal Número de dorsal asignado.
     * @param posicion Posición en el campo.
     * @throws MismoDorsal Si el dorsal ya está ocupado.
     */
    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) throws MismoDorsal {
        super(nombre, edad);
        if (listaDorsales.contains(dorsal)) {
            throw new MismoDorsal("El dorsal " + dorsal + " ya está siendo ocupado.");
        }
        listaDorsales.add(dorsal);
    }

    /**
     * Obtiene el nombre del jugador.
     * @return Nombre del jugador.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Simula el calentamiento del jugador.
     */
    public void calentar(){
        System.out.println(getNombre() + " calentando...");
    }

    /**
     * Simula el descanso del jugador.
     */
    public void descansar() {
        System.out.println(getNombre() + " ha comenzado su descanso.");
    }

    /**
     * Simula que el jugador marca un gol.
     */
    public void marcarGol() {
        System.out.println(getNombre() + " MARCÓ UN GOOL.");
    }

    /**
     * Simula un entrenamiento del jugador.
     */
    @Override
    public void entrenar() {
        System.out.println(getNombre() + " comenzó su entrenamiento.");
    }

    /**
     * Simula un partido contra un equipo rival.
     * @param rival Nombre del equipo rival.
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " va a jugar su partido contra el " + rival);
    }

    /**
     * Simula la concentración del jugador antes del partido.
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra para el partido.");
    }

    /**
     * Simula el viaje del jugador a una ciudad específica.
     * @param ciudad Ciudad a la que viaja.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajó a " + ciudad);
    }

    /**
     * Simula la celebración de un gol.
     */
    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + ": SOMOS LOS MEJORES!");
    }
}