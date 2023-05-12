package com.tresenralla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;


public class ControllerFinal {
    @FXML
    private Label labelGanador;
    protected void setGanador(String ganador, String color) {
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

        //Añadir ganador a base de datos
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/records";
            String user = "root";
            String passwd = "daniel";
            con = DriverManager.getConnection(url, user, passwd);
            Statement s = con.createStatement();

            ResultSet nombres = s.executeQuery("select nombre from record");
            while (nombres.next()){
                if (ganador.equals(nombres.getString("nombre"))){
                    PreparedStatement statementVictorias = con.prepareStatement("select victorias where nombre like ?");
                    statementVictorias.setString(1,ganador);
                    ResultSet obtenerVictorias = statementVictorias.executeQuery();
                    int victorias = obtenerVictorias.getInt("victorias");
                    victorias++;
                    PreparedStatement guardarVictorias = con.prepareStatement("update record set victorias =? where nombre=?");
                    guardarVictorias.setInt(1, victorias);
                    guardarVictorias.setString(2, ganador);
                    statementVictorias.close();
                    obtenerVictorias.close();
                    guardarVictorias.close();
                }else {
                    PreparedStatement guardarNuevoGanador = con.prepareStatement("insert into record (nombre,victorias) values (?,?)");
                    guardarNuevoGanador.setString(1,ganador);
                    guardarNuevoGanador.setInt(2,1);
                    guardarNuevoGanador.close();
                    System.out.println("ganador añadido");
                }
            }
            s.close();
            con.close();
        } catch (SQLException e) {
            System.out.println((e.getMessage()));
        }
    }
    @FXML
    protected void alPulsarVolver(ActionEvent e){
        FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Inicio.fxml"));
        Parent root;
        try {
            root = loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}