//package org.example.Comparadores;
//
//import java.util.Objects;
//
//public class Producto implements Comparable<Producto> {
//    private String nombre;
//    private Integer precio;
//
//    public Producto(String nombre, int precio) {
//        this.nombre = nombre;
//        this.precio = precio;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public Integer getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(Integer precio) {
//        this.precio = precio;
//    }
//
//    @Override
//    public int compareTo(Producto producto) {
//        int comparacionNombre = nombre.compareTo(producto.nombre);
//        if (comparacionNombre != 0) {
//            return comparacionNombre;
//        }
//
//        return precio.compareTo(producto.precio);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Producto producto = (Producto) o;
//        return precio == producto.precio && Objects.equals(nombre, producto.nombre);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nombre, precio);
//    }
//
//    @Override
//    public String toString() {
//        return "Producto{" +
//                    "Nombre= '" + nombre + '\'' +
//                    ", Precio= " + precio +
//                    '}';
//    }
//}
