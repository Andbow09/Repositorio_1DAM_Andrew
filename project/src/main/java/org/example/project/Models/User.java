package org.example.project.Models;

import java.util.*;

public class User {
    private int userID; // Identificador único del usuario.
    private String name, email, password; // Nombre, correo electrónico y contraseña del usuario.
    private boolean isDriver; // Atributo booleano para indicar si el usuario es conductor (true) o cliente (false).
    private List<Booking> bookings = new ArrayList<>(); // Lista de objetos Booking asociados a este usuario. Inicializada como una lista vacía.

    // Constructor de la clase User. Recibe el ID del usuario, nombre, correo electrónico, contraseña y si es conductor como argumentos.
    public User(int userID, String name, String email, String password, boolean isDriver) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isDriver = isDriver;
    }

    // Método getter para obtener el ID del usuario.
    public int getUserID() {
        return userID;
    }

    // Método getter para obtener el nombre del usuario.
    public String getName() {
        return name;
    }

    // Método getter para obtener el correo electrónico del usuario.
    public String getEmail() {
        return email;
    }

    // Método para verificar si la contraseña proporcionada coincide con la contraseña del usuario.
    public boolean checkPassword(String pass) {
        return password.equals(pass);
    }

    // Método getter para verificar si el usuario es conductor.
    public boolean isDriver() {
        return isDriver;
    }

    // Método para agregar una reserva (objeto Booking) a la lista de reservas del usuario.
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    // Método getter para obtener la lista de reservas del usuario.
    public List<Booking> getBookings() {
        return bookings;
    }

    // Método para cancelar una reserva específica del usuario, buscando por su ID.
    public void cancelBooking(int bookingID) {
        // Itera sobre la lista de reservas del usuario.
        for (Booking b : bookings) {
            // Verifica si el ID de la reserva actual coincide con el ID proporcionado y si la reserva no está ya cancelada.
            if (b.getBookingID() == bookingID && !b.isCancelled()) {
                // Llama al método cancel() del objeto Booking para marcarla como cancelada.
                b.cancel();
                // Imprime un mensaje indicando que la reserva ha sido cancelada.
                System.out.println("Reserva cancelada: " + bookingID);
                return; // Sale del método una vez que se ha encontrado y cancelado la reserva.
            }
        }
        // Si el bucle termina sin encontrar la reserva o si ya estaba cancelada, se imprime un mensaje indicándolo.
        System.out.println("Reserva no encontrada o ya cancelada.");
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto User.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena con información relevante del usuario, incluyendo ID, nombre, correo electrónico y rol (Conductor o Cliente).
        return String.format("User [ID=%d, Name=%s, Email=%s, Role=%s]", userID, name, email, isDriver ? "Conductor" : "Cliente");
    }
}