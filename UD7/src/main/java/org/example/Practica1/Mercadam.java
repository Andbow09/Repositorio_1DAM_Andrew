package org.example.Practica1;

import java.util.*;

public class Mercadam {
    private List<Cliente> listaClientes;

    public Mercadam() {
        listaClientes = new ArrayList<>();
    }

    public void generarClientes() {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String[] listaCaracteres = caracteres.split("");

        String nombre = "";
        String contrasena = "";
        for (int i = 0; i < 8; i++) {
            nombre += listaCaracteres[random.nextInt(0, listaCaracteres.length)];
            contrasena += listaCaracteres[random.nextInt(0, listaCaracteres.length)];
        }

        Cliente cliente = new Cliente(nombre,contrasena);
        listaClientes.add(cliente);
    }

    public List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(listaClientes);
    }
}
