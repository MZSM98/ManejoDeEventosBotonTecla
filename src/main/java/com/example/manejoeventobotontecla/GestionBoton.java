package com.example.manejoeventobotontecla;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class GestionBoton implements EventHandler<ActionEvent> {

    TextField textPrueba;
    Button botonPrueba;

    public GestionBoton (Button botonPrueba, TextField textPrueba){
        this.botonPrueba = botonPrueba;
        this.textPrueba = textPrueba;
    }

    public void handle (ActionEvent event) {
        File archivo = new File ("text.txt");

        try (PrintWriter escritor = new PrintWriter (new FileWriter(archivo))){
            escritor.println(textPrueba.getText());
            escritor.flush();
            textPrueba.setText("");

        } catch (IOException e){
            System.out.println("Error al crear el archivo");
        }
    }
}
