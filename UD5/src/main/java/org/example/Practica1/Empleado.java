package org.example.Practica1;

/**
 * Clase Empleado, que consta de un id, un nombre, un cargo y su director.
 */
public class Empleado {
    public static int cont = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    /**
     * Constructor de la clase Empleado, cada vez que se cree un empleado desde Programa, se le asignará un nombre y un cargo,
     * Para el cargo usará asignarCargo, que veremos más adelante.
     * Como director, designaremos el que se haya pasado por el constructor de Programa.
     * Como id, llamaremos al método calcularID, que veremos más adelante.
     * El contador se irá actualizando para que cada empleado tenga un id diferente del resto.
     * @param nombre
     * @param cargo
     */
    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        asignarCargo(cargo);
        setDirector(director);
        id = calcularID();
        cont++;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el nombre de un empleado.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar. el nombre de un empleado.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el cargo de un empleado.
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar el cargo de un empleado.
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Este método usará el cargo pasado por el método agregarEmpleado de Programa.
     * Las opciones de cargo serán: Director, Técnico, Presentador y Colaborador.
     * No aceptará otro tipo de cargo, y si si introduce un cargo no válido, se asignará "pte" como cargo por defecto.
     * Por último, si se le asigna "Director" como cargo a un empleado cuyo cargo ya sea director, su director(su jefe), pasará a ser null.
     * Esto debido a que un director no tiene jefe.
     * @param cargo
     */
    public void asignarCargo(String cargo) {
        switch (cargo.toLowerCase()) { //Usamos un switch para los diferentes cargos disponibles.
            case "director":
            case "tecnico":
            case "presentador":
            case "colaborador":
                this.cargo = cargo.toLowerCase();
                break; //si es una de las anteriores opciones, se asignará como cargo el que hayamos pasado por teclado.
            default:
                System.out.println("Este cargo no es válido");
                this.cargo = "pte";
                //si el cargo introducido no está dentro de las opciones, se asignará pte como su cargo.
        }

        if (this.cargo.equals("director")) {
            this.director = null;
            //si el cargo ya es el de director, el director del empleado será nulo.
        }
    }

    /**
     * Llamaremos a este método cuando queramos imprimir el director de un empleado.
     * @return
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * Llamaremos a este método cuando queramos actualizar al director de los empleados.
     * @param director
     */
    public void setDirector(Empleado director) {
        if (!"director".equals(this.cargo)) {
            this.director = director;
        }
    }

    /**
     * Para calcular el id usaremos un formato que contará de "EP" mas 00 o 0(dependiendo de los dígitos del contador), y el contador.
     * @return
     */
    public String calcularID() {
        return String.format("EP%03d", cont);
    }

    /**
     * Actualización del toString para que cuando se imprima el empleado, saque todo el contenido que contiene el toString
     * @return
     */
    @Override
    public String toString() {
        return "Empleado [Nombre: " + nombre + ", Cargo: " + cargo + ", Director: " + director + ", ID: " + id + "]";
    }
}
