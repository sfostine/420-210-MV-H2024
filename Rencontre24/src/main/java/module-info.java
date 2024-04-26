module com.example.rencontre24 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.rencontre24 to javafx.fxml;
    exports com.example.rencontre24;
}