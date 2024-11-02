package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutUsController {
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
    private TextArea aboutUsText;

    @FXML
    private Button back;

    @FXML
    private void handleBackClick() {
        System.out.println("Back button clicked");

    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void handleHomeClick(ActionEvent event) throws IOException {
        // Load the help page scene
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
        stage.setTitle("Contact");
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
        Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("About Us");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void handleDonateClick(ActionEvent event) throws IOException {
        // Load the help page scene
        Parent root = FXMLLoader.load(getClass().getResource("ViewReq.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Donation");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void handleAddClick(ActionEvent event) throws IOException {
        // Load the help page scene
        Parent root = FXMLLoader.load(getClass().getResource("AddAnimal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add Animal");
        stage.setScene(scene);
        stage.show();


    }
}
