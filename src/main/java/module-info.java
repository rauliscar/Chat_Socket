module com.example.chat_clientes_socket {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.logging;

    opens com.example.chat_clientes_socket to javafx.fxml;
    exports com.example.chat_clientes_socket;
    exports com.example.chat_clientes_socket.Cliente1;
    opens com.example.chat_clientes_socket.Cliente1 to javafx.fxml;
    exports com.example.chat_clientes_socket.Cliente2;
    opens com.example.chat_clientes_socket.Cliente2 to javafx.fxml;
    exports com.example.chat_clientes_socket.Server;
    opens com.example.chat_clientes_socket.Server to javafx.fxml;
}