package com.example.animalapp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class eedbackController {

    @FXML private TextArea feedbackTextArea;

   // @FXML
    //private void initialize() {
      //  submitButton.setDisable(true); // Disable submit button initially(faded out)
   // }

    @FXML
    private void submitFeedback() {
        String feedback = feedbackTextArea.getText();

        if (feedback.isEmpty()) {
            showAlert("Please provide your feedback.");
            return;
        }


        System.out.println("Feedback submitted: " + feedback);
        showAlert("Thank you for your feedback! We will reach you with an e-mail from us soon!"
                );
    }
    @FXML private void onBackAction(ActionEvent event)throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("...");
        stage.setScene(scene);
        stage.show();
    }


    private void showAlert(String message) {
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

//***NOTE*** IF THE CODE IS NOT RUNNING, ONE OF THE METHODS (onBackAction or initialize) IS GIVEN FOR A CERTAIN
//BUTTON OR TEXTFIELD. EITHER REVEAL THE CODE TO THE COMPILER AGAIN BY REMOVING THE // OR
// REMOVE THE METHODS FROM THE USER FUNTIONALITY
