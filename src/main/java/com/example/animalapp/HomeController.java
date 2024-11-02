package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


public class HomeController  {

    @FXML
    public ImageView logo;

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
    public ImageView backgroundImage;


    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
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



     @FXML
    private void handleContactClick(ActionEvent event) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("Contact.fxml"));
         Scene scene = new Scene(root);
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         stage.setTitle("Contact Us");
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    void handleAdoptClick(ActionEvent event) throws IOException {
        // Load the help page scene
        Parent root = FXMLLoader.load(getClass().getResource("Adopt.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add Animal");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void handleGiveUpClick(ActionEvent event) throws IOException {
        // Load the help page scene
        Parent root = FXMLLoader.load(getClass().getResource("GiveUp.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Give Up For Adoption");
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
    @FXML  void handleVoluKlik(ActionEvent event) throws IOException {
        // Load the Volunteer interface
        Parent root = FXMLLoader.load(getClass().getResource("voulnteer.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add Animal");
        stage.setScene(scene);
        stage.show();}
    @FXML  void handleFeedbacKlik(ActionEvent event) throws IOException {
        // Load the Volunteer interface
        Parent root = FXMLLoader.load(getClass().getResource("feedback.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add Animal");
        stage.setScene(scene);
        stage.show();}
}
