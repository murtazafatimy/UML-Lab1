module com.example.umllab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.umllab to javafx.fxml;
    exports com.example.umllab;
}