package org.example.Ejemplo1_Tema5;

public abstract class Vehiculo {
    private String motor;
    private int cilindrada;
    private int caballos;

    public Vehiculo(String motor, int cilindrada, int caballos) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public abstract void Encender();
}
