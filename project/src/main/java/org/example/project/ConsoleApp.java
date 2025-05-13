package org.example.project;

import org.example.project.Models.*; // Importa todas las clases del paquete Models (User, Trip, Booking, Review, Bill, Payment).
import org.example.project.Services.ReviewService; // Importa la clase ReviewService para gestionar las reseñas.
import org.example.project.Services.TripService; // Importa la clase TripService para gestionar los viajes y las reservas.
import org.example.project.Services.UserService; // Importa la clase UserService para gestionar la autenticación y registro de usuarios.

import java.time.LocalDateTime; // Importa la clase LocalDateTime para trabajar con fechas y horas.
import java.util.ArrayList; // Importa la clase ArrayList para crear listas dinámicas.
import java.util.InputMismatchException; // Importa la excepción InputMismatchException para manejar errores de entrada de datos.
import java.util.List; // Importa la interfaz List para definir el tipo de las colecciones.
import java.util.Scanner; // Importa la clase Scanner para permitir la entrada de datos por parte del usuario desde la consola.

import static org.example.project.Services.TripService.cancelBooking; // Importa estáticamente el método cancelBooking de TripService para poder llamarlo directamente.

public class ConsoleApp {
    private static final Scanner scanner = new Scanner(System.in); // Crea una instancia estática y final de Scanner para leer la entrada del usuario desde la consola. Al ser estática, se comparte entre todas las llamadas a los métodos de esta clase. Al ser final, la referencia al Scanner no puede ser modificada.
    private static boolean running = true; // Variable estática para controlar el bucle principal de la aplicación. Se inicializa en true para que la aplicación comience a ejecutarse.

    public static void main(String[] args) {
        while (running) { // Bucle principal de la aplicación que se ejecuta mientras la variable 'running' sea true.
            showMainMenu(); // Llama al método para mostrar el menú principal al usuario en cada iteración.
        }
    }

    // Método privado y estático para mostrar las opciones del menú principal.
    private static void showMainMenu() {
        System.out.println("\n=== Carpooling App ===");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrarse");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

        int choice = scanner.nextInt(); // Lee la opción ingresada por el usuario como un entero.
        scanner.nextLine(); // Limpiar buffer // Consume la nueva línea pendiente después de leer un entero con scanner.nextInt().

        switch (choice) { // Estructura switch para ejecutar diferentes acciones basadas en la elección del usuario.
            case 1 -> handleLogin(); // Si la opción es 1, llama al método para manejar el inicio de sesión.
            case 2 -> handleRegister(); // Si la opción es 2, llama al método para manejar el registro de un nuevo usuario.
            case 3 -> exitApp(); // Si la opción es 3, llama al método para salir de la aplicación.
            default -> System.out.println("Opción inválida, intenta nuevamente."); // Si la opción no coincide con ningún caso, muestra un mensaje de error.
        }
    }

    // Método privado y estático para manejar el proceso de inicio de sesión.
    private static void handleLogin() {
        System.out.print("Email: ");
        String email = scanner.nextLine(); // Pide al usuario que ingrese su correo electrónico y lo lee.
        System.out.print("Contraseña: ");
        String password = scanner.nextLine(); // Pide al usuario que ingrese su contraseña y la lee.

        User user = UserService.login(email, password); // Llama al método 'login' de UserService para autenticar al usuario con las credenciales proporcionadas.
        if (user != null) { // Verifica si el método 'login' devolvió un objeto User (lo que significa que la autenticación fue exitosa).
            UserSession.getInstance().setCurrentUser(user); // Establece el usuario actual en la sesión utilizando la clase singleton UserSession.
            showUserMenu(user); // Llama al método para mostrar el menú principal específico para usuarios autenticados.
        } else {
            System.out.println("Credenciales incorrectas."); // Si la autenticación falla, muestra un mensaje de error.
        }
    }

