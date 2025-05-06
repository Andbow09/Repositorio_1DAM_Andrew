package org.example.ud8;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.time.LocalDate;

public class HelloController {
    @FXML private TableView<Estudiante> tablaEstudiantes;
    @FXML private TableColumn<Estudiante, Integer> colNia;
    @FXML private TableColumn<Estudiante, String> colNombre;
    @FXML private TableColumn<Estudiante, LocalDate> colFecha;
    @FXML private TextField tfNia;
    @FXML private TextField tfNombre;
    @FXML private DatePicker dpFechaNacimiento;
    @FXML private Button btnGuardar;
    @FXML private Button btnInsertar;
    @FXML private Button btnEditar;
    @FXML private Button btnEliminar;
    private Connection conexion;
    private String originalNombre;
    private LocalDate originalFechaNacimiento;
    private int originalNia;


    private ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();
    private Estudiante seleccionado = null;

    @FXML
    public void initialize() {
        btnGuardar.setDisable(true);

        conexion = Main.conexion(); // ← ahora tienes acceso a la base de datos

        colNia.setCellValueFactory(new PropertyValueFactory<>("nia"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colFecha.setCellValueFactory(data ->
                new ReadOnlyObjectWrapper<>(data.getValue().getFecha_nacimiento())
        );

        cargarDatosDesdeBD(); // método que llama al SELECT y actualiza la tabla
        tablaEstudiantes.setItems(listaEstudiantes);
    }


    private void cargarDatosDesdeBD() {
        listaEstudiantes.clear();
        String query = "SELECT * FROM estudiantes";

        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int nia = rs.getInt("nia");
                String nombre = rs.getString("nombre");
                LocalDate fecha = rs.getDate("fecha_nacimiento").toLocalDate();
                listaEstudiantes.add(new Estudiante(nia, nombre, fecha));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void insertar() {
        int nia = Integer.parseInt(tfNia.getText());
        String nombre = tfNombre.getText();
        LocalDate fecha = dpFechaNacimiento.getValue();

        String query = "INSERT INTO estudiantes (nia, nombre, fecha_nacimiento) VALUES (?, ?, ?)";

        try {
            PreparedStatement pstmt = conexion.prepareStatement(query);
            pstmt.setInt(1, nia);
            pstmt.setString(2, nombre);
            pstmt.setDate(3, Date.valueOf(fecha));
            pstmt.executeUpdate();

            cargarDatosDesdeBD(); // para que se actualice la tabla automáticamente

            listaEstudiantes.add(new Estudiante(nia,nombre,fecha));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void eliminar() {
        Estudiante seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            int nia = seleccionado.getNia();
            String query = "DELETE FROM estudiantes WHERE nia = ?";

            try {
                PreparedStatement pstmt = conexion.prepareStatement(query);
                pstmt.setInt(1, nia);
                pstmt.executeUpdate();

                listaEstudiantes.remove(seleccionado);
                tablaEstudiantes.refresh();

                // Limpiar campos si el estudiante eliminado estaba siendo editado
                tfNia.clear();
                tfNombre.clear();
                dpFechaNacimiento.setValue(null);
                btnGuardar.setDisable(true);
                btnInsertar.setDisable(false);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No hay estudiante seleccionado.");
        }
    }

    @FXML
    private void editar() {
        Estudiante seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            tfNia.setText(String.valueOf(seleccionado.getNia()));
            tfNombre.setText(seleccionado.getNombre());
            dpFechaNacimiento.setValue(seleccionado.getFecha_nacimiento());

            originalNia = seleccionado.getNia();
            originalNombre = seleccionado.getNombre();
            originalFechaNacimiento = seleccionado.getFecha_nacimiento();

            btnGuardar.setDisable(true); // Aún no hay cambios
            btnInsertar.setDisable(true);

            // Añadir listeners solo después de cargar los datos
            addChangeListeners();
        }
    }

    @FXML
    private void guardar() {
        Estudiante seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            int nia = Integer.parseInt(tfNia.getText());
            String nombre = tfNombre.getText();
            LocalDate fecha = dpFechaNacimiento.getValue();

            String query = "UPDATE estudiantes SET nombre = ?, fecha_nacimiento = ? WHERE nia = ?";

            try {
                PreparedStatement pstmt = conexion.prepareStatement(query);
                pstmt.setString(1, nombre);
                pstmt.setDate(2, Date.valueOf(fecha));
                pstmt.setInt(3, nia);
                pstmt.executeUpdate();

                seleccionado.setNombre(nombre);
                seleccionado.setFecha_nacimiento(fecha);
                tablaEstudiantes.refresh();

                // Restaurar estado de botones
                btnGuardar.setDisable(true);
                btnInsertar.setDisable(false);

                initialize();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void addChangeListeners() {
        // Listeners para los TextFields y DatePicker
        tfNia.textProperty().addListener((observable, oldValue, newValue) -> checkChanges());
        tfNombre.textProperty().addListener((observable, oldValue, newValue) -> checkChanges());
        dpFechaNacimiento.valueProperty().addListener((observable, oldValue, newValue) -> checkChanges());
    }

    private void checkChanges() {
        String currentNombre = tfNombre.getText();
        LocalDate currentFecha = dpFechaNacimiento.getValue();

        // Compara los valores actuales con los originales
        if (!currentNombre.equals(originalNombre) || !currentFecha.equals(originalFechaNacimiento)) {
            btnGuardar.setDisable(false);  // Habilita el botón Guardar si hay cambios
        } else {
            btnGuardar.setDisable(true);   // Deshabilita el botón Guardar si no hay cambios
        }
    }
}