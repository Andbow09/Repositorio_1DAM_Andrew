package org.example.project.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Trip {
    private int id; // Identificador único del viaje.
    private User driver; // Objeto User que es el conductor del viaje.
    private String origin, destination; // Lugar de origen y destino del viaje.
    private List<User> passengers; // Lista de objetos User que son pasajeros en este viaje. Inicialmente vacía.
    private LocalDateTime dateTime; // Fecha y hora en la que se realizará el viaje.
    private int seatsAvailable; // Número de asientos disponibles en el viaje.
    private double price; // Precio por asiento en el viaje.
    private boolean completed; // Indica si el viaje se ha completado (true) o no (false). Inicialmente no completado.

    // Constructor de la clase Trip. Recibe el ID del viaje, origen, destino, número de asientos, fecha y hora, conductor y precio como argumentos.
    public Trip(int tripID, String origin, String destination, int seats, LocalDateTime dateTime, User driver, Double price) {
        this.id = tripID;
        this.origin = origin;
        this.destination = destination;
        this.seatsAvailable = seats;
        this.dateTime = dateTime;
        this.driver = driver;
        this.price = price;
        this.passengers = new ArrayList<>(); // Inicializa la lista de pasajeros como una lista vacía.
        this.completed = false; // Inicializa el estado de completado como falso.
    }

    // Método getter para obtener el ID del viaje.
    public int getId() {
        return id;
    }

    // Método getter para obtener el objeto User del conductor.
    public User getDriver() {
        return driver;
    }

    // Método getter para obtener la lista de pasajeros (objetos User).
    public List<User> getPassengers() {
        return passengers;
    }

    // Método getter para obtener la fecha y hora del viaje.
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    // Método para verificar si hay asientos disponibles en el viaje.
    public boolean hasSeats() {
        return seatsAvailable > 0;
    }

    // Método para reservar un asiento en el viaje, decrementando el número de asientos disponibles.
    public void reserveSeat() {
        seatsAvailable--;
    }

    // Método para liberar un asiento en el viaje, incrementando el número de asientos disponibles.
    public void releaseSeat() {
        seatsAvailable++;
    }

    // Método getter para obtener el precio del viaje.
    public double getPrice() {
        return price;
    }

    // Método setter para modificar el precio del viaje.
    public void setPrice(double price) {
        this.price = price;
    }

    // Método setter para modificar el ID del viaje.
    public void setId(int id) {
        this.id = id;
    }

    // Método setter para modificar el conductor del viaje.
    public void setDriver(User driver) {
        this.driver = driver;
    }

    // Método getter para obtener el origen del viaje.
    public String getOrigin() {
        return origin;
    }

    // Método setter para modificar el origen del viaje.
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // Método getter para obtener el destino del viaje.
    public String getDestination() {
        return destination;
    }

    // Método setter para modificar el destino del viaje.
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Método setter para modificar la fecha y hora del viaje.
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // Método setter para modificar la lista de pasajeros del viaje.
    public void setPassengers(List<User> passengers) {
        this.passengers = passengers;
    }

    // Método getter para obtener el número de asientos disponibles.
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Método setter para modificar el número de asientos disponibles.
    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    // Método getter para verificar si el viaje ha sido completado.
    public boolean isCompleted() {
        return completed;
    }

    // Método setter para modificar el estado de completado del viaje.
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto Trip.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena con información básica del viaje, incluyendo ID, origen, destino y número de asientos disponibles.
        return String.format("Trip %d: %s -> %s (Seats: %d)", id, origin, destination, seatsAvailable);

    }

}