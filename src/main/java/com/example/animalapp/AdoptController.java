package com.example.animalapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class AdoptController  {


    @FXML
    private TextField animalbreed;
    @FXML
    private TextField name;
    @FXML
    private TextField adoptaddress;
    @FXML
    private TextField cityy;
    @FXML
    private TextField zipcodee;
    @FXML
    private TextField emaill;
    @FXML
    private TextField pnumber;
    @FXML
    private RadioButton yes;
    @FXML
    private RadioButton no;
    @FXML
    private TextField numOfanimals;
    @FXML
    private Button Submit;
    @FXML
    private Button Delete;

    // Binds actions to buttons




    @FXML
    private void handleSubmitButtonAction() throws IOException {
        //getting form data
        String animalBreed = animalbreed.getText();
        String userName = name.getText();
        String userAddress = adoptaddress.getText();
        String city = cityy.getText();
        String zipCode = zipcodee.getText();
        String email = emaill.getText();
        String phoneNumber = pnumber.getText();
        boolean hasOtherAnimals = yes.isSelected();
        String numberOfAnimals = numOfanimals.getText();

        // Form validation
        if (animalBreed.isEmpty() || userName.isEmpty() || userAddress.isEmpty() ||
                city.isEmpty() || zipCode.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Form Error", "Please fill in all the required fields.");
            return;
        }


        // Submission success alert
        showAlert(Alert.AlertType.INFORMATION, "Adoption Request Submitted", "Your adoption request has been submitted successfully!");
        clearForm();
        showAlert(Alert.AlertType.INFORMATION, "Home", "Navigating to Home...");
        Parent root = load(getClass().getResource("hello-view.fxml"));
    }


    // Handles delete button click event. Clears the form fields.

    @FXML
    private void handleDeleteButtonAction() {
        clearForm();
    }

    // Displays an alert dialog with the specified alert type, title, and message.


    // Clears all form fields.

    private void clearForm() {
        animalbreed.clear();
        name.clear();
        adoptaddress.clear();
        cityy.clear();
        zipcodee.clear();
        emaill.clear();
        pnumber.clear();
        yes.setSelected(false);
        no.setSelected(false);
        numOfanimals.clear();
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
