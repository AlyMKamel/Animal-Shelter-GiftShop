package com.example.animalapp;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ContactController {
    @FXML
    private ImageView logo;

    @FXML
    private Button Home;
    @FXML
    private Button Contact;
    @FXML
    private Button Adopt;
    @FXML
    private Button GiveUp;
    @FXML
    private Button About;
    @FXML
    private ImageView imageView;
    @FXML
    private ImageView backgroundImage;

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextArea messageArea;

    @FXML
    private Button submitButton;

    @FXML
    private Button backButton;

    @FXML
    private void handleSubmitClick() {
        String name = nameField.getText();
        String email = emailField.getText();
        String message = messageArea.getText();

        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            showAlert("Error", "Please fill out all fields.", Alert.AlertType.ERROR);
            return;
        }

        // Handle sending the contact form in a separate thread
        Thread formSubmissionThread = new Thread(() -> {
            // Perform the form submission operation here
            // (e.g., send an email, save to a database, etc.)
            boolean success = sendContactForm(name, email, message);

            // Update the UI on the JavaFX Application Thread
            Platform.runLater(() -> {
                if (success) {
                    showAlert("Success", "Your message has been sent!", Alert.AlertType.INFORMATION);
                    clearFields();
                } else {
                    showAlert("Error", "Failed to send your message. Please try again.", Alert.AlertType.ERROR);
                }
            });
        });
        formSubmissionThread.start();
    }

    private boolean sendContactForm(String name, String email, String message) {
        // Implement your logic to send the contact form here
        // (e.g., send an email, save to a database, etc.)
        // Return true if the operation is successful, false otherwise
        return true; // Replace with your actual implementation
    }

    private void clearFields() {
        nameField.clear();
        emailField.clear();
        messageArea.clear();
    }



    @FXML
    private void handleBackClick() {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void handleHomeClick(ActionEvent event) throws Exception {
        showAlert(Alert.AlertType.INFORMATION, "Home", "Navigating to Home...");
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleContactClick(ActionEvent event) throws Exception {
        showAlert(Alert.AlertType.INFORMATION, "Contact", "Navigating to Contact page...");
        Parent root = FXMLLoader.load(getClass().getResource("Contact.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Contact Us");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleAdoptClick(ActionEvent event) throws Exception {
        showAlert(Alert.AlertType.INFORMATION, "Adopt", "Navigating to Available Animals...");
        Parent root = FXMLLoader.load(getClass().getResource("Adopt.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Adopt");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleGiveUpClick(ActionEvent event) throws Exception {
        showAlert(Alert.AlertType.INFORMATION, "Give Up For Adoption", "Navigating to Give Up For Adoption page...");
        Parent root = FXMLLoader.load(getClass().getResource("GiveUp.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Give Up");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleAboutClick(ActionEvent event) throws Exception {
        showAlert(Alert.AlertType.INFORMATION, "About", "YNavigating About page.");
        Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("About Us");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleDonateClick(ActionEvent event) throws Exception {
        showAlert(Alert.AlertType.INFORMATION, "Donate", "YNavigating Donate page.");
        Parent root = FXMLLoader.load(getClass().getResource("ViewReq.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Donation");
        stage.setScene(scene);
        stage.show();
    }
}
