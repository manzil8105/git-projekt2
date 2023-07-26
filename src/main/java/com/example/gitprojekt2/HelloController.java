package com.example.gitprojekt2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private TextField textField;

    @FXML
    private void fun() {

        label.setText(textField.getText());
        textField.clear();


    }



}