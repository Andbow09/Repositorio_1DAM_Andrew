package org.example.Ejemplo1_Tema5;

public class Coche extends Vehiculo{
    public Coche(String motor, int cilindrada, int caballos) {
        super(motor, cilindrada, caballos);
    }

    public void LimpiezaCoche() {
        System.out.println("El coche se ha limpiado.");
    }

    @Override
    public void Encender() {
        System.out.println("Coche encendido.");
    }
}
