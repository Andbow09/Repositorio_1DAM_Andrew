package org.example.Practica3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;

@AllArgsConstructor
@Getter @Setter
@ToString
/**
 * Clase Estudiante, contiene nombre, edad y el curso al que pertenece.
 * Además usaremos @Getter para generar automáticamente los getters,
 * los @Setter para generar automáticamente los setters, @ToString para
 * generar el toString y @AllArgsConstuctor para crear un constructor que
 * contenga e inicialice todos los atributos de la clase.
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private Curso curso;

    /**
     * Constructor destinado al caso de que se introduzca un nombre nulo,
     * mostrará un mensaje por pantalla diciendo que no se puede añadir un nombre nulo.
     * @param nombre
     */
    public Estudiante(String nombre) {
        Objects.requireNonNull(nombre,"El nombre no puede ser nulo");
    }
}
