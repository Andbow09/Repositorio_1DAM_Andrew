package org.example.Biblioteca;

/**
 * Clase libro, tiene un nombre, un autor, año de publicación y su disponibilidad.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    /**
     * Constructor de la clase Libro, se define su título, su autor,
     * su año de publicación y se deja por defecto la disponibilidad en true.
     * @param titulo          (titulo del libro)
     * @param autor           (autor del libro)
     * @param anioPublicacion (año de publicación del libro)
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    /**
     * Metodo que devuelve el título de un libro.
     * @return titulo
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Metodo que modifica el título de un libro
     * @param titulo (asigna el título dado al título del libro)
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que devuelve el autor de un libro
     * @return autor
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Metodo que modifica el autor de un libro
     * @param autor (asigna el autor dado al autor del libro)
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo que devuelve el año de publicacion de un libro.
     * @return anioPublicacion
     */
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    /**
     * Metodo que modifica el año de publicacion de un libro.
     * @param anioPublicacion (asigna el año dado al año de publicacion del libro)
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Metodo que devuelve la disponibilidad de un libro.
     * @return disponible
     */
    public boolean getDisponible() {
        return this.disponible;
    }

    /**
     * Metodo que modifica la disponibilidad de un libro
     * @param disponible (asigna el booleano dado al booleano de disponibilidad del libro)
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Metodo que modifica el valor de disponible a false dado el caso.
     */
    public void prestarLibro() {
        if (!this.disponible) { //Si el valor de disponible es false, significará que el libro ya ha sido prestado y nos lo dirá.
            System.out.println(getTitulo() + " ya ha sido prestado.");
        } else {
            this.disponible = false; //Si es true (está disponible), cambiará su valor a false, es decir, se ha prestado.
        }
    }

    /**
     * Metodo que modifica el valor de disponible a true dado el caso
     */
    public void devolverLibro() {
        if (this.disponible) { //Si el valor de disponible es true, significará que el libro ya ha sido devuelto y nos lo dirá.
            System.out.println(getTitulo() + " ya ha sido devuelto.");
        } else {
            this.disponible = true; //Si es false (no está disponible), cambiará su valor a true, es decir, se ha devuelto.
        }
    }

    /**
     * Muestra toda la información de un libro.
     */
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de Publicación: " + getAnioPublicacion());
        System.out.print("Disponibilidad: ");
        if (this.disponible) {
            System.out.println("Disponible"); //Si disponible es true, dirá que está disponible.
        } else {
            System.out.println("No disponible"); //Si es false, dirá que no está disponible.
        }
    }

    /**
     * Modifica el toString de la clase Libro, devolviendo lo que nosotros escribamos.
     * @return todos los datos de un libro.
     */
    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anioPublicacion + ", Disponible: " + disponible + "]";
    }
}
