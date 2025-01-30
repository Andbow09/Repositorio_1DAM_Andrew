package org.example.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    public static int cont_id = 0;
    public static final String lib = "LIB";
    private String id;
    private boolean disp;
    private static int lib_cant;
    private static int lib_disp;
    private Estudiante estudiantePrestado;
    private Editorial editorial;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        id = lib + calcularID(cont_id);
        this.disp = true;
        cont_id++;
        lib_cant++;
        lib_disp++;
        estudiantePrestado = null;
        this.editorial = editorial;
    }

    public String calcularID(int cont_id) {
        cont_id++;

        if (cont_id < 10) {
            return "00" + cont_id;
        } else if (cont_id < 100 && cont_id >= 10) {
            return "0" + cont_id;
        }
        String ci = Integer.toString(cont_id);
        return ci;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void prestar(Estudiante estudiante) {
        if (disp && estudiante.getLibrosPrestados().contains(this)) {
            disp = false;
            System.out.println("El libro '" + getTitulo() + "' ha sido prestado a " + estudiante.getNombre());
            lib_disp--;
            estudiantePrestado = estudiante;
        } else {
            System.out.println("El libro '" + getTitulo() + "' ya ha sido prestado.");
        }
    }

    public void devolver() {
        if (!disp) {
            disp = true;
            System.out.println("El libro '" + getTitulo() + "' ha sido devuelto por " + estudiantePrestado.getNombre());
            lib_disp++;
            estudiantePrestado = null;
        } else {
            System.out.println("El libro '" + getTitulo() + "' ya ha sido devuelto.");
        }
    }

    public boolean estaDisp() {
        return disp;
    }

    public static int getTotalLibros() {
        return lib_cant;
    }

    public static int getLibrosDisponibles() {
        return lib_disp;
    }

    @Override
    public String toString() {
        return "Libro[Titulo: " + titulo + ", Autor: " + autor + ", ID: " + id + ", Disponible: " + disp +"]";
    }
}
