package org.example.Herencia2;

import java.util.ArrayList;

public class Influencer extends Usuario{
    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String usuario, int seguidores) {
        super(nombre, edad, usuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    public void anadirColaboracion(String colaboracion) {
        colaboraciones.add(colaboracion);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.print("Colaboraciones: ");
        for (String colaboracion : colaboraciones) {
            System.out.print(colaboracion + ", ");
        }
    }
}
