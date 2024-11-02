package com.example.animalapp;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class voulnteer {

    @FXML private TextField emailTextField;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField phoneNumberTextField;

    @FXML
    private void resetForm() {
        emailTextField.clear();
        firstNameTextField.clear();
        lastNameTextField.clear();
        phoneNumberTextField.clear();
    }

    @FXML
    private void submitForm(ActionEvent event)throws IOException{
        String email = emailTextField.getText();
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();

        // Validation logic (check if fields are empty or incorrect)
        if (email.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || phoneNumber.isEmpty()) {
            showAlert("Please fill in all fields.");
            return;
        }
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            showAlert("Invalid email format.");
            return;
        }
        Parent root = FXMLLoader.load(getClass().getResource("interview.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("...");
        stage.setScene(scene);
        stage.show();
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



    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}


