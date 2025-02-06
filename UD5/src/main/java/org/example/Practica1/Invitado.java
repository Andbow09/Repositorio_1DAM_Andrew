package org.example.Practica1;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase Invitado, que contará de un nombre, una profesión, su fecha de visita y la temporada en la que aparecerá.
 */
public class Invitado {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    /**
     * Constructor de la clase Invitado, a la que le pasaremos nombre, profesion y temporada.
     * Por defecto, la fecha de visita será la fecha de creación del invitado.
     * @param nombre
     * @param profesion
     * @param temporada
     */
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = LocalDate.now();
        this.temporada = temporada;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el nombre de el invitado.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el nombre de el invitado.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir la profesion de el invitado.
     * @return
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar la profesion de el invitado.
     * @param profesion
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir la fecha de visita de el invitado.
     * @return
     */
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar la fecha de visita de el invitado.
     * Para esto, pasaremos los parámetros de año, mes y dia por separado mediante teclado.
     * Luego, con esos datos, asignará la fecha de visita del invitado.
     */
    public void setFecha_visita() {
        System.out.println("Introduce el año en el que acudirá el invitado " + getNombre() + ":");
        int anyo = scanner.nextInt(); //anyo será el año de visita.
        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt(); //mes será el mes de visita.
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt(); //dia será el día de visita
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        this.fecha_visita = fecha;
        //usa los parámetros dados anteriormente para construir una fecha con LocalDate.of y asigna su valor al de la fecha de visita.
    }

    /**
     * Llamaremos a este método cuando queramos imprimir la temporada a la que fue un invitado.
     * @return
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar la temporada a la que fue un invitado.
     * @param temporada
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    /**
     * Actualización del toString para que cuando se imprima la cadena, saque todo el contenido que contiene el toString
     * @return
     */
    @Override
    public String toString() {
        return "Invitado [Nombre: " + nombre + ", Profesion: " + profesion + ", Fecha de Visita: " + fecha_visita + ", Temporada: " + temporada + "]";
    }
}
