package org.example.Ejemplo1_Tema5;

public class Moto extends Vehiculo {
    private int ruedasMoto;

    public Moto(String motor, int cilindrada, int caballos, int ruedasMoto) {
        super(motor, cilindrada, caballos);
        this.ruedasMoto = ruedasMoto;
    }

    public void LimpiezaMoto() {
        System.out.println("Se ha limpiado la moto.");
    }

    @Override
    public void Encender() {
        System.out.println("Moto encendida.");
    }
}
