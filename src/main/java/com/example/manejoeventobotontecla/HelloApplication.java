package com.example.manejodeeventos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        TextField textPrueba = new TextField();
        Button botonPrueba = new Button("Test");

        VBox panel = new VBox(10);
        panel.setAlignment(Pos.CENTER);
        panel.getChildren().addAll(textPrueba, botonPrueba);

        Scene scene = new Scene(panel, 300, 300);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        com.example.proyectoaplicacoinesdeescritorio.GestionBoton gb = new com.example.proyectoaplicacoinesdeescritorio.GestionBoton(botonPrueba, textPrueba);
        botonPrueba.setOnAction(gb);
        textPrueba.setOnAction(gb);

    }

    public static void main(String[] args) {

        launch();
    }


}