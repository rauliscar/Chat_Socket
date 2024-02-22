package com.example.chat_clientes_socket.Cliente1;

import com.example.chat_clientes_socket.Cliente;
import com.example.chat_clientes_socket.Servidor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;


public class Cliente1Controller implements Observer, Initializable {

    @FXML
    private TextField tfMensaje;

    @FXML
    private TextArea taMensajes;
    private Servidor server;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        server = new Servidor(5000);
        server.addObserver(this);
        Thread t = new Thread(server);
        t.start();


    }

    @FXML
    void enviar(ActionEvent event) {
        String sms = "cliente 1: "+ tfMensaje.getText()+"\n";
        taMensajes.appendText(sms);

        Cliente cliente1 = new Cliente(6000, sms);
        Thread t = new Thread(cliente1);
        t.start();
        Cliente cliente2 = new Cliente(7000, sms);
        Thread t2 = new Thread(cliente2);
        t2.start();
        tfMensaje.clear();
    }

    @Override
    public void update(Observable o, Object arg) {
        this.taMensajes.appendText((String) arg);
    }



}
