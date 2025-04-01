package org.example.Ejemplo1_Tema5;

public class AppVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("400",300,250,2);
        Coche coche = new Coche("f5000",200,3000);
        moto.Encender();
        moto.LimpiezaMoto();
        coche.Encender();
        coche.LimpiezaCoche();
    }
}
