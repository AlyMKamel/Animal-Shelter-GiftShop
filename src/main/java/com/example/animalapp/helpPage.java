package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class helpPage {

    // This method is triggered when the back button is clicked
    @FXML
    void backFX(ActionEvent event) throws IOException {
        // Load the AddAnimal.fxml file
        Parent root = FXMLLoader.load(getClass().getResource("AddAnimal.fxml"));
        // Create a new scene with the loaded FXML
        Scene scene = new Scene(root);
        // Get the current stage from the event source
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the title of the stage to "Add Animals"
        stage.setTitle("Add Animals");
        // Set the new scene on the stage
        stage.setScene(scene);
        // Show the stage with the new scene
        stage.show();
    }

}
