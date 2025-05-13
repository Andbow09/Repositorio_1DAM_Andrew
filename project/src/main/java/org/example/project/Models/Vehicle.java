package org.example.project.Models;

public class Vehicle {
    private int vehicleID; // Identificador único del vehículo.
    private User owner; // Objeto User que representa al propietario del vehículo (quien presumiblemente es el conductor).
    private String model; // Modelo del vehículo (ej: Sedan, SUV, etc.).
    private String licensePlate; // Matrícula del vehículo.
    private int capacity; // Número entero que indica la capacidad máxima de pasajeros que el vehículo puede transportar.
    private boolean isElectric; // Nuevo atributo booleano que indica si el vehículo es eléctrico (true) o no (false).

    // Constructor de la clase Vehicle. Recibe el ID del vehículo, el propietario, el modelo, la matrícula, la capacidad y si es eléctrico como argumentos.
    public Vehicle(int vehicleID, User owner, String model, String licensePlate, int capacity, boolean isElectric) {
        this.vehicleID = vehicleID;
        this.owner = owner;
        this.model = model;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    // Método getter para obtener el ID del vehículo.
    public int getVehicleID() {
        return vehicleID;
    }

    // Método getter para obtener el objeto User del propietario del vehículo.
    public User getOwner() {
        return owner;
    }

    // Método getter para obtener el modelo del vehículo.
    public String getModel() {
        return model;
    }

    // Método getter para obtener la matrícula del vehículo.
    public String getLicensePlate() {
        return licensePlate;
    }

    // Método getter para obtener la capacidad del vehículo.
    public int getCapacity() {
        return capacity;
    }

    // Método setter para modificar la capacidad del vehículo.
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Método getter para verificar si el vehículo es eléctrico.
    public boolean isElectric() {
        return isElectric;
    }

    // Método setter para modificar el estado eléctrico del vehículo.
    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto Vehicle, incluyendo si es eléctrico.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena con información relevante del vehículo, incluyendo ID, nombre del propietario, modelo, matrícula, capacidad e indicando si es eléctrico ("Yes" o "No").
        return String.format("Vehicle [ID=%d, Owner=%s, Model=%s, Plate=%s, Capacity=%d, Electric=%s]",
                vehicleID, owner.getName(), model, licensePlate, capacity, isElectric ? "Yes" : "No");
    }
}