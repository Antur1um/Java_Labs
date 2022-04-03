package com.example.task_2_2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


import threads.*;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        NewThread t;
        Platform.runLater(t = new NewThread("Second thread"));
        {
            while(true){
                welcomeText.setText(t.Get_Counter());
            }



        }
    }
}