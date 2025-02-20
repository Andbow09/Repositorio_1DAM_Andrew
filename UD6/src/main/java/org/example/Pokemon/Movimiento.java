package org.example.Pokemon;

public class Movimiento {
    private String nombre;
    private String tipo;
    private int potencia;
    private boolean fisico;

    public Movimiento(String nombre, String tipo, int potencia, boolean fisico) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.fisico = fisico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean esFisico() {
        return fisico;
    }
}
