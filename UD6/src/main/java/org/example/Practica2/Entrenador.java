package org.example.Practica2;

/**
 * Clase que representa a un entrenador del equipo Mutxamel FC.
 */
public class Entrenador extends MutxamelFC implements AccionesDeportivas, FuncionesIntegrantes {
    private Equipos equipo; // Equipo que entrena.
    private String formacionPreferida; // Formación táctica preferida del entrenador.

    /**
     * Constructor que inicializa un entrenador con su información.
     * @param nombre Nombre del entrenador.
     * @param edad Edad del entrenador.
     * @param equipo Equipo al que entrena.
     * @param formacionPreferida Formación táctica preferida.
     * @throws formacionErronea Si la formación no es válida.
     */
    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) throws formacionErronea {
        super(nombre, edad);
        this.equipo = equipo;
        if (formacionPreferida.matches("\\d-\\d-\\d")) {
            this.formacionPreferida = formacionPreferida;
        } else {
            throw new formacionErronea("La formación " + formacionPreferida + " no es correcta o no existe");
        }
    }

    /**
     * Planifica una sesión de entrenamiento.
     */
    public void planificarEntrenamiento() {
        System.out.println(getNombre() + " ha preparado una intensiva sesión de entrenamiento para sus jugadores.");
    }

    /**
     * Obtiene el nombre del entrenador.
     * @return Nombre del entrenador.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Modifica la estrategia del equipo en un partido.
     */
    public void hacerCambios() {
        System.out.println(getNombre() + " planea una nueva estrategia para el partido.");
    }

    /**
     * Simula un entrenamiento del equipo.
     */
    @Override
    public void entrenar() {
        System.out.println(getNombre() + " entrenando al equipo " + equipo);
    }

    /**
     * Simula la dirección de un partido contra un equipo rival.
     * @param rival Nombre del equipo rival.
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " ha iniciado un partido contra el " + rival);
    }

    /**
     * Simula la concentración del entrenador antes del partido.
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " está listo para liderar su equipo.");
    }

    /**
     * Simula el viaje del entrenador con su equipo.
     * @param ciudad Ciudad de destino.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viaja a " + ciudad + " junto a su equipo.");
    }

    /**
     * Simula la celebración de un gol por parte del entrenador.
     */
    @Override
    public void celebrarGol() {
        System.out.println("VAMOOOS!!!");
    }
}