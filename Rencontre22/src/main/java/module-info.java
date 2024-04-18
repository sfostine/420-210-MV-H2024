module com.example.rencontre22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rencontre22 to javafx.fxml;
    exports com.example.rencontre22;
}