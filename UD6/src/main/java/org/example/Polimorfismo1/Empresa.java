package org.example.Polimorfismo1;

public class Empresa {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Desarrollador(),
            new Disenador(),
            new Gerente()
        };

        System.out.println("=== Usando el array polimórfico ===");
        for (Empleado emp : empleados) {
            emp.realizarTarea();
        }

        Empleado emp1 = new Gerente();
        Empleado emp2 = new Desarrollador();

        System.out.println("");
        System.out.println("=== Usando el método asignarTarea() ===");
        asignarTarea(emp1);
        asignarTarea(emp2);
    }

    public static void asignarTarea(Empleado empleado) {
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
