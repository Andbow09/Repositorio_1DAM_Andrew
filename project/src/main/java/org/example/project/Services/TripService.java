package org.example.project.Services;

import org.example.project.Models.Booking; // Importa la clase Booking del paquete Models para trabajar con las reservas de los usuarios.
import org.example.project.Models.Trip; // Importa la clase Trip del paquete Models, que representa los viajes ofrecidos.
import org.example.project.Models.User; // Importa la clase User del paquete Models, que representa a los usuarios del sistema.

import java.util.ArrayList; // Importa la clase ArrayList para crear listas dinámicas.
import java.util.List; // Importa la interfaz List para definir el tipo de las colecciones.
import java.util.Scanner; // Importa la clase Scanner para permitir la entrada de datos por parte del usuario desde la consola.

public class TripService {
    static Scanner scanner = new Scanner(System.in); // Crea una instancia estática de Scanner para leer la entrada del usuario. Al ser estática, se comparte entre todas las llamadas a los métodos de esta clase.

    private static List<Trip> trips = new ArrayList<>(); // Declara una lista estática y privada llamada 'trips' para almacenar todos los objetos Trip disponibles en el sistema. Al ser estática, pertenece a la clase y no a una instancia específica. Se inicializa con un ArrayList para poder añadir y gestionar los viajes.

    // Método estático para obtener la lista de todos los viajes almacenados.
    public static List<Trip> getTrips() {
        return trips; // Devuelve la lista 'trips' que contiene todos los viajes. Se devuelve la lista directamente, por lo que cualquier modificación externa afectará la lista interna. Considerar devolver una copia para mayor seguridad si es necesario.
    }

    // Método estático para agregar un nuevo viaje a la lista de viajes.
    public static void addTrip(Trip trip) {
        if (trip != null) { // Verifica que el objeto Trip proporcionado no sea nulo antes de agregarlo.
            trips.add(trip); // Agrega el objeto Trip a la lista 'trips'.
        }
    }

    // Método estático para obtener una lista de los viajes que tienen asientos disponibles.
    public static List<Trip> getAvailableTrips() {
        return trips.stream() // Crea un flujo (Stream) a partir de la lista 'trips'.
                .filter(Trip::hasSeats) // Filtra el flujo, manteniendo solo los viajes para los cuales el método 'hasSeats()' devuelve true (es decir, tienen al menos un asiento disponible).
                .toList(); // Convierte el flujo filtrado de nuevo a una lista (List) y la devuelve.
    }

    // Método estático para realizar la reserva de un asiento en un viaje por parte de un usuario.
    public static void bookTrip(Trip trip, User user) {
        if (trip == null || user == null) { // Verifica si el viaje o el usuario proporcionados son nulos. Si alguno lo es, muestra un mensaje de error y sale del método.
            System.out.println("Error: Viaje o usuario no válidos.");
            return;
        }

        // Verificar si el usuario tiene una reserva activa en este viaje
        for (Booking booking : user.getBookings()) { // Itera sobre la lista de reservas del usuario.
            if (booking.getTrip().getId() == trip.getId()) { // Comprueba si el ID del viaje de la reserva actual coincide con el ID del viaje que se intenta reservar.
                System.out.println("Ya tienes una reserva en este viaje.");
                return; // Si el usuario ya tiene una reserva en este viaje, muestra un mensaje y sale del método.
            }
        }

        if (!trip.hasSeats()) { // Verifica si el viaje tiene asientos disponibles llamando al método 'hasSeats()' del objeto Trip.
            System.out.println("No hay asientos disponibles para este viaje.");
            return; // Si no hay asientos disponibles, muestra un mensaje y sale del método.
        }

        trip.reserveSeat(); // Llama al método 'reserveSeat()' del objeto Trip para decrementar el número de asientos disponibles.
        Booking newBooking = new Booking(trip.getId(), user, trip); // Crea un nuevo objeto Booking con el ID del viaje, el usuario y el viaje reservado.
        user.addBooking(newBooking); // Llama al método 'addBooking()' del objeto User para añadir la nueva reserva a la lista de reservas del usuario.

        System.out.println("Reserva realizada con éxito."); // Muestra un mensaje de éxito al usuario.
    }

    // Método estático para permitir a un usuario cancelar una de sus reservas.
    public static void cancelBooking(User user) {
        List<Booking> activeBookings = new ArrayList<>(); // Crea una nueva lista para almacenar las reservas activas del usuario (aquellas que no han sido canceladas).
        for (Booking booking : user.getBookings()) { // Itera sobre la lista de todas las reservas del usuario.
            if (!booking.isCancelled()) { // Verifica si la reserva actual no está cancelada.
                activeBookings.add(booking); // Si la reserva no está cancelada, la añade a la lista de reservas activas.
            }
        }

        if (activeBookings.isEmpty()) { // Verifica si la lista de reservas activas está vacía.
            System.out.println("No tienes reservas activas para cancelar.");
            return; // Si no hay reservas activas, muestra un mensaje y sale del método.
        }

        System.out.println("\n=== Tus Reservas ===");
        for (Booking booking : activeBookings) { // Itera sobre la lista de reservas activas y muestra la información de cada una.
            System.out.println("ID: " + booking.getBookingID() + " - " + booking.getTrip());
        }

        System.out.print("Ingrese el ID de la reserva que desea cancelar: "); // Pide al usuario que ingrese el ID de la reserva que desea cancelar.
        int bookingId = scanner.nextInt(); // Lee el ID de la reserva ingresado por el usuario.
        scanner.nextLine(); // Limpiar buffer // Consume la nueva línea pendiente después de leer un entero con scanner.nextInt().

        for (Booking booking : activeBookings) { // Itera sobre la lista de reservas activas nuevamente.
            if (booking.getBookingID() == bookingId) { // Compara el ID de la reserva actual con el ID ingresado por el usuario.
                booking.cancel(); // Llama al método 'cancel()' del objeto Booking para marcar la reserva como cancelada.
                booking.getTrip().releaseSeat(); // Llama al método 'releaseSeat()' del objeto Trip asociado a la reserva para incrementar el número de asientos disponibles.
                user.getBookings().remove(booking); // 🔹 Se elimina de la lista del usuario // Remueve la reserva cancelada de la lista de reservas del usuario.
                System.out.println("Reserva cancelada con éxito.");
                return; // Sale del método una vez que la reserva ha sido cancelada.
            }
        }

        System.out.println("ID de reserva no encontrado."); // Si el bucle termina sin encontrar una reserva con el ID ingresado, muestra un mensaje de error.
    }

    // Método privado para mostrar las reservas activas de un usuario. Solo se utiliza dentro de esta clase.
    private static void viewBookings(User user) {
        List<Booking> activeBookings = new ArrayList<>(); // Crea una nueva lista para almacenar las reservas activas del usuario.
        for (Booking booking : user.getBookings()) { // Itera sobre todas las reservas del usuario.
            if (!booking.isCancelled()) { // Verifica si la reserva no está cancelada.
                activeBookings.add(booking); // Si no está cancelada, la añade a la lista de reservas activas.
            }
        }

        System.out.println("\n=== Tus Reservas Activas ===");
        if (activeBookings.isEmpty()) { // Verifica si la lista de reservas activas está vacía.
            System.out.println("No tienes reservas activas.");
        } else {
            for (Booking booking : activeBookings) { // Itera sobre la lista de reservas activas y muestra la información de cada una.
                System.out.println("ID: " + booking.getBookingID() + " - " + booking.getTrip());
            }
        }
    }
}