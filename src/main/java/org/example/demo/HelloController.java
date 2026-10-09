package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField campoTarea;

    private final ObservableList<String> tareas = FXCollections.observableArrayList();

    @FXML private void anadirTarea() {
        String texto = campoTarea.getText();
        tareas.add(texto);
        System.out.println("Tareas guardadas: " + tareas);
    }
}
