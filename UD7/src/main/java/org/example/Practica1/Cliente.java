package org.example.Practica1;

import java.util.Objects;

public class Cliente {
    private String usuario;
    private String contrasena;
    private Pedido pedido;
    private boolean promocionesAplicadas;

    public Cliente(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.pedido = null;
        this.promocionesAplicadas = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public boolean isPromocionesAplicadas() {
        return promocionesAplicadas;
    }

    public void crearPedido() {
        this.pedido = new Pedido();
    }

    public void insertarProducto(String producto) {
        Producto prod = Producto.valueOf(producto.toUpperCase());
        pedido.insertarPedido(prod);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}