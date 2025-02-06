package org.example.Practica1;
import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre,Cadena cadena, String director_nombre) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.director = new Empleado(director_nombre, "Director");
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados.add(director);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void agregarEmpleado(String nombre, String cargo) {
        Empleado emp = new Empleado(nombre, cargo);
        emp.setDirector(director);
        listaEmpleados.add(emp);
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado inv = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(inv);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public void mostrarEmpleados() {
        System.out.println(listaEmpleados);
    }

    public int invitadosTemporada(int temporada) {
        int total = 0;
        for (Invitado invit : listaInvitados) {
            if(invit.getTemporada() == temporada) {
                total++;
            }
        }

        return total;
    }

    public int vecesInvitado(String nombre) {
        int veces = 0;
        for (Invitado invit : listaInvitados) {
            if(invit.getNombre().equalsIgnoreCase(nombre)) {
                veces++;
            }
        }

        return veces;
    }

    public void rastrearInvitado(String nombre) {
        int veces = vecesInvitado(nombre);

        if (veces == 0) {
            System.out.println("Este invitado nunca ha venido al programa.");
        } else {
            System.out.println("El invitado " + nombre + " ha sido invitado " + veces + " veces al programa.");
            System.out.println("");
            System.out.println("Fechas y Temporadas:");
            for (Invitado invit : listaInvitados) {
                if(invit.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Fecha: " + invit.getFecha_visita() + ", Temporada: " + invit.getTemporada());;
                }
            }
        }
    }

    public boolean buscarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(nombre + " ha venido al programa.");
                return true;
            }
        }

        return false;
    }

    public void invitadoAntes(String nombre) {
        boolean si = buscarInvitado(nombre);

        if (si) {
            LocalDate fecha = null;

            for (Invitado inv : listaInvitados) {
                if (inv.getNombre().equalsIgnoreCase(nombre)) {
                    if (fecha == null) {
                        fecha = inv.getFecha_visita();
                    } else {
                        if (inv.getFecha_visita().isBefore(fecha)) {
                            fecha = inv.getFecha_visita();
                        }
                    }
                }
            }

            if (fecha != null) {
                System.out.println("Primera vez: " + fecha);
            } else {
                System.out.println(nombre + " no ha estado en este programa.");
            }
        }
    }

    @Override
    public String toString() {
        return "Programa [Nombre: " + nombre + ", Cadena: " + cadena.getNombre() + ", Director: " + director + ", Temporadas: " + temporadas + ", Empleados: " + listaEmpleados + ", Invitados: " + listaInvitados + "]";
    }
}
