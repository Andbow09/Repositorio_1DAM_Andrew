package org.example.Practica1;

import java.util.*;

/**
 * Clase pedido, donde se insertan productos al pedido, se aplican promos y se muestra el pedido actual.
 */
public class Pedido {
    private HashMap<Producto, Integer> pedido; // Productos y sus cantidades
    private double importe; // Importe total del pedido
    private boolean promoAplicada; // Indica si ya se aplicaron promociones

    public Pedido() {
        this.pedido = new HashMap<>();
        this.importe = 0;
        this.promoAplicada = false;
    }

    /**
     * Inserta un producto al pedido sumando 1 a su cantidad.
     *
     * @param producto Producto a añadir.
     */
    public void insertarPedido(Producto producto) {
        int cantidad = pedido.getOrDefault(producto, 0) + 1;
        pedido.put(producto, cantidad);
        importe += producto.getPrecio();
    }

    /**
     * Aplica las promociones 3x2 y 10% de descuento al pedido.
     */
    public void aplicarPromociones() {
        aplicarPromo3x2();
        aplicarPromo10();
        promoAplicada = true;
    }

    /**
     * Aplica la promoción 3x2
     */
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

    /**
     * Aplica el 10%  al importe final
     */
    private void aplicarPromo10() {
        importe *= 0.9;
    }

    /**
     * Muestra los productos del pedido sin ordenarr
     */
    public void mostrarProductos() {
        for (Map.Entry<Producto, Integer> entry : pedido.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey().name() +
                    " (" + entry.getKey().getPrecio() + "€)");
        }
    }

    /**
     * Muestra los productos del pedido ordenados de mayor a menor cantidad.
     */
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

    /**
     * Compara productos por su cantidad, de mayor a menor.
     */
    private static class ComparadorProductos implements Comparator<Map.Entry<Producto, Integer>> {
        @Override
        public int compare(Map.Entry<Producto, Integer> e1, Map.Entry<Producto, Integer> e2) {
            return e2.getValue().compareTo(e1.getValue());
        }
    }
}