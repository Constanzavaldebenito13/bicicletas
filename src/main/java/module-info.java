module com.hola.bicicletas {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires javafx.graphics;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.hola.bicicletas.model to com.google.gson;
    opens com.hola.bicicletas to javafx.fxml;
    opens com.hola.bicicletas.controller to javafx.fxml;

    exports com.hola.bicicletas;
}