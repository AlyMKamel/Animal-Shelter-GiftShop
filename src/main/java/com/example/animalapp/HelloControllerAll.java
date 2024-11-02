package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloControllerAll {
    @FXML
    private Button Submit;
    @FXML private TextField ballsy;
    @FXML private TextField username;
    @FXML
    private void onKlik(){
    String feedBack= ballsy.getText();
    String userName= username.getText();
    if(feedBack.isEmpty()||userName.isEmpty()){
        showAlert("Please provide us with your feedback!");
    }
    System.out.println("Feedback has been submited from"+ ballsy );
    showAlert("Thank you for your feedback!!");

}private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    void handleHomeClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddAnimal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add Animal");
        stage.setScene(scene);
        stage.show();


    }

}