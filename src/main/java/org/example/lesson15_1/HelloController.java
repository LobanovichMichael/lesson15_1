package org.example.lesson15_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

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
}