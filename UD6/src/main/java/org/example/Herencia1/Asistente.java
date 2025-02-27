package org.example.Herencia1;

public class Asistente extends Persona{
    protected String entrada;

    public Asistente(String nombre, int edad, String entrada) throws EdadValida {
        super(nombre, edad);
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de entrada: " + entrada);
    }

    public void prueba() {

    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Asistente: Buscando asiento...");
    }
}
