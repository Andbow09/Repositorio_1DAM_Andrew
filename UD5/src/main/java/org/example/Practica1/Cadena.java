package org.example.Practica1;
import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void agregarPrograma(Programa prog) {
        listaProgramas.add(prog);
    }

    @Override
    public String toString() {
        return "Cadena [Nombre: " + nombre + ", Lista de Programas: " + listaProgramas + "]";
    }
}
