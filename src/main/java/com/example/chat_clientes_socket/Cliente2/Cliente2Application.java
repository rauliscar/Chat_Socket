package com.example.chat_clientes_socket.Cliente2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Cliente2Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Cliente2Application.class.getResource("cliente2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 702, 396);
        stage.setTitle("Cliente 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}