package org.example.Practica1;
import java.util.ArrayList;

/**
 * Clase Cadena, cada Cadena tendrá un nombre y una lista de programas que tiene, dichos programas se irán añadiendo a la lista cada vez que se creen.
 */
public class Cadena {
    private String nombre; //Atributo nombre.
    private ArrayList<Programa> listaProgramas; //Lista de programas. Esta lista funciona como enlace con la clase Programa.

    /**
     * Constructor de la clase Cadena a la que le pasamos su nombre para crear la cadena.
     * @param nombre
     */
    public Cadena(String nombre) {
        this.nombre = nombre; //Se asigna como nombre de la cadena lo que le pasemos por el constructor.
        this.listaProgramas = new ArrayList<>(); //Creamos junto con la cadena una lista de programas vacía.
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el nombre de la cadena.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Llamaremos a este método cuando queramos ver el nombre del programa.
     * @return
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el listado de programas.
     * @param listaProgramas
     */
    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    /**
     * Llamaremos a este método cuando queramos ver el listado de programas.
     * @return
     */
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    /**
     *  Llamaremos a este método cuando queramos añadir un programa a una cadena.
     * @param prog
     */
    public void agregarPrograma(Programa prog) {
        listaProgramas.add(prog);
    }

    /**
     * Actualización del toString para que cuando se imprima la cadena, saque todo el contenido que contiene el toString
     * @return
     */
    @Override
    public String toString() {
        return "Cadena [Nombre: " + nombre + ", Lista de Programas: " + listaProgramas + "]";
    }
}