    // Método privado y estático para manejar el proceso de registro de un nuevo usuario.
    private static void handleRegister() {
        System.out.print("Nombre: ");
        String name = scanner.nextLine(); // Pide y lee el nombre del nuevo usuario.
        System.out.print("Email: ");
        String email = scanner.nextLine(); // Pide y lee el correo electrónico del nuevo usuario.
        System.out.print("Contraseña: ");
        String password = scanner.nextLine(); // Pide y lee la contraseña del nuevo usuario.
        System.out.print("¿Eres conductor? (s/n): ");
        boolean isDriver = scanner.nextLine().equalsIgnoreCase("s"); // Pide y lee si el nuevo usuario es conductor (s/n), convirtiendo la respuesta a minúsculas y comparándola con "s".

        UserService.register(name, email, password, isDriver); // Llama al método 'register' de UserService para crear un nuevo usuario con los datos proporcionados.
        System.out.println("Registro exitoso. Ahora puedes iniciar sesión."); // Muestra un mensaje de éxito después del registro.
    }

    // Método privado y estático para mostrar el menú principal para usuarios autenticados. Recibe el objeto User del usuario actual.
    private static void showUserMenu(User user) {
        boolean loggedIn = true; // Variable local para controlar el bucle del menú de usuario. Se mantiene en true hasta que el usuario decide cerrar sesión.

        while (loggedIn) { // Bucle que se ejecuta mientras el usuario esté logueado.
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Ver viajes disponibles");
            System.out.println("2. Reservar un viaje");
            if (user.isDriver()) { // Verifica si el usuario actual es conductor.
                System.out.println("3. Crear un viaje"); // Si es conductor, muestra la opción para crear un nuevo viaje.
            }
            System.out.println("4. Ver mis reservas");
            System.out.println("5. Cancelar una reserva");
            System.out.println("6. Iniciar Viaje"); // Nueva opción para iniciar un viaje reservado.
            System.out.println("7. Cerrar sesión");


            int choice = scanner.nextInt(); // Lee la opción ingresada por el usuario.
            scanner.nextLine(); // Limpiar buffer

            switch (choice) { // Estructura switch para ejecutar diferentes acciones basadas en la elección del usuario.
                case 1: showAvailableTrips(); break; // Muestra la lista de viajes disponibles.
                case 2: handleBookTrip(user); break; // Permite al usuario reservar un viaje.
                case 3: if (user.isDriver()) handleCreateTrip(user); break; // Si el usuario es conductor, le permite crear un viaje.
                case 4: viewBookings(user); break; // Muestra las reservas del usuario actual.
                case 5: cancelBooking(user); break; // Permite al usuario cancelar una de sus reservas.
                case 6: startTrip(user); break; // Permite al usuario iniciar un viaje reservado.
                case 7: loggedIn = false; System.out.println("Sesión cerrada."); break; // Cierra la sesión del usuario y sale del bucle del menú.
                default: System.out.println("Opción inválida, intenta nuevamente."); // Muestra un mensaje de error para opciones inválidas.

            }
        }
    }

    // Método privado y estático para mostrar la lista de viajes disponibles.
    private static void showAvailableTrips() {
        System.out.println("\n=== Viajes Disponibles ===");
        List<Trip> trips = TripService.getAvailableTrips(); // Obtiene la lista de viajes disponibles desde TripService.
        if (trips.isEmpty()) { // Verifica si la lista de viajes está vacía.
            System.out.println("No hay viajes disponibles."); // Muestra un mensaje si no hay viajes disponibles.
        } else {
            trips.forEach(trip -> System.out.println(trip)); // Itera sobre la lista de viajes y muestra cada viaje en la consola.
        }
    }

