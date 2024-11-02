module com.example.animalapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animalapp to javafx.fxml;
    exports com.example.animalapp;
}