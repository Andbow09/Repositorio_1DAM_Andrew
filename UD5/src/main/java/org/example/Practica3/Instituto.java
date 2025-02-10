package org.example.Practica3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@Getter @Setter
@ToString
/**
 * Clase Instituto, contiene nombre(que será final para que se cree uno sí o sí),
 * una población y una lista de estudiantes y de cursos. Además usaremos @Getter para
 * generar automáticamente los getters, los @Setter para generar automáticamente los setters,
 * @ToString para generar el toString y @AllArgsConstuctor para crear un constructor que
 * contenga e inicialice todos los atributos de la clase.
 */
public class Instituto {
    private final String nombre;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    /**
     * Constructor destinado al caso de que se introduzca un nombre nulo,
     * dado el caso, se le asignará como nombre por defecto "Instituto sin nombre".
     * @param nombre
     */
    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }

    /**
     * El metodo agregarCurso agregará un curso creado en la clase principal a la lista de cursos de Instituto.
     * @param curso
     */
    public void agregarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("No se puede agregar un curso nulo");
            // Si el curso que se añade es nulo, saldrá un mensaje que diga que no se puede agregar y saldrá.
            return;
        }

        for (Curso cur : listaCursos) {
            // Recorre la lista de cursos.
            if (curso.getNombre().equals(cur.getNombre()) && curso.getHoras() == cur.getHoras()) {
                System.out.println("No se pueden añadir cursos duplicados.");
                // Si encuentra coincidencias en todos los datos al momento de intentar añadir un curso nuevo,
                // el programa soltará un mensaje de que no se admiten duplicidades y saldrá.
                return;
            }
        }

        listaCursos.add(curso);
        // Si ninguno de los casos se cumple, simplemente se añadirá a la lista.
    }

    /**
     * Este metodo añadirá un estudiante creado previamente en el constructor de la clase principal
     * a la lista de estudiantes de Instituto.
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("No se puede agregar un estudiante nulo");
            // Si el estudiante que se añade a la lista es nulo,
            // no admitirá su entrada y solo se saldrá.
            return;
        }
        listaEstudiantes.add(estudiante); // Si no se cumple la condición, se añadirá a la lista de estudiantes.
    }
}