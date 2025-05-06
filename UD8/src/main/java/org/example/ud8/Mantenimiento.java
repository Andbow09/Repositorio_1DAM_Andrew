package org.example.ud8;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mantenimiento {

    public static List<Estudiante> listar() {
        List<Estudiante> lista = new ArrayList<>();
        try (Connection con = BD.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes")) {

            while (rs.next()) {
                int nia = rs.getInt("nia");
                String nombre = rs.getString("nombre");
                LocalDate fecha = rs.getDate("fecha_nacimiento").toLocalDate();
                lista.add(new Estudiante(nia, nombre, fecha));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void insertar(Estudiante e) {
        String sql = "INSERT INTO estudiantes (nia, nombre, fecha_nacimiento) VALUES (?, ?, ?)";
        try (Connection con = BD.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, e.getNia());
            stmt.setString(2, e.getNombre());
            stmt.setDate(3, Date.valueOf(e.getFecha_nacimiento()));
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void modificar(Estudiante e) {
        String sql = "UPDATE estudiantes SET nombre=?, fecha_nacimiento=? WHERE nia=?";
        try (Connection con = BD.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, e.getNombre());
            stmt.setDate(2, Date.valueOf(e.getFecha_nacimiento()));
            stmt.setInt(3, e.getNia());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void borrar(Estudiante e) {
        String sql = "DELETE FROM estudiantes WHERE nia=?";
        try (Connection con = BD.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, e.getNia());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}