package com.mariaeduarda;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        URL fxmlLocation = Main.class.getResource("/Filme.fxml");

        if (fxmlLocation == null) {
            System.err.println("ERRO: Não foi possível encontrar Filme.fxml");
            System.err.println("Procurando em: " + Main.class.getResource("/"));
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("The Love Witch");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}