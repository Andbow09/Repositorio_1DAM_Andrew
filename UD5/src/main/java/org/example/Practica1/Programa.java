package org.example.Practica1;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase Programa, esta clase tiene un nombre, una cadena a la que pertenecerá, total de temporadas, una lista de Empleados, una lista Invitados y un director para ese programa.
 */
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    /**
     * Constructor de Programa al que le pasaremos su nombre, la cadena a la que pertenecerá y
     * el nombre del director del programa.
     * Por defecto, todo programa se creará con 0 temporadas.
     * Cuando se cree un programa con el constructor, el cargo del director será "Director".
     * director deberá estar directamente relacionado con Empleado, esto significará que cada vez
     * que se cree un programa, se creará un empleado con los datos del director del programa y
     * dicho empleado(director) se añadirá a la lista de empleados.
     * @param nombre
     * @param cadena
     * @param director_nombre
     */
    public Programa(String nombre,Cadena cadena, String director_nombre) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.director = new Empleado(director_nombre, "Director");
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados.add(director);
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el nombre del programa.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el nombre de un programa.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir la cadena a la que pertenece un programa.
     * @return
     */
    public Cadena getCadena() {
        return cadena;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar la cadena a la que pertenece un programa.
     * @param cadena
     */
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el total de temporadas que tiene un programa.
     * @return
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el total de temporadas que tiene un programa.
     * @param temporadas
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir la la lista de empleados que tiene un programa.
     * @return
     */
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar la lista de empleados que tiene un programa.
     * @param listaEmpleados
     */
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Este método lo usaremos cuando queramos añadir un nuevo empleado a un programa específico,
     * le pasaremos tanto su nombre como el cargo que tendrá, además, cada vez que se cree
     * un empleado, a este se le asignará el director que se haya definido en el constructor.
     * También cada empleado creado se añadirá a la lista de empleados del programa.
     * @param nombre
     * @param cargo
     */
    public void agregarEmpleado(String nombre, String cargo) {
        Empleado emp = new Empleado(nombre, cargo);
        emp.setDirector(director);
        listaEmpleados.add(emp);
    }

    /**
     * Este método muestra la lista de empleados solamente con llamar al método.
     */
    public void mostrarEmpleados() {
        System.out.println(listaEmpleados);
    }

    /**
     * Llamaremos a este método cuando queramos imprimir la lista de invitados de un programa.
     * @return
     */
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar la lista de invitados de un programa.
     * @param listaInvitados
     */
    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    /**
     * El método agregarInvitado agregará un invitado a la lista de invitados pasándonle un nombre,
     * una profesión y la temporada en la que aparecerá en el programa.
     * @param nombre
     * @param profesion
     * @param temporada
     */
    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado inv = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(inv);
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el director de un programa.
     * @return
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el director de un programa.
     * @param director
     */
    public void setDirector(Empleado director) {
        this.director = director;
    }

    /**
     * Este método devuelve cuántas veces han habido invitados en una temporada en específico,
     * dicha temporada la pasaremos en la llamada al método en la clase Main(AppProgramas).
     * @param temporada
     * @return
     */
    public int invitadosTemporada(int temporada) {
        int total = 0; //Creamos un contador que cuente las veces que han habido invitados en una temporada.
        for (Invitado invit : listaInvitados) { //Recorremos la lista de invitados.
            if(invit.getTemporada() == temporada) {
                total++; //Cada vez que la temporada en la que ha estado un invitado coincida con la temporada que le pasamos, el contador aumentará.
            }
        }

        return total;
    }

    /**
     * vecesInvitado devuelve cuántas veces ha estado un invitado en específico en un programa.
     * @param nombre
     * @return
     */
    public int vecesInvitado(String nombre) {
        int veces = 0; //Creamos una variable que cuente las veces que un invitado ha estado en un programa.
        for (Invitado invit : listaInvitados) { //Recorremos la lista de invitados.
            if(invit.getNombre().equalsIgnoreCase(nombre)) {
                veces++; //Si en una iteración el nombre de un invitado coincide con el nombre a encontrar, el contador se aumentará.
            }
        }

        return veces;
    }

    /**
     * Imprimirá todas las fechas y temporadas en las que ha estado un invitado en un programa.
     * Para eso usará el método anterior rastrearInvitado(), ya que usará el resultado para determinar su salida.
     * @param nombre
     */
    public void rastrearInvitado(String nombre) {
        int veces = vecesInvitado(nombre); //saca todas las veces que ha estado un invitado en un programa.

        if (veces == 0) {
            System.out.println("Este invitado nunca ha venido al programa.");
            //Si el invitado nunca ha estado en ese programa, entonces veces es 0.
            //Dado el caso, el programa dirá que el invitado nunca ha estado.
        } else {
            System.out.println("El invitado " + nombre + " ha sido invitado " + veces + " veces al programa.");
            //Si no es el caso, dirá el total de veces que ha estado.
            System.out.println("");
            System.out.println("Fechas y Temporadas:");
            for (Invitado invit : listaInvitados) {
                //Recorre la lista de invitados para poder imprimir todas las fechas y temporadas en las que ha estado dicho invitado.
                if(invit.getNombre().equalsIgnoreCase(nombre)) { //Si encuentra coincidencias con el nombre, entonces imprimirá lo solicitado.
                    System.out.println("Fecha: " + invit.getFecha_visita() + ", Temporada: " + invit.getTemporada());;
                }
            }
        }
    }

    /**
     * Devuelve en booleano si un invitado ha estado o no en un programa.
     * Si ha estado, devuelve true, ni no, false.
     * @param nombre
     * @return
     */
    public boolean buscarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) { //Recorre la lista de invitados.
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(nombre + " ha venido al programa.");
                return true; //Si encuentra coincidencias en el nombre, entonces devolverá true.
            }
        }

        System.out.println(nombre + " no ha venido nunca al programa.");
        return false; //Si no es el caso, entonces devolverá false.
    }

    /**
     * Recorrerá todas las fechas en las que ha estado un invitado para determinar cuál es la fecha anterior a todas cronológicamente.
     * Para ello usará buscarInvitado, que determinará si el invitado ha estado o no, y dependiendo de la respuesta, hará una cosa u otra.
     * @param nombre
     */
    public void invitadoAntes(String nombre) {
        boolean si = buscarInvitado(nombre); //Creamos un booleano que devuelve el valor booleano de buscarInvitado.

        if (si) {
            //Si el booleano devuelve true, entonces creará una variable de fecha vacía. que se usará como comprobación más adelante.
            LocalDate fecha = null;

            for (Invitado inv : listaInvitados) { //Recorre la lista de invitados.
                if (inv.getNombre().equalsIgnoreCase(nombre)) {
                    if (fecha == null) {
                        fecha = inv.getFecha_visita();
                        //Si encuentra coincidencias en el nombre, entonces comprobará que fecha es null, si lo es,
                        // designará como valor de fecha, la fecha en la que el invitado fue al programa esa vez.
                    } else {
                        if (inv.getFecha_visita().isBefore(fecha)) {
                            fecha = inv.getFecha_visita();
                        }
                        //Si fecha ya tiene un valor, es decir, que ya tiene asignada la fecha de visita, entonces comprobará que la fecha de visita sea anterior a fecha.
                        //Si lo es, entonces fecha se actualizará al valor de fecha de visita.
                        //Si no es anterior, entonces su valor no se actualizará al de la fecha de visita.
                        //De esta forma, comparamos todas las fechas que tenga guardadas un invitado y así sacar la anterior.
                    }
                }
            }

            if (fecha != null) {
                System.out.println("Primera vez: " + fecha);
                //Si fecha tiene un valor asignado, es decir, se ha ido actualizando en el bucle for anterior,
                //entonces devolverá la fecha como la primera fecha en la que estuvo.
            } else {
                System.out.println(nombre + " no ha estado en este programa.");
                //si fecha sigue siendo null, significará que no hubo coincidencia en el nombre y no se encontró en la lista de invitados.
            }
        }
    }

    /**
     * Actualización del toString para que cuando se imprima el programa, saque todo el contenido que contiene el toString
     * @return
     */
    @Override
    public String toString() {
        return "Programa [Nombre: " + nombre + ", Cadena: " + cadena.getNombre() + ", Director: " + director + ", Temporadas: " + temporadas + ", Empleados: " + listaEmpleados + ", Invitados: " + listaInvitados + "]";
    }
}