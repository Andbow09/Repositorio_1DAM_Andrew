package org.example.Interfaces;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {

    }

    @Override
    public void encender() {
        if (isEstado()) {
            System.out.println("El aire acondicionado ya está encendido.");
        } else {
            System.out.println("Encendiendo aire acondicionado...");
            setEstado(true);
        }
    }
}
