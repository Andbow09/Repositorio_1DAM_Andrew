package org.example.Practica1;

public class Empleado {
    public static int cont = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.director = null;
        id = calcularID();
        cont++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        switch (cargo) {
            case "director":
                if (cargo.equals("director")) {
                    this.director = null;
                } else {
                    this.cargo = "director";
                }
                break;
            case "tecnico":
                this.cargo = "tecnico";
                break;
            case "presentador":
                this.cargo = "presentador";
                break;
            case "colaborador":
                this.cargo = "colaborador";
                break;
            default:
                System.out.println("Este cargo no es válido");
                this.cargo = "pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String calcularID() {
        return String.format("EP%03d", cont);
    }

    @Override
    public String toString() {
        return "Empleado [Nombre: " + nombre + ", Cargo: " + cargo + ", Director: " + director + ", ID: " + id + "]";
    }
}
