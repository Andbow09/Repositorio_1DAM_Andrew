package org.example.project.Services;

import org.example.project.Models.Review; // Importa la clase Review del paquete Models para poder trabajar con objetos de tipo Review.

import java.util.ArrayList; // Importa la clase ArrayList para crear una lista dinámica de objetos Review.
import java.util.List; // Importa la interfaz List para definir el tipo de la colección de reseñas.

public class ReviewService {
    private static final List<Review> reviews = new ArrayList<>(); // Declara una lista estática y final llamada 'reviews' que almacenará todos los objetos Review creados en la aplicación. Al ser estática, pertenece a la clase y no a una instancia específica. Al ser final, la referencia a la lista no puede ser modificada después de su inicialización. Se inicializa con una nueva instancia de ArrayList, lo que permite agregar y acceder a las reseñas.

    // Método estático para agregar un objeto Review a la lista 'reviews'.
    public static void addReview(Review review) {
        reviews.add(review); // Utiliza el método add() de la lista ArrayList para añadir el objeto Review proporcionado como argumento a la colección de reseñas.
    }

    // Método estático para obtener una copia de la lista de todas las reseñas almacenadas.
    public static List<Review> getReviews() {
        return new ArrayList<>(reviews); // Retorna una *nueva* lista ArrayList que contiene todos los elementos de la lista 'reviews'. Esto se hace para evitar que el código externo modifique directamente la lista interna de la clase ReviewService. Al devolver una copia, se mantiene el control sobre la colección interna.
    }
}