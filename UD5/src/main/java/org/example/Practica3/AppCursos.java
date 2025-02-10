package org.example.Practica3;

public class AppCursos {
    public static void main(String[] args) {
        Instituto insti = new Instituto("IES MUTXAMEL");
        Curso cur1 = new Curso("Java",100);
        Curso cur2 = new Curso("Python",70);
        insti.agregarCurso(cur1);
        insti.agregarCurso(cur2);

        try {
            Estudiante est1 = new Estudiante("Carlos",20,cur1);
            Estudiante est2 = new Estudiante("Ana",22,cur2);
            insti.agregarEstudiante(est1);
            insti.agregarEstudiante(est2);
            Estudiante est_err = new Estudiante(null);
        } catch (NullPointerException err) {
            System.out.println("No se puede crear un estudiante con un nombre vacío.");
        }

        insti.agregarEstudiante(null);
        insti.agregarCurso(null);

        System.out.println("Cursos disponibles:");
        System.out.println(insti.getListaCursos());

        System.out.println("Estudiantes registrados:");
        System.out.println(insti.getListaEstudiantes());
    }
}
