package org.example.project.Services;

import org.example.project.Models.User; // Importa la clase User del paquete Models para poder trabajar con objetos de tipo User.
import java.util.ArrayList; // Importa la clase ArrayList para crear una lista dinámica de objetos User.
import java.util.List; // Importa la interfaz List para definir el tipo de la colección de usuarios.

public class UserService {
    private static List<User> users = new ArrayList<>(); // Declara una lista estática y privada llamada 'users' para almacenar todos los objetos User registrados en el sistema. Al ser estática, pertenece a la clase y no a una instancia específica. Se inicializa con un ArrayList para poder añadir y gestionar los usuarios.
    private static int nextId = 1; // Declara una variable estática y privada llamada 'nextId' para llevar la cuenta del próximo ID a asignar a un nuevo usuario. Se inicializa en 1.

    static {
        // Bloque de inicialización estático. Este código se ejecuta una sola vez cuando la clase UserService se carga en memoria.
        // Se utiliza para inicializar datos estáticos.
        users.add(new User(1, "Admin", "admin@test.com", "admin123", true)); // Crea un nuevo objeto User con ID 1, nombre "Admin", correo "admin@test.com", contraseña "admin123" y lo marca como conductor (true). Este usuario se añade a la lista 'users'.
        users.add(new User(2, "Cliente", "cliente@test.com", "cliente123", false)); // Crea un nuevo objeto User con ID 2, nombre "Cliente", correo "cliente@test.com", contraseña "cliente123" y lo marca como no conductor (false). Este usuario también se añade a la lista 'users'.
    }

    // Método estático para realizar el inicio de sesión de un usuario. Recibe el correo electrónico y la contraseña como argumentos.
    public static User login(String email, String password) {
        return users.stream() // Crea un flujo (Stream) a partir de la lista 'users'.
                .filter(u -> u.getEmail().equals(email) && u.checkPassword(password)) // Filtra el flujo, manteniendo solo los usuarios cuyo correo electrónico coincida con el proporcionado Y cuya contraseña (verificada con el método 'checkPassword()' de la clase User) también coincida con la proporcionada.
                .findFirst() // Intenta encontrar el primer usuario que cumpla con el filtro.
                .orElse(null); // Si se encuentra un usuario, lo devuelve. Si no se encuentra ninguno, devuelve null.
    }

    // Método estático para registrar un nuevo usuario en el sistema. Recibe el nombre, correo electrónico, contraseña y si es conductor como argumentos.
    public static void register(String name, String email, String password, boolean isDriver) {
        users.add(new User(nextId++, name, email, password, isDriver)); // Crea un nuevo objeto User con el próximo ID disponible (obtenido de 'nextId' y luego incrementado), el nombre, correo electrónico, contraseña y la indicación de si es conductor proporcionados. Este nuevo usuario se añade a la lista 'users'.
    }
}