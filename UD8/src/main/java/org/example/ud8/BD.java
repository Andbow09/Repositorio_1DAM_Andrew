package org.example.ud8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    private static final String HOST = "jdbc:mariadb://localhost:3307/";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE = "prueba";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(HOST + DATABASE, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la BD: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void desconectar(Connection conexion) {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la BD: " + e.getMessage());
        }
    }
}