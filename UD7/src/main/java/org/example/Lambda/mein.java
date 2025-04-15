package org.example.Lambda;

public class mein {
    public static void main(String[] args) {
        Prueba prueba = new Prueba() {
            @Override
            public String prueba(String texto) {
                System.out.println("Hola esto es una prueba de clase anónima: " + texto);
                return texto.toLowerCase();
            }
        };

        Prueba prueba2 = (texto) -> {
            System.out.println("Hola esto es una prueba de lambda: " + texto);
            return texto.toUpperCase();
        };

        System.out.println(prueba.prueba("Prueba de clase anónima"));

        System.out.println(prueba2.prueba("Prueba de lambda"));
    }
}
