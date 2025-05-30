package com.example.manejoeventobotontecla;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Principal extends Application {

    @Override
    public void start(Stage stage) {

        TextField textPrueba = new TextField();
        Button botonPrueba = new Button("Guardar");
        Label labelPrueba = new Label("Cerrar Ventana");
        labelPrueba.setStyle("-fx-text-fill: Blue;");
        labelPrueba.setUnderline(true);


        labelPrueba.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle (MouseEvent event) {
                stage.close();
            }

        });

        textPrueba.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle (KeyEvent event) {
                if (event.getCode() == KeyCode.ESCAPE) {

                    mostrarAlerta(event);
                }
            }
        });
        VBox panel = new VBox(10);
        panel.setAlignment(Pos.CENTER);
        panel.getChildren().addAll(textPrueba, botonPrueba, labelPrueba);

        Scene scene = new Scene(panel, 200, 200);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        GestionBoton gb = new GestionBoton(botonPrueba, textPrueba);
        botonPrueba.setOnAction(gb);
        textPrueba.setOnAction(gb);

    }

    public static void main(String[] args) {

        launch();
    }

    public void mostrarAlerta(KeyEvent event) {

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Tecla presionada");
        alerta.setHeaderText(null);
        alerta.setContentText("presionaste el botón: " + event.getCode());
        alerta.showAndWait();

    }


}