module sayul.proyectouno {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens sayul.proyectouno to javafx.fxml;
    exports sayul.proyectouno;
}
