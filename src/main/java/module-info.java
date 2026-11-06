module com.pena.pruebados {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.pena.pruebados to javafx.fxml;
    exports com.pena.pruebados;
    exports com.pena.pruebados.controller;
    opens com.pena.pruebados.controller to javafx.fxml;
}