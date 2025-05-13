package org.example.project.Models;

public class Booking {
    private int bookingID; // Identificador único de la reserva.
    private User user; // Objeto User que realizó la reserva.
    private Trip trip; // Objeto Trip al que se refiere la reserva.
    private boolean cancelled; // Indica si la reserva ha sido cancelada (true) o no (false).

    // Constructor de la clase Booking. Recibe el ID de la reserva, el usuario, y el viaje como argumentos.
    public Booking(int bookingID, User user, Trip trip) {
        this.bookingID = bookingID;
        this.user = user;
        this.trip = trip;
        this.cancelled = false; // Inicialmente, la reserva no está cancelada.
    }

    // Método getter para obtener el ID de la reserva.
    public int getBookingID() {
        return bookingID;
    }

    // Método getter para obtener el objeto Trip asociado a la reserva.
    public Trip getTrip() {
        return trip;
    }

    // Método getter para verificar si la reserva ha sido cancelada.
    public boolean isCancelled() {
        return cancelled;
    }

    // Método para marcar la reserva como cancelada.
    public void cancel() {
        this.cancelled = true;
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto Booking.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena con información relevante de la reserva, incluyendo ID, nombre del usuario, ID del viaje y estado de cancelación.
        return String.format("Booking [ID=%d, User=%s, TripID=%d, Cancelled=%s]", bookingID, user.getName(), trip.getId(), cancelled ? "Yes" : "No");
    }
}