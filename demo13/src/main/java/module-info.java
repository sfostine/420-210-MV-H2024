module com.example.demo13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.demo13 to javafx.fxml;
    exports com.example.demo13;
}