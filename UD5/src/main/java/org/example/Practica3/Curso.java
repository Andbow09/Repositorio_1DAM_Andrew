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
 * Clase Curso, contiene nombre y un total de horas. Además usaremos @Getter para
 * generar automáticamente los getters, los @Setter para generar automáticamente los setters,
 * @ToString para generar el toString y @AllArgsConstuctor para crear un constructor que
 * contenga e inicialice todos los atributos de la clase.
 */
public class Curso {
    private String nombre;
    private int horas;

    /**
     * Constructor destinado al caso de que se introduzca un nombre nulo,
     * mostrará un mensaje por pantalla diciendo que no se puede añadir un nombre nulo.
     * @param nombre
     */
    public Curso(String nombre) {
        Objects.requireNonNull(nombre,"El nombre no puede ser nulo");
    }
}



