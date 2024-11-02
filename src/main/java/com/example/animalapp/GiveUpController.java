package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class GiveUpController {

    @FXML
    public Button Home;
    @FXML
    public Button Contact;
    @FXML
    public Button Adopt;
    @FXML
    public Button GiveUp;
    @FXML
    public Button About;


    // Fields for various text fields and controls in the FXML file
    @FXML
    private TextField breed;

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField zipcode;

    @FXML
    private TextField city;

    @FXML
    private TextField address; // Corrected typo in variable name

    @FXML
    private TextField phonenumber;

    @FXML
    private TextArea medicalhistory;

    @FXML
    private DatePicker age;

    @FXML
    private RadioButton drop;

    @FXML
    private RadioButton pickup;

    //  handling form submission
    @FXML
    public void handleSubmit() {

        String breedText = breed.getText();
        String nameText = name.getText();
        String emailText = email.getText();
        String zipcodeText = zipcode.getText();
        String cityText = city.getText();
        String addressText = address.getText(); // Corrected variable name
        String phonenumberText = phonenumber.getText();
        String medicalhistoryText = medicalhistory.getText();
        String ageText = age.getValue() != null ? age.getValue().toString() : "";
        boolean isDrop = drop.isSelected();
        boolean isPickup = pickup.isSelected();


    }

    // handling form reset
    @FXML
    public void handleDelete() {
        // Clearing all form fields
        breed.clear();
        name.clear();
        email.clear();
        zipcode.clear();
        city.clear();
        address.clear();
        phonenumber.clear();
        medicalhistory.clear();
        age.setValue(null);
        drop.setSelected(false);
        pickup.setSelected(false);
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
        HelloApplicationAll.switchScene("hello-view.fxml");
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