package com.tresenralla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App3ralla extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App3ralla.class.getResource("Inicio.fxml"));
        Image icon = new Image("C:\\Users\\Usuario\\IdeaProjects\\TresEnRalla\\src\\main\\java\\com\\tresenralla\\image.png");
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("3 en ralla");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}