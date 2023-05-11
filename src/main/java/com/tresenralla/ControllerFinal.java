package com.tresenralla;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerFinal {
    @FXML
    private Label labelGanador;

    public void setGanador(String ganador, String color) {
        if (color.equals("rojo")){
            labelGanador.setText("Ganador: " + ganador);
            labelGanador.setStyle("-fx-text-fill: red");
        }else if (color.equals("azul")){
            labelGanador.setText("Ganador: " + ganador);
            labelGanador.setStyle("-fx-text-fill: blue");
        }else if (color.equals("negro")){
            labelGanador.setText(ganador);
            labelGanador.setStyle("-fx-text-fill: black");
        }
    }
}