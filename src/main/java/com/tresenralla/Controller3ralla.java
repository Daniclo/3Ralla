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
import static com.tresenralla.ControllerNombres.j1;
import static com.tresenralla.ControllerNombres.j2;

public class Controller3ralla implements Initializable {
    @FXML
    private Label mostrarTurno;
    @FXML
    private Label turnoDe;

    //Rectángulo arriba izquierda
    @FXML
    private Rectangle upleft;
    private boolean isPressedUpLeft = false;
    private String colorUpLeft;

    //Rectánhgulo arriba medio
    @FXML
    private Rectangle upmid;
    private boolean isPressedUpMid = false;
    private String colorUpMid;

    //Rectángulo arriba derecha
    @FXML
    private Rectangle upright;
    private boolean isPressedUpRight = false;
    private String colorUpRight;

    //Rectángulo centro izquierda
    @FXML
    private Rectangle centerleft;
    private boolean isPressedCenterLeft = false;
    private String colorCenterLeft;

    //Rectángulo centro medio
    @FXML
    private Rectangle centermid;
    private boolean isPressedCenterMid = false;
    private String colorCenterMid;

    //Rectángulo centro derecha
    @FXML
    private Rectangle centerright;
    private boolean isPressedCenterRight = false;
    private String colorCenterRight;

    //Rectángulo abajo izquierda
    @FXML
    private Rectangle botleft;
    private boolean isPressedBotLeft = false;
    private String colorBotLeft;

    //Rectángulo abajo medio
    @FXML
    private Rectangle botmid;
    private boolean isPressedBotMid = false;
    private String colorBotMid;

    //Rectángulo abajo derecha
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
    Boolean empate = isPressedBotLeft && isPressedBotRight && isPressedBotMid && isPressedCenterMid && isPressedCenterRight && isPressedCenterLeft && isPressedUpLeft && isPressedUpRight && isPressedUpMid;
    private final EventHandler<MouseEvent> handler = e ->{
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        turnoDe.setText("Turno azul!");
                        turnoDe.setStyle("-fx-text-fill: blue");
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
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(upmid)){
                    if (!isPressedUpMid){
                        upmid.setStyle("-fx-fill: blue");
                        isPressedUpMid=true;
                        colorUpMid = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(upright)){
                    if (!isPressedUpRight){
                        upright.setStyle("-fx-fill: blue");
                        isPressedUpRight=true;
                        colorUpRight = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(centerleft)){
                    if (!isPressedCenterLeft){
                        centerleft.setStyle("-fx-fill: blue");
                        isPressedCenterLeft=true;
                        colorCenterLeft = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(centermid)){
                    if (!isPressedCenterMid){
                        centermid.setStyle("-fx-fill: blue");
                        isPressedCenterMid=true;
                        colorCenterMid = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(centerright)){
                    if (!isPressedCenterRight){
                        centerright.setStyle("-fx-fill: blue");
                        isPressedCenterRight=true;
                        colorCenterRight = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(botleft)){
                    if (!isPressedBotLeft){
                        botleft.setStyle("-fx-fill: blue");
                        isPressedBotLeft=true;
                        colorBotLeft = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(botmid)){
                    if (!isPressedBotMid){
                        botmid.setStyle("-fx-fill: blue");
                        isPressedBotMid=true;
                        colorBotMid = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
                    }
                }
                if (e.getSource().equals(botright)){
                    if (!isPressedBotRight){
                        botright.setStyle("-fx-fill: blue");
                        isPressedBotRight=true;
                        colorBotRight = "blue";
                        accionesPorTurno++;
                        System.out.println("Jugador: " + jugador + "\nTurno: " + turno + "\nAcciones por turno: " + accionesPorTurno);
                        if (comprobarVictoria()) {
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            if (jugador == 0) {
                                controllerFinal.setGanador(j1, "rojo");
                            } else if (jugador == 1) {
                                controllerFinal.setGanador(j2, "azul");
                            }
                            Scene scene = new Scene(root, 600, 600);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setResizable(false);
                            stage.show();
                        }else if (empate){
                            System.out.println("Victoria");
                            FXMLLoader loader = new FXMLLoader(App3ralla.class.getResource("Final.fxml"));
                            Parent root;
                            try {
                                root = loader.load();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            ControllerFinal controllerFinal = loader.getController();
                            controllerFinal.setGanador("Empate","negro");
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
                        jugador= 0;
                        turnoDe.setText("Turno rojo!");
                        turnoDe.setStyle("-fx-text-fill: red");
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
        Boolean lineaHorizontalAbajoRoja = (isPressedBotLeft && isPressedBotRight && isPressedBotMid && colorBotLeft.equals("red") && colorBotRight.equals("red") && colorBotMid.equals("red"));
        Boolean lineaHorizontalAbajoAzul = (isPressedBotLeft && isPressedBotRight && isPressedBotMid && colorBotLeft.equals("blue") && colorBotRight.equals("blue") && colorBotMid.equals("blue"));
        Boolean lineaHorizontalMedioRoja = (isPressedCenterLeft && isPressedCenterMid && isPressedCenterRight && colorCenterLeft.equals("red") && colorCenterMid.equals("red") && colorCenterRight.equals("red"));
        Boolean lineaHorizontalMedioAzul = (isPressedCenterLeft && isPressedCenterMid && isPressedCenterRight && colorCenterLeft.equals("blue") && colorCenterMid.equals("blue") && colorCenterRight.equals("blue"));
        Boolean lineaHorizontalArribaRoja = (isPressedUpLeft && isPressedUpMid && isPressedUpRight && colorUpLeft.equals("red") && colorUpMid.equals("red") && colorUpRight.equals("red"));
        Boolean lineaHorizontalArribaAzul = (isPressedUpLeft && isPressedUpMid && isPressedUpRight && colorUpLeft.equals("blue") && colorUpMid.equals("blue") && colorUpRight.equals("blue"));
        Boolean lineaVerticalIzquierdaRoja = (isPressedBotLeft && isPressedCenterLeft && isPressedUpLeft && colorBotLeft.equals("red") && colorCenterLeft.equals("red") && colorUpLeft.equals("red"));
        Boolean lineaVerticalIzquierdaAzul = (isPressedBotLeft && isPressedCenterLeft && isPressedUpLeft && colorBotLeft.equals("blue") && colorCenterLeft.equals("blue") && colorUpLeft.equals("blue"));
        Boolean lineaVerticalCentralRoja = (isPressedBotMid && isPressedCenterMid && isPressedUpMid && colorBotMid.equals("red") && colorCenterMid.equals("red") && colorUpMid.equals("red"));
        Boolean lineaVerticalCentralAzul = (isPressedBotMid && isPressedCenterMid && isPressedUpMid && colorBotMid.equals("blue") && colorCenterMid.equals("blue") && colorUpMid.equals("blue"));
        Boolean lineaVerticalDerechaRoja = (isPressedBotRight && isPressedCenterRight && isPressedUpRight && colorBotRight.equals("red") && colorCenterRight.equals("red") && colorUpRight.equals("red"));
        Boolean lineaVerticalDerechaAzul = (isPressedBotRight && isPressedCenterRight && isPressedUpRight && colorBotRight.equals("blue") && colorCenterRight.equals("blue") && colorUpRight.equals("blue"));
        Boolean lineaDiagonal1Roja = (isPressedBotLeft && isPressedCenterMid && isPressedUpRight && colorBotLeft.equals("red") && colorCenterMid.equals("red") && colorUpRight.equals("red"));
        Boolean lineaDiagonal1Azul = (isPressedBotLeft && isPressedCenterMid && isPressedUpRight && colorBotLeft.equals("blue") && colorCenterMid.equals("blue") && colorUpRight.equals("blue"));
        Boolean lineaDiagonal2Roja = (isPressedUpLeft && isPressedCenterMid && isPressedBotRight && colorUpLeft.equals("red") && colorCenterMid.equals("red") && colorBotRight.equals("red"));
        Boolean lineaDiagonal2Azul = (isPressedUpLeft && isPressedCenterMid && isPressedBotRight && colorUpLeft.equals("blue") && colorCenterMid.equals("blue") && colorBotRight.equals("blue"));

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
