package org.example.Herencia1;

public class Organizador extends Persona{
    private String rol;

    public Organizador(String nombre, int edad, String rol) throws EdadValida {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);
    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Organizador: Coordinando el show...");
    }
}
