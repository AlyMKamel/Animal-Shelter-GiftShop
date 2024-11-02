package com.example.animalapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class interviewController {


        @FXML private CheckBox time9AMCheckBox;
        @FXML private CheckBox time11AMCheckBox;
        @FXML private CheckBox time1PMCheckBox;
        @FXML private CheckBox time230PMCheckBox;

        @FXML
        private void submitInterviewTime(ActionEvent event)throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("feedback.fxml"));
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
    }