    // Método privado y estático para manejar el proceso de reserva de un viaje por parte del usuario.
    private static void handleBookTrip(User user) {
        showAvailableTrips(); // Muestra primero los viajes disponibles.
        System.out.print("Ingrese el ID del viaje que desea reservar: ");
        int tripId = scanner.nextInt(); // Pide al usuario que ingrese el ID del viaje a reservar y lo lee.
        scanner.nextLine(); // Limpiar buffer

        List<Trip> trips = TripService.getAvailableTrips(); // Obtiene nuevamente la lista de viajes disponibles (para asegurar que esté actualizada).
        Trip selectedTrip = null; // Inicializa una variable para almacenar el viaje seleccionado.
        for (Trip trip : trips) { // Itera sobre la lista de viajes disponibles.
            if (trip.getId() == tripId) { // Compara el ID de cada viaje con el ID ingresado por el usuario.
                selectedTrip = trip; // Si se encuentra una coincidencia, se asigna el viaje a la variable 'selectedTrip'.
                break; // Sale del bucle una vez que se encuentra el viaje.
            }
        }

        if (selectedTrip != null && selectedTrip.hasSeats()) { // Verifica si se encontró el viaje y si tiene asientos disponibles.
            TripService.bookTrip(selectedTrip, user); // Llama al método 'bookTrip' de TripService para realizar la reserva.
            System.out.println("Reserva realizada con éxito."); // Muestra un mensaje de éxito.
        } else {
            System.out.println("Viaje no encontrado o sin asientos disponibles."); // Muestra un mensaje si el viaje no se encuentra o no tiene asientos.
        }
    }

    // Método privado y estático para manejar el proceso de inicio de un viaje reservado.
    private static void startTrip(User user) {
        List<Booking> activeBookings = new ArrayList<>(); // Crea una lista para almacenar las reservas activas del usuario.
        for (Booking booking : user.getBookings()) { // Itera sobre las reservas del usuario.
            if (!booking.isCancelled()) { // Añade a la lista solo las reservas que no estén canceladas.
                activeBookings.add(booking);
            }
        }

        if (activeBookings.isEmpty()) { // Si no hay reservas activas, informa al usuario.
            System.out.println("No tienes viajes reservados para iniciar.");
            return;
        }

        System.out.println("\n=== Tus Reservas ===");
        for (Booking booking : activeBookings) { // Muestra las reservas activas al usuario.
            System.out.println("ID: " + booking.getBookingID() + " - " + booking.getTrip());
        }

        System.out.print("Ingrese el ID del viaje que desea iniciar: ");
        int bookingId = scanner.nextInt(); // Pide el ID de la reserva a iniciar.
        scanner.nextLine(); // Limpiar buffer

        Booking selectedBooking = null;
        for (Booking booking : activeBookings) { // Busca la reserva seleccionada por el ID.
            if (booking.getBookingID() == bookingId) {
                selectedBooking = booking;
                break;
            }
        }

        if (selectedBooking == null) { // Si no se encuentra la reserva, informa al usuario.
            System.out.println("ID de reserva no encontrado.");
            return;
        }

        // 🚗 Animación del viaje
        System.out.println("\n🚙 Iniciando viaje...\n");

        String[] car = { // Representación ASCII de un coche.
                "   ______",
                "  /|_||_\\`.__",
                " (   _    _ _\\",
                " =`-(_)--(_)-'"
        };


        for (int i = 0; i < 20; i++) { // Bucle para crear una animación de movimiento del coche.
            System.out.println("\n".repeat(5)); // Espacio para evitar que las líneas anteriores interfieran
            for (String line : car) {
                System.out.println(" ".repeat(i) + line); // Mueve todo el coche hacia adelante añadiendo espacios al inicio.
            }
            try {
                Thread.sleep(250); // Pausa para controlar la velocidad de la animación.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n✅ Viaje finalizado.");
        System.out.println("Por favor, realice el pago.");

        processPayment(user, selectedBooking); // Llama al método para procesar el pago del viaje.

        System.out.print("¿Desea dejar una reseña para este viaje? (S/N): ");
        String reviewOption = scanner.nextLine().trim().toUpperCase(); // Pregunta si el usuario quiere dejar una reseña, ignora espacios y convierte a mayúsculas.

        if (reviewOption.equals("S")) { // Si la respuesta es "S", llama al método para dejar una reseña.
            leaveReview(user, selectedBooking);
        }

        user.getBookings().remove(selectedBooking); // Elimina la reserva de la lista del usuario una vez finalizado el viaje.
        System.out.println("Reserva eliminada, ya no aparece en tu historial.");
    }

    // Método privado y estático para permitir al usuario dejar una reseña sobre un viaje finalizado.
    private static void leaveReview(User user, Booking booking) {
        if (!booking.getTrip().isCompleted()) { // Verifica si el viaje asociado a la reserva ha sido completado.
            System.out.println("No se puede dejar una reseña antes de que el viaje haya finalizado.");
            return;
        }

        // Determina quién es el receptor de la reseña (si el usuario es el conductor, el receptor es el primer pasajero; si es pasajero, el receptor es el conductor).
        User recipient = booking.getTrip().getDriver().equals(user)
                ? booking.getTrip().getPassengers().get(0)
                : booking.getTrip().getDriver();

        if (recipient.equals(user)) { // Evita que un usuario se deje una reseña a sí mismo.
            System.out.println("No puedes dejarte una reseña a ti mismo.");
            return;
        }

        int rating = 0;
        boolean validRating = false;
        while (!validRating) { // Bucle para asegurar que la calificación ingresada sea válida (entre 1 y 5).
            try {
                System.out.print("Calificación (1-5): ");
                rating = scanner.nextInt();
                if (rating >= 1 && rating <= 5) {
                    validRating = true;
                } else {
                    System.out.println("Ingresa un número entre 1 y 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número válido.");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Escribe tu reseña: ");
        String reviewText = scanner.nextLine(); // Pide al usuario que escriba su reseña.

        Review review = new Review(user, recipient, booking.getTrip(), rating, reviewText); // Crea un nuevo objeto Review.
        ReviewService.addReview(review); // Llama al método para añadir la reseña al sistema.

        System.out.println("✅ ¡Reseña guardada con éxito! Gracias por compartir tu opinión.");
    }

    // Método privado y estático para procesar el pago de un viaje.
    private static void processPayment(User user, Booking booking) {
        System.out.println("\n=== Métodos de Pago ===");
        System.out.println("1. PayPal");
        System.out.println("2. Tarjeta");
        System.out.println("3. Bizum");
        System.out.print("Seleccione una opción: ");

        int choice = scanner.nextInt(); // Pide al usuario que seleccione un método de pago.
        scanner.nextLine(); // Limpiar buffer

        String paymentMethod;
        switch (choice) { // Asigna el método de pago basado en la elección del usuario.
            case 1: paymentMethod = "PayPal"; break;
            case 2: paymentMethod = "Tarjeta"; break;
            case 3: paymentMethod = "Bizum"; break;
            default: System.out.println("Método inválido."); return; // Si la opción es inválida, muestra un mensaje y sale del método.
        }

        Bill bill = new Bill(user, booking.getTrip().getPrice()); // Crea una nueva factura para el usuario por el precio del viaje.
        Payment payment = new Payment(user, bill, booking.getTrip().getPrice()); // Crea un nuevo registro de pago.

        System.out.println("✅ Pago realizado con " + paymentMethod + ". ¡Gracias por viajar con nosotros!");

        booking.getTrip().setCompleted(true); // Marca el viaje como completado.

        printBill(bill, booking.getTrip(), paymentMethod); // Llama al método para imprimir la factura.
    }

    // Método privado y estático para imprimir la factura del viaje.
    private static void printBill(Bill bill, Trip trip, String paymentMethod) {
        System.out.println("\n=== FACTURA ===");
        System.out.println("Número de factura: " + bill.getId());
        System.out.println("Fecha: " + bill.getIssueDate());
        System.out.println("Conductor: " + trip.getDriver().getName());
        System.out.println("Cliente: " + bill.getRecipient().getName());
        System.out.println("Origen: " + trip.getOrigin());
        System.out.println("Destino: " + trip.getDestination());
        System.out.println("Fecha y Hora del viaje: " + trip.getDateTime());
        System.out.println("Importe: " + bill.getAmount() + " EUR");
        System.out.println("Método de Pago: " + paymentMethod);
        System.out.println("=========================");
    }

    // Método privado y estático para manejar la creación de un nuevo viaje por parte de un conductor.
    private static void handleCreateTrip(User user) {
        if (!user.isDriver()) { // Verifica si el usuario actual es conductor.
            System.out.println("Solo los conductores pueden crear viajes.");
            return; // Si no es conductor, muestra un mensaje y sale del método.
        }

        System.out.print("Origen: ");
        String origin = scanner.nextLine(); // Pide y lee el lugar de origen del viaje.
        System.out.print("Destino: ");
        String destination = scanner.nextLine(); // Pide y lee el destino del viaje.
        int seats = 0; // Inicializa la variable para el número de asientos disponibles.

        boolean ok = false; // Variable de control para el bucle de entrada del número de asientos.
        do {
            try {
                System.out.print("Número de asientos disponibles: ");
                seats = scanner.nextInt(); // Pide y lee el número de asientos disponibles.
                ok = true; // Si la entrada es un entero válido, establece 'ok' en true para salir del bucle.
            } catch(InputMismatchException ex) {
                System.out.println("Introduce números únicamente.");
                scanner.nextLine(); // Limpiar buffer // Consume la entrada incorrecta del buffer.
            }
        } while(!ok); // El bucle continúa hasta que se ingrese un número válido.
        scanner.nextLine(); // Limpiar buffer // Consume la nueva línea pendiente después de leer un entero.

        boolean validInput = false; // Variable de control para el bucle de entrada del precio.
        double price = 0.0; // Inicializa la variable para el precio del viaje.
        while (!validInput) {
            try {
                System.out.print("Precio por viaje (€): ");
                price = scanner.nextDouble(); // Pide y lee el precio por asiento del viaje.
                if (price > 0) { // Verifica si el precio es mayor que cero.
                    validInput = true; // Si el precio es válido, establece 'validInput' en true para salir del bucle.
                } else {
                    System.out.println("El precio debe ser mayor a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                scanner.nextLine(); // Limpiar buffer // Consume la entrada incorrecta del buffer.
            }
        }


        scanner.nextLine(); // Limpiar buffer // Consume la nueva línea pendiente después de leer un double.
        System.out.print("Fecha y hora (YYYY-MM-DD HH:MM): ");
        String dateTimeStr = scanner.nextLine(); // Pide y lee la fecha y hora del viaje en formato String.

        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr.replace(" ", "T")); // Intenta convertir la cadena de fecha y hora al objeto LocalDateTime, reemplazando el espacio con 'T' para el formato ISO 8601.
            int newTripId = TripService.getTrips().size() + 1; // Genera un nuevo ID para el viaje basándose en el tamaño actual de la lista de viajes más uno.
            Trip newTrip = new Trip(newTripId, origin, destination, seats, dateTime, user, price); // Crea un nuevo objeto Trip con los datos ingresados por el usuario y el conductor actual.
            TripService.addTrip(newTrip); // Llama al método para agregar el nuevo viaje a la lista de viajes en TripService.
            System.out.println("Viaje creado con éxito con ID: " + newTripId); // Muestra un mensaje de éxito con el ID del nuevo viaje.
        } catch (InputMismatchException e) {
            System.out.println("Error en el formato de fecha y hora. Usa el formato correcto."); // Si la cadena de fecha y hora no tiene el formato correcto, muestra un mensaje de error.
        }
    }

    // Método privado y estático para mostrar las reservas activas del usuario actual.
    private static void viewBookings(User user) {
        List<Booking> activeBookings = user.getBookings(); // Obtiene la lista de todas las reservas del usuario.
        System.out.println("\n=== Tus Reservas Activas ===");

        boolean hasActiveBookings = false; // Variable para rastrear si el usuario tiene alguna reserva activa.
        for (Booking booking : activeBookings) { // Itera sobre la lista de reservas del usuario.
            if (!booking.isCancelled()) { // Verifica si la reserva no está cancelada.
                System.out.println("ID: " + booking.getBookingID() + " - " + booking.getTrip()); // Muestra el ID de la reserva y la información del viaje asociado.
                hasActiveBookings = true; // Establece en true si se encuentra al menos una reserva activa.
            }
        }

        if (!hasActiveBookings) { // Si no se encontraron reservas activas.
            System.out.println("No tienes reservas activas.");
        }
    }

    // Método privado y estático para manejar la salida de la aplicación.
    private static void exitApp() {
        System.out.println("Gracias por usar la Car2GO App. ¡Hasta pronto!");
        running = false; // Establece la variable 'running' en false para que el bucle principal de la aplicación termine.
    }
}