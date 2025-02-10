package org.example.lombok_prueba;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Data
public class Instituto {
    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;
}
