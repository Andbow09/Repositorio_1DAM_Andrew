package org.example.javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class hola extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button botonMostrar = new Button("hola");

        ImageView imageView = new ImageView();
        imageView.setFitWidth(500);  // Tamaño opcional
        imageView.setPreserveRatio(true);

        botonMostrar.setOnAction(e -> {
            Image imagen = new Image(getClass().getResource("/imagenes/ola.jpg").toExternalForm());
            imageView.setImage(imagen);
        });

        VBox root = new VBox(10, botonMostrar, imageView);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("hola");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}