package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

/**
 * Controller class for sign-up functionality.
 */
public class SignUpController {
    @FXML
    private TextField Username; // Text field for entering username

    @FXML
    private TextField Email; // Text field for entering email address

    @FXML
    private PasswordField Password; // Password field for entering password

    @FXML
    private PasswordField Passwordretype; // Password field for re-entering password

    @FXML
    private Button Signup; // Button for sign-up action


    //Handles the sign-up button action.
    @FXML
    private void handleSignUPClick(ActionEvent event) throws Exception {


            String username = Username.getText(); // Get username from text field
            String email = Email.getText(); // Get email from text field
            String password = Password.getText(); // Get password from password field
            String passwordRetype = Passwordretype.getText(); // Get re-entered password from password field

            // Check if passwords match
            if (password.equals(passwordRetype)) {
                showAlert(Alert.AlertType.INFORMATION, "Sign-Up Successful", "Welcome, " + username + "!");
                saveUserData(username, password); // Save user data
        showAlert(Alert.AlertType.INFORMATION, "log in", "Navigating to log in...");
        Parent root = load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
            } else {
                showAlert(Alert.AlertType.ERROR, "Sign-Up Failed", "Passwords do not match. Please try again.");
            }


    }



    //Handles the sign-up button action.

    /*@FXML
    private void handleSignUpButtonAction() {
        String username = Username.getText(); // Get username from text field
        String email = Email.getText(); // Get email from text field
        String password = Password.getText(); // Get password from password field
        String passwordRetype = Passwordretype.getText(); // Get re-entered password from password field

        // Check if passwords match
        if (password.equals(passwordRetype)) {
            showAlert(Alert.AlertType.INFORMATION, "Sign-Up Successful", "Welcome, " + username + "!");
            saveUserData(username, password); // Save user data

        } else {
            showAlert(Alert.AlertType.ERROR, "Sign-Up Failed", "Passwords do not match. Please try again.");
        }
    }*/

    // Method to save user data into a file
    private void saveUserData(String username, String password) {
        try {
            FileWriter writer = new FileWriter("signupdata.txt", true); // Append mode
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType); // Create new alert dialog
        alert.setTitle(title); // Set title
        alert.setHeaderText(null); // Set header text to null
        alert.setContentText(message); // Set message content
        alert.showAndWait(); // Display alert dialog and wait for user interaction
    }


}