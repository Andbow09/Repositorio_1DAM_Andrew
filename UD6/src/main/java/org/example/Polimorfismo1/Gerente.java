package org.example.Polimorfismo1;

public class Gerente extends Empleado{
    @Override
    public void realizarTarea() {
        System.out.println("Supervisando el proyecto y organizando reuniones.");
    }
}