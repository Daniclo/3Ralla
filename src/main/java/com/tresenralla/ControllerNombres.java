package com.tresenralla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerNombres {
    public static String j1;
    public static String j2;
    @FXML
    private TextField jRojo;
    @FXML
    private TextField jAzul;
    @FXML
    private Button botonOk;
    @FXML
    protected void pulsarBotonGuardarNombres(){
        j1 = jRojo.getText();
        j2 = jAzul.getText();
        Stage stage = (Stage) this.botonOk.getScene().getWindow();
        stage.close();
    }
}