package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class LoginController {
    @FXML
    private TextField UserName;

    @FXML
    private PasswordField Password;

    @FXML
    private Button Loginbutton;

    @FXML
    private void handleloginClick(ActionEvent event) throws Exception {
        String username = UserName.getText();
        String password = Password.getText();
        // Check if credentials are valid
        if (isValidCredentials(username, password)) {
            showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome, " + username + "!");


        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password. Please try again.");
        }
        showAlert(Alert.AlertType.INFORMATION, "Home", "Navigating to Home...");
        Parent root = load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String username = UserName.getText();
        String password = Password.getText();
        // Check if credentials are valid
        if (isValidCredentials(username, password)) {
            showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome, " + username + "!");


        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password. Please try again.");
        }
    }

    // Method to check if credentials are valid by reading from file
    private boolean isValidCredentials(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("signupdata.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line: " + line);
                if (line.contains("Username: " + username)) {
                    System.out.println("Username matched: " + username);
                    String nextLine = reader.readLine();
                    System.out.println("Password line: " + nextLine);
                    if (nextLine.contains("Password: " + password)) {
                        System.out.println("Password matched: " + password);
                        return true; // Found matching credentials
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Username or password not found or does not match
    }


    @FXML
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }




}
