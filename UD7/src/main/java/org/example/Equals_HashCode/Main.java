package org.example.Equals_HashCode;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Paciente pac1 = new Paciente("139867","Andy","Bowen");
        Paciente pac2 = new Paciente("729084","Izan","Lopez");
        Paciente pac3 = new Paciente("729084","Izan","Lopez");

        LinkedHashSet<Paciente> listaPacientes = new LinkedHashSet<>();
        listaPacientes.add(pac1);
        listaPacientes.add(pac2);
        listaPacientes.add(pac3);

        System.out.println(pac2.hashCode());
        System.out.println(pac3.hashCode());

        System.out.println(pac2.equals(pac3));

        System.out.println(listaPacientes);
    }
}
