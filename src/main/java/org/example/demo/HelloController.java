package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField campoTarea;
    @FXML private ListView<String> listaTareas;

    private final ObservableList<String> tareas = FXCollections.observableArrayList();

    @FXML private void initialize() {
        listaTareas.setItems(tareas);
        listaTareas.setPlaceholder(new Label("Todavía no hay tareas"));
    }

    @FXML private void anadirTarea() {
        String texto = campoTarea.getText();
        tareas.add(texto);
        campoTarea.clear();
        System.out.println("Tareas guardadas: " + tareas);
    }
}
