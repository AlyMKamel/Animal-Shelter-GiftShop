package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddAnimalController {

    // FXML annotations to link with UI components in the FXML file
    @FXML
    private TextField ageID;

    @FXML
    private TextField breedID;

    @FXML
    private TextField nameID;

    @FXML
    private TextArea notesID;

    // An instance of ViewReq class (assuming it's another controller or utility class)
    ViewReq req = new ViewReq();

    // Label for displaying information or messages
    private Label label;

    /**
     * Handles the action of passing the animal name to the next controller.
     * @param event The ActionEvent triggered when the user interacts with the UI.
     * @throws IOException If there is an error loading the next scene.
     */
    @FXML
    void passNameToNextController(ActionEvent event) throws IOException {
        // Get the text from the TextField


        // Set the text to the shared data class


        // Load the next scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewReq.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    /**
     * Clears all the input fields in the form.
     * @param event The ActionEvent triggered when the user interacts with the UI.
     */
    @FXML
    void clearFX(ActionEvent event) {
        // Clear the content of each input field
        notesID.setText(String.valueOf(""));
        nameID.setText(String.valueOf(""));
        breedID.setText(String.valueOf(""));
        ageID.setText(String.valueOf(""));
    }

    /**
     * Displays the help page.
     * @param event The ActionEvent triggered when the user interacts with the UI.
     * @throws IOException If there is an error loading the help page.
     */
    @FXML
    void HelpFX(ActionEvent event) throws IOException {
        // Load the help page scene
        Parent root = FXMLLoader.load(getClass().getResource("helpPage.fxml"));
        Scene scene = new Scene(root);
        Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Adds an animal entry and transitions to the ViewReq scene.
     * @param event The ActionEvent triggered when the user interacts with the UI.
     * @throws IOException If there is an error loading the ViewReq scene.
     */
    @FXML
    void addFX(ActionEvent event) throws IOException {
        // Load the ViewReq scene
        Parent root = FXMLLoader.load(getClass().getResource("ViewReq.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Donation");
        stage.setScene(scene);
        stage.show();
        String name = nameID.getText();
        SharedData.setName(name);
        System.out.println("name is " + name);
        String age = ageID.getText();
        SharedData.setName(age);
        System.out.println("and age is " + age);
        String breed = breedID.getText();
        SharedData.setName(breed);
        System.out.println("and its breed is " + breed);
        String notes = notesID.getText();
        SharedData.setName(notes);
        System.out.println("Notes: " + notes);
    }

    @FXML
    void HomeFX(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

}

