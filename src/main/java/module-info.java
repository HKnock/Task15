module com.example.task15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task15 to javafx.fxml;
    exports com.example.task15;
}