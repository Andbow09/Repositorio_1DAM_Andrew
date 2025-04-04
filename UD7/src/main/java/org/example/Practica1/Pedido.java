package org.example.Practica1;

import java.util.*;

public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private double importe;
    private boolean promoAplicada;

    public Pedido() {
        this.pedido = new HashMap<>();
        this.importe = 0;
        this.promoAplicada = false;
    }

    public void insertarPedido(Producto producto) {
        int cantidad = pedido.getOrDefault(producto, 0) + 1;
        pedido.put(producto, cantidad);
        importe += producto.getPrecio();
    }

    public void aplicarPromociones() {
        aplicarPromo3x2();
        aplicarPromo10();
        promoAplicada = true;
    }

    private void aplicarPromo3x2() {
        double descuento = 0;
        for (Map.Entry<Producto, Integer> entry : pedido.entrySet()) {
            int grupos = entry.getValue() / 3;
            if (grupos > 0) {
                descuento += grupos * entry.getKey().getPrecio();
            }
        }
        importe -= descuento;
    }

    private void aplicarPromo10() {
        importe *= 0.9;
    }

    public void mostrarProductos() {
        for (Map.Entry<Producto, Integer> entry : pedido.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey().name() +
                    " (" + entry.getKey().getPrecio() + "€)");
        }
    }

    public void mostrarProductosOrdenados() {
        List<Map.Entry<Producto, Integer>> listaOrdenada = new ArrayList<>(pedido.entrySet());
        Collections.sort(listaOrdenada, new ComparadorProductos());

        for (Map.Entry<Producto, Integer> entry : listaOrdenada) {
            System.out.println(entry.getValue() + " x " + entry.getKey().name() +
                    " (" + entry.getKey().getPrecio() + "€)");
        }
    }

    public double getImporte() {
        return importe;
    }

    public boolean isPromoAplicada() {
        return promoAplicada;
    }

    private static class ComparadorProductos implements Comparator<Map.Entry<Producto, Integer>> {
        @Override
        public int compare(Map.Entry<Producto, Integer> e1, Map.Entry<Producto, Integer> e2) {
            return e2.getValue().compareTo(e1.getValue()); // Orden descendente
        }
    }
}