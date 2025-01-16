module com.example.stick {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stick to javafx.fxml;
    exports com.example.stick;
}