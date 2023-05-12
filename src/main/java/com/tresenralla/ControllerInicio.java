package com.tresenralla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerInicio implements Initializable {
    @FXML
    private AnchorPane root;
    Stage stage;

    @FXML
    private ImageView imagen;
    @FXML
    protected void alPulsarJugar(ActionEvent e) throws IOException {
        FXMLLoader nombres = new FXMLLoader(App3ralla.class.getResource("ElegirNombres.fxml"));
        Parent rootNombres = nombres.load();
        Scene escenaNombres = new Scene(rootNombres,450,450);
        Stage stage1 = new Stage();
        stage1.initModality(Modality.APPLICATION_MODAL);
        stage1.setResizable(false);
        stage1.setScene(escenaNombres);
        stage1.showAndWait();
        FXMLLoader juego = new FXMLLoader(App3ralla.class.getResource("View3ralla.fxml"));
        Parent rootJuego = juego.load();
        Controller3ralla c = juego.getController();
        if (ControllerNombres.j1 != null && ControllerNombres.j2 != null){
            if (ControllerNombres.j1.equals("") || ControllerNombres.j2.equals("")){
                System.out.println("Error");
            }else {
                c.iniciarPartida(ControllerNombres.j1,ControllerNombres.j2);
                Stage stage2 = (Stage) ((Node)e.getSource()).getScene().getWindow();
                Scene escenaJuego = new Scene(rootJuego,600,600);
                stage2.setScene(escenaJuego);
                stage2.setResizable(false);
                stage2.show();
            }
        }
    }
    @FXML
    protected void alPulsarVerRecords(ActionEvent e){

    }
    @FXML
    protected void alPulsarSalir(ActionEvent e){
        stage = (Stage) root.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen = new ImageView("C:\\Users\\Usuario\\IdeaProjects\\3Ralla\\image.png");
        imagen.setOpacity(100);
    }
}