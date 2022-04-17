package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import network.Network;




public class HelloController {

    String temp_s;


    @FXML
    private Label window_output;

    @FXML
    public Label label_2;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnMult; //Умножение

    @FXML
    private Button btnDev; //Деление

    @FXML
    private Button btnDel;

    @FXML
    private Button btnC;

    @FXML
    private Button btnEq;

    @FXML
    void act0(ActionEvent event) {
        temp_s = window_output.getText();
        window_output .setText(temp_s + btn0.getText());
    }
    @FXML
    void act1(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn1.getText());
    }

    @FXML
    void act2(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn2.getText());
    }

    @FXML
    void act3(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn3.getText());
    }

    @FXML
    void act4(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn4.getText());
    }

    @FXML
    void act5(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn5.getText());
    }

    @FXML
    void act6(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn6.getText());
    }

    @FXML
    void act7(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn7.getText());
    }

    @FXML
    void act8(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn8.getText());
    }

    @FXML
    void act9(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn9.getText());
    }

    @FXML
    void actPlus(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btnPlus.getText());
    }

    @FXML
    void actMinus(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btnMinus.getText());
    }

    @FXML
    void actMult(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btnMult.getText());
    }

    @FXML
    void actDev(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btnDev.getText());
    }

    @FXML
    void act_c(ActionEvent event) {
        window_output.setText("");
    }

    @FXML
    void act_dot(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btnDot.getText());
    }

    @FXML
    void act_eq(ActionEvent event) {
        temp_s = window_output.getText();
        Network network = Network.getInstance();
        network.send(temp_s);
        window_output.setText(network.get());
    }

}