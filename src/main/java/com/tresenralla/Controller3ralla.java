package com.tresenralla;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller3ralla implements Initializable {
    @FXML
    private Label mostrarTurno;
    @FXML
    private Rectangle upleft;
    private boolean isPressedUpLeft = false;
    private String colorUpLeft;
    @FXML
    private Rectangle upmid;
    private boolean isPressedUpMid = false;
    private String colorUpMid;
    @FXML
    private Rectangle upright;
    private boolean isPressedUpRight = false;
    private String colorUpRight;
    @FXML
    private Rectangle centerleft;
    private boolean isPressedCenterLeft = false;
    private String colorCenterLeft;
    @FXML
    private Rectangle centermid;
    private boolean isPressedCenterMid = false;
    private String colorCenterMid;
    @FXML
    private Rectangle centerright;
    private boolean isPressedCenterRight = false;
    private String colorCenterRight;
    @FXML
    private Rectangle botleft;
    private boolean isPressedBotLeft = false;
    private String colorBotLeft;
    @FXML
    private Rectangle botmid;
    private boolean isPressedBotMid = false;
    private String colorBotMid;
    @FXML
    private Rectangle botright;
    private boolean isPressedBotRight = false;
    private String colorBotRight;
    @FXML
    private Label jRojo;
    @FXML
    private Label jAzul;
    private int jugador = 0;
    private int turno = 1;
    private int accionesPorTurno = 0;
    private EventHandler<MouseEvent> handler = e ->{
        //0 -> Rojo
        //1 -> Azul
        if (jugador == 0){
            if (accionesPorTurno<1) {
                if (e.getSource().equals(upleft)) {
                    if (!isPressedUpLeft) {
                        upleft.setStyle("-fx-fill: red");
                        isPressedUpLeft = true;
                        colorUpLeft = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(upmid)) {
                    if (!isPressedUpMid) {
                        upmid.setStyle("-fx-fill: red");
                        isPressedUpMid = true;
                        colorUpMid = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(upright)) {
                    if (!isPressedUpRight) {
                        upright.setStyle("-fx-fill: red");
                        isPressedUpRight = true;
                        colorUpRight = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(centerleft)) {
                    if (!isPressedCenterLeft) {
                        centerleft.setStyle("-fx-fill: red");
                        isPressedCenterLeft = true;
                        colorCenterLeft = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(centermid)) {
                    if (!isPressedCenterMid) {
                        centermid.setStyle("-fx-fill: red");
                        isPressedCenterMid = true;
                        colorCenterMid = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(centerright)) {
                    if (!isPressedCenterRight) {
                        centerright.setStyle("-fx-fill: red");
                        isPressedCenterRight = true;
                        colorCenterRight = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(botleft)) {
                    if (!isPressedBotLeft) {
                        botleft.setStyle("-fx-fill: red");
                        isPressedBotLeft = true;
                        colorBotLeft = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(botmid)) {
                    if (!isPressedBotMid) {
                        botmid.setStyle("-fx-fill: red");
                        isPressedBotMid = true;
                        colorBotMid = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
                if (e.getSource().equals(botright)) {
                    if (!isPressedBotRight) {
                        botright.setStyle("-fx-fill: red");
                        isPressedBotRight = true;
                        colorBotRight = "red";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador = 1;
                    }
                }
            }
        }else if (jugador ==1){
            if (accionesPorTurno<1){
                if (e.getSource().equals(upleft)){
                    if (!isPressedUpLeft){
                        upleft.setStyle("-fx-fill: blue");
                        isPressedUpLeft=true;
                        colorUpLeft = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(upmid)){
                    if (!isPressedUpMid){
                        upmid.setStyle("-fx-fill: blue");
                        isPressedUpMid=true;
                        colorUpMid = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(upright)){
                    if (!isPressedUpRight){
                        upright.setStyle("-fx-fill: blue");
                        isPressedUpRight=true;
                        colorUpRight = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(centerleft)){
                    if (!isPressedCenterLeft){
                        centerleft.setStyle("-fx-fill: blue");
                        isPressedCenterLeft=true;
                        colorCenterLeft = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(centermid)){
                    if (!isPressedCenterMid){
                        centermid.setStyle("-fx-fill: blue");
                        isPressedCenterMid=true;
                        colorCenterMid = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(centerright)){
                    if (!isPressedCenterRight){
                        centerright.setStyle("-fx-fill: blue");
                        isPressedCenterRight=true;
                        colorCenterRight = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(botleft)){
                    if (!isPressedBotLeft){
                        botleft.setStyle("-fx-fill: blue");
                        isPressedBotLeft=true;
                        colorBotLeft = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(botmid)){
                    if (!isPressedBotMid){
                        botmid.setStyle("-fx-fill: blue");
                        isPressedBotMid=true;
                        colorBotMid = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
                if (e.getSource().equals(botright)){
                    if (!isPressedBotRight){
                        botright.setStyle("-fx-fill: blue");
                        isPressedBotRight=true;
                        colorBotRight = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador==0){
                                controllerFinal.setGanador(jRojo.getText(), "rojo");
                            }else if (jugador==1){
                                controllerFinal.setGanador(jAzul.getText(), "azul");
                            }
                            Parent root = null;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            Scene scene = new Scene(root,600,600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }
                        System.out.println("Ha salido de la comprobación");
                        accionesPorTurno = 0;
                        turno++;
                        mostrarTurno.setText(String.valueOf(turno));
                        jugador= 0;
                    }
                }
            }
        }
    };
    @FXML
    protected void iniciarPartida(String j1, String j2){
        //Rojo = 0, Azul = 1
        jRojo.setText(jRojo.getText().concat(j1));
        jRojo.setStyle("-fx-text-fill: red");
        jAzul.setText(jAzul.getText().concat(j2));
        jAzul.setStyle("-fx-text-fill: blue");
    }

    private boolean comprobarVictoria() {
        //Definir condiciones de victoria:
        Boolean lineaHorizontalAbajoRoja = (isPressedBotLeft && isPressedBotRight && isPressedBotMid && colorBotLeft.equals("rojo") && colorBotRight.equals("rojo") && colorBotMid.equals("rojo"));
        Boolean lineaHorizontalAbajoAzul = (isPressedBotLeft && isPressedBotRight && isPressedBotMid && colorBotLeft.equals("azul") && colorBotRight.equals("azul") && colorBotMid.equals("azul"));
        Boolean lineaHorizontalMedioRoja = (isPressedCenterLeft && isPressedCenterMid && isPressedCenterRight && colorCenterLeft.equals("rojo") && colorCenterMid.equals("rojo") && colorCenterRight.equals("rojo"));
        Boolean lineaHorizontalMedioAzul = (isPressedCenterLeft && isPressedCenterMid && isPressedCenterRight && colorCenterLeft.equals("azul") && colorCenterMid.equals("azul") && colorCenterRight.equals("azul"));
        Boolean lineaHorizontalArribaRoja = (isPressedUpLeft && isPressedUpMid && isPressedUpRight && colorUpLeft.equals("rojo") && colorUpMid.equals("rojo") && colorUpRight.equals("rojo"));
        Boolean lineaHorizontalArribaAzul = (isPressedUpLeft && isPressedUpMid && isPressedUpRight && colorUpLeft.equals("azul") && colorUpMid.equals("azul") && colorUpRight.equals("azul"));
        Boolean lineaVerticalIzquierdaRoja = (isPressedBotLeft && isPressedCenterLeft && isPressedUpLeft && colorBotLeft.equals("rojo") && colorCenterLeft.equals("rojo") && colorUpLeft.equals("rojo"));
        Boolean lineaVerticalIzquierdaAzul = (isPressedBotLeft && isPressedCenterLeft && isPressedUpLeft && colorBotLeft.equals("azul") && colorCenterLeft.equals("azul") && colorUpLeft.equals("azul"));
        Boolean lineaVerticalCentralRoja = (isPressedBotMid && isPressedCenterMid && isPressedUpMid && colorBotMid.equals("rojo") && colorCenterMid.equals("rojo") && colorUpMid.equals("rojo"));
        Boolean lineaVerticalCentralAzul = (isPressedBotMid && isPressedCenterMid && isPressedUpMid && colorBotMid.equals("azul") && colorCenterMid.equals("azul") && colorUpMid.equals("azul"));
        Boolean lineaVerticalDerechaRoja = (isPressedBotRight && isPressedCenterRight && isPressedUpRight && colorBotRight.equals("rojo") && colorCenterRight.equals("rojo") && colorUpRight.equals("rojo"));
        Boolean lineaVerticalDerechaAzul = (isPressedBotRight && isPressedCenterRight && isPressedUpRight && colorBotRight.equals("azul") && colorCenterRight.equals("azul") && colorUpRight.equals("azul"));
        Boolean lineaDiagonal1Roja = (isPressedBotLeft && isPressedCenterMid && isPressedUpRight && colorBotLeft.equals("rojo") && colorCenterMid.equals("rojo") && colorUpRight.equals("rojo"));
        Boolean lineaDiagonal1Azul = (isPressedBotLeft && isPressedCenterMid && isPressedUpRight && colorBotLeft.equals("azul") && colorCenterMid.equals("azul") && colorUpRight.equals("azul"));
        Boolean lineaDiagonal2Roja = (isPressedUpLeft && isPressedCenterMid && isPressedBotRight && colorUpLeft.equals("rojo") && colorCenterMid.equals("rojo") && colorBotRight.equals("rojo"));
        Boolean lineaDiagonal2Azul = (isPressedUpLeft && isPressedCenterMid && isPressedBotRight && colorUpLeft.equals("azul") && colorCenterMid.equals("azul") && colorBotRight.equals("azul"));

        //Devolver true si se cumple alguna de las condiciones de victoria (del mismo color):
        return lineaHorizontalAbajoRoja || lineaHorizontalAbajoAzul || lineaHorizontalMedioRoja || lineaHorizontalMedioAzul || lineaHorizontalArribaRoja || lineaHorizontalArribaAzul ||
                lineaVerticalIzquierdaRoja || lineaVerticalIzquierdaAzul || lineaVerticalCentralRoja || lineaVerticalCentralAzul || lineaVerticalDerechaRoja || lineaVerticalDerechaAzul ||
                lineaDiagonal1Roja || lineaDiagonal1Azul || lineaDiagonal2Roja || lineaDiagonal2Azul;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        botleft.setOnMouseClicked(handler);
        botmid.setOnMouseClicked(handler);
        botright.setOnMouseClicked(handler);
        centerleft.setOnMouseClicked(handler);
        centermid.setOnMouseClicked(handler);
        centerright.setOnMouseClicked(handler);
        upleft.setOnMouseClicked(handler);
        upmid.setOnMouseClicked(handler);
        upright.setOnMouseClicked(handler);
    }
}