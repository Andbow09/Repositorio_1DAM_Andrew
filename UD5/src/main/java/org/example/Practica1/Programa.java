package org.example.Practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas, Empleado director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.director = director;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados.add(director);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void agregarEmpleado(String nombre, String cargo) {
        Empleado emp = new Empleado(nombre, cargo);
        emp.setDirector(director);
        listaEmpleados.add(emp);
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public void agregarInvitado(String nombre, String profesion, LocalDate fecha_visita, int temporada) {
        Invitado inv = new Invitado(nombre, profesion, fecha_visita, temporada);
        listaInvitados.add(inv);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa [Nombre: " + nombre + ", Cadena: " + cadena + ", Temporadas: " + temporadas + ", Empleados: " + listaEmpleados + ", Invitados: " + listaInvitados + ", Director: " + director + "]";
    }
}
