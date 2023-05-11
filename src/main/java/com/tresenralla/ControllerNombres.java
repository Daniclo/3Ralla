package com.tresenralla;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private Label error;
    @FXML
    protected void pulsarBotonGuardarNombres(){
        if (jRojo.getText().equals("") || jAzul.getText().equals("")){
            error.setText("Error. Introduce 2 nombres");
            error.setStyle("-fx-text-fill: red");
        }else {
            j1 = jRojo.getText();
            j2 = jAzul.getText();
            Stage stage = (Stage) this.botonOk.getScene().getWindow();
            stage.close();
        }

    }
}