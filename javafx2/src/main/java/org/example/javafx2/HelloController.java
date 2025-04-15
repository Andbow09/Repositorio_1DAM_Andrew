package org.example.javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    static int contador;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button sumar;

    @FXML
    private Label contador_etiqueta;

    @FXML
    public void initialize() {
        sumar.setOnAction(o -> contador_etiqueta.setText(Integer.toString(++contador)));
        System.out.println(contador);
    }
}