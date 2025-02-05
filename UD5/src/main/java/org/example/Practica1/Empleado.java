package org.example.Practica1;

import org.example.casa.Habitacion;

import java.util.ArrayList;

public class Empleado {
    private static final String EP = "EP";
    private static int cont = 0;
    private static String id;
    private String nombre;
    private String cargo = "pte";
    private Empleado director;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.director = null;
        id = EP + calcularID(cont);
        cont++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        switch (cargo) {
            case "director":
                if (cargo.equals("director")) {
                    this.director = null;
                } else {
                    this.cargo = "director";
                }
                break;
            case "tecnico":
                this.cargo = "tecnico";
                break;
            case "presentador":
                this.cargo = "presentador";
                break;
            case "colaborador":
                this.cargo = "colaborador";
                break;
            default:
                System.out.println("Este cargo no es válido");
                this.cargo = "pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String calcularID(int cont) {
        cont++;

        if (cont < 10) {
            return "00" + cont;
        } else if (cont < 100) {
            return "0" + cont;
        }

        String idd = Integer.toString(cont);
        return idd;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre: " + nombre + ", Cargo: " + cargo + ", Director: " + director + ", ID: " + id + "]";
    }
}
