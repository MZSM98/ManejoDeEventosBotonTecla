module com.example.manejoeventobotontecla {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manejoeventobotontecla to javafx.fxml;
    exports com.example.manejoeventobotontecla;
}