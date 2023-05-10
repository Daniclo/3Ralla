package com.tresenralla;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class Controller3ralla {

    @FXML
    private Label turno;
    @FXML
    private Rectangle upleft;
    @FXML
    private Rectangle upmid;
    @FXML
    private Rectangle upright;
    @FXML
    private Rectangle centerleft;
    @FXML
    private Rectangle centermid;
    @FXML
    private Rectangle centerright;
    @FXML
    private Rectangle botleft;
    @FXML
    private Rectangle botmid;
    @FXML
    private Rectangle botright;
    @FXML
    private Label jRojo;
    @FXML
    private Label jAzul;
    private int jugador = 0;

    @FXML
    protected void iniciarPartida(String j1, String j2){
        //Rojo = 0, Azul = 1
        jRojo.setText(jRojo.getText().concat(j1));
        jAzul.setText(jAzul.getText().concat(j2));
    }


}