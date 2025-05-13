package org.example.project.Models;

import java.time.LocalDate;

public class Review {
    private static int nextId = 1; // Variable estática para llevar la cuenta del próximo ID a asignar a una reseña. Se inicializa en 1.
    private final int id; // Identificador único de la reseña. Se asigna una sola vez en el constructor.
    private final User author; // Objeto User que escribió la reseña. Es inmutable una vez asignado.
    private final User recipient; // Objeto User que recibió la reseña (puede ser un conductor o un cliente). Es inmutable una vez asignado.
    private final Trip trip; // Objeto Trip al que se refiere la reseña. Es inmutable una vez asignado.
    private final int rating; // Calificación otorgada en la reseña (generalmente en una escala del 1 al 5). Es inmutable una vez asignado.
    private final String comment; // Texto del comentario de la reseña. Es inmutable una vez asignado.
    private final LocalDate date; // Fecha en la que se escribió la reseña. Se establece automáticamente al crear la instancia.

    // Constructor de la clase Review. Recibe el autor, el receptor, el viaje, la calificación y el comentario como argumentos.
    public Review(User author, User recipient, Trip trip, int rating, String comment) {
        this.id = nextId++;
        this.author = author;
        this.recipient = recipient;
        this.trip = trip;
        this.rating = rating;
        this.comment = comment;
        this.date = LocalDate.now(); // Obtiene la fecha actual del sistema.
    }

    // Método getter para obtener el ID de la reseña.
    public int getId() {
        return id;
    }

    // Método getter para obtener el objeto User que escribió la reseña.
    public User getAuthor() {
        return author;
    }

    // Método getter para obtener el objeto User que recibió la reseña.
    public User getRecipient() {
        return recipient;
    }

    // Método getter para obtener el objeto Trip asociado a la reseña.
    public Trip getTrip() {
        return trip;
    }

    // Método getter para obtener la calificación de la reseña.
    public int getRating() {
        return rating;
    }

    // Método getter para obtener el comentario de la reseña.
    public String getComment() {
        return comment;
    }

    // Método getter para obtener la fecha de la reseña.
    public LocalDate getDate() {
        return date;
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto Review.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena descriptiva de la reseña, incluyendo el autor, el receptor, el ID del viaje, la calificación y el comentario.
        return String.format("Reseña de %s para %s en viaje %d: %d★ - %s",
                author.getName(), recipient.getName(), trip.getId(), rating, comment);
    }
}