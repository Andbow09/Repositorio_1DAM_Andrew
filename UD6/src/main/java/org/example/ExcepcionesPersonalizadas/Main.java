package org.example.ExcepcionesPersonalizadas;

public class Main {
    public static void main(String[] args) throws NivelException {
        int nivel = 150;

        if (nivel > 100) {
            throw new NivelException("El nivel no puede ser mayor a 100");
        }
    }
}
