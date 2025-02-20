package org.example.Interfaces;

public abstract class Dispositivo {
    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public abstract void encender();

    public void apagar() {
        if (!estado) {
            System.out.println(nombre + " ya está apagado.");
        } else {
            estado = false;
            System.out.println(nombre + " apagado.");
        }
    }

    public void mostrarEstado() {
        if (estado) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }
    }
}
