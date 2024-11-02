package com.example.animalapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class ViewReq {

    @FXML
    private TextField creditID;

    @FXML
    private TextField cvvID;

    @FXML
    private TextField emailID;

    @FXML
    private TextField expID;

    @FXML
    private TextField mobID;

    @FXML
    private Label msgLabel;

    @FXML
    private TextField nameeID;


    // Clears all input fields
    @FXML
    void ClearFX(ActionEvent event) {
        nameeID.setText("");
        creditID.setText("");
        cvvID.setText("");
        expID.setText("");
        mobID.setText("");
        emailID.setText("");
    }

    // Displays a thank you message for the donation
    @FXML
    void DonateFX(ActionEvent event) throws IOException {


            Parent root = FXMLLoader.load(getClass().getResource("ViewReq.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Donation");
            stage.setScene(scene);
            stage.show();
            msgLabel.setText("Thank you for your donation!");
            String name = nameeID.getText();
            SharedData.setName(name);
            System.out.println("Name: " + name);
            String mobile = mobID.getText();
            SharedData.setName(mobile);
            System.out.println("Mobile: " + mobile);
            String email = emailID.getText();
            SharedData.setName(email);
            System.out.println("Email: " + email);
            String credit = creditID.getText();
            SharedData.setName(credit);
            System.out.println("Credit No.: " + credit);
            String exp = expID.getText();
            SharedData.setName(exp);
            System.out.println("Exp. Date: " + exp);
            System.out.println("CVV: *** ");


    }

    // Navigates back to the AddAnimal screen
    @FXML
    void backFX(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddAnimal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add Animal");
        stage.setScene(scene);
        stage.show();
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
