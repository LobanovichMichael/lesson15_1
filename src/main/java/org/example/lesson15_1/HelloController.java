package org.example.lesson15_1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private Button button;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.getText();
        button.setDisable(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button.setOnAction(e -> {
            welcomeText.setText("Welcome to JavaFX Application!");
            welcomeText.getText();
            button.setDisable(true);
        });


    }
}