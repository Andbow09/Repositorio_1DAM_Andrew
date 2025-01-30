package org.example.equipos;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String peso;
    private int edad;
    private String ciudad;
    private String profesion;

    public Persona() {}

    public Persona(String nombre, String apellidos, String dni, String peso, int edad, String ciudad, String profesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.peso = peso;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public String getPeso() {
        return this.peso;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setNombre(String nombre) {
        if(nombre.equalsIgnoreCase("messi")) {
            this.nombre = nombre;
        }

    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.peso = ciudad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String concat() {
        return this.nombre + this.apellidos;
    }

    public void imprimir() {
        System.out.println(this.nombre + " " + this.apellidos + " " + this.dni + " " + this.peso + " " + this.edad + " " + this.ciudad + " " + this.profesion);
    }
}