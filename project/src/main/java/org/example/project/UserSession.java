package org.example.project;

import org.example.project.Models.User; // Importa la clase User del paquete Models, que representa a los usuarios del sistema.

public class UserSession {
    private static UserSession instance; // Declara una instancia estática de la clase UserSession. Esta variable mantendrá la única instancia de esta clase (patrón Singleton). Inicialmente es null.
    private User currentUser; // Declara una variable de instancia para almacenar el objeto User del usuario que ha iniciado sesión actualmente.

    // Constructor privado de la clase UserSession. Al ser privado, evita que se puedan crear instancias de esta clase directamente desde fuera. Esto es fundamental para el patrón Singleton.
    private UserSession() {}

    // Método estático para obtener la única instancia de UserSession. Este es el punto de acceso para obtener la sesión del usuario.
    public static UserSession getInstance() {
        if (instance == null) { // Verifica si la instancia ya ha sido creada. Si es la primera vez que se llama a este método, 'instance' será null.
            instance = new UserSession(); // Crea una nueva instancia de UserSession solo si aún no existe.
        }
        return instance; // Devuelve la única instancia de UserSession.
    }

    // Método para establecer el usuario actual de la sesión. Recibe un objeto User como argumento.
    public void setCurrentUser(User user) {
        this.currentUser = user; // Asigna el objeto User proporcionado a la variable de instancia 'currentUser', almacenando así el usuario que ha iniciado sesión.
    }

    // Método para obtener el usuario actual de la sesión.
    public User getCurrentUser() {
        return currentUser; // Devuelve el objeto User que representa al usuario actualmente logueado. Si ningún usuario ha iniciado sesión, esta variable podría ser null.
    }
}