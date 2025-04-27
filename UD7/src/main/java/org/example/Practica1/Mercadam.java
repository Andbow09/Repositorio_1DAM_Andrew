package org.example.Practica1;

import java.util.*;

/**
 * Clase que contiene una lista de todos los clientes, además de crear clientes
 */
public class Mercadam {
    private List<Cliente> listaClientes;

    public Mercadam() {
        listaClientes = new ArrayList<>();
    }

    /**
     * Genera un cliente de prueba con nombre y contraseña aleatorios.
     */
    public void generarClientes() {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String[] listaCaracteres = caracteres.split("");
        //generamos un array que contenga todos los caracteres disponibles para usar.

        String nombre = "";
        String contrasena = "";
        for (int i = 0; i < 8; i++) {
            nombre += listaCaracteres[random.nextInt(0, listaCaracteres.length)];
            contrasena += listaCaracteres[random.nextInt(0, listaCaracteres.length)];
        }

        //asigna el nombre y contraseña para los usuarios buscando una posición al azar en el array
        //de caracteres durante todo el bucle.

        Cliente cliente = new Cliente(nombre, contrasena);
        listaClientes.add(cliente);
    }

    /**
     * Devuelve la lista de clientes.
     *
     * @return Lista de clientes.
     */
    public List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(listaClientes);
    }
}
