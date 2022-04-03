package com.example.task_3;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import threads.NewThread;

public class HelloController {
    @FXML
    private Label welcomeText;
    private ProgressBar Bar;


    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setText("Loading");
        NewThread t = new NewThread("Loading thread");
    }

    protected AnimationTimer at = new AnimationTimer() {
        @Override
        public void handle(long l) {
            NewThread t = new NewThread("Loading");
        }
    }

}