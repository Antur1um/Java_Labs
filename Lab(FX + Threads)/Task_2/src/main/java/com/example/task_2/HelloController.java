package com.example.task_2;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import Threads.NewThread;

/*class NewThread implements Runnable {
    private Thread t;
    private Button btn;

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t + ": T::run");
        //for (int i=5;i>0;i--)
        //{
        //System.out.println(""+ t.getName() + ": "+ i);

        //btn.setText("You've clicked: " + i);

        //final int j = i;


        Platform.runLater(new Runnable() {
            public void run() {
                Thread tInner = Thread.currentThread();
                while(true){
                    int i= 0;
                    System.out.println(i);
                    i = i+1;

                }

                //btn.setText("You've clicked: " + j);
            }
        });

        try {
            t.sleep(1000);
        }

        catch (Exception e) { }
        //}
    }
}*/




public class HelloController {
    @FXML
    public Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Button clicked");
      NewThread t = new NewThread("Second thread");
      welcomeText.setText(t.get_counter());

       }
    }
