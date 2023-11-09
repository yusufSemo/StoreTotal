package com.example.storet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controls {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void up(ActionEvent e){
        System.out.println("up");
    }
    public void down(ActionEvent e){
        System.out.println("down");
    }
    public void left(ActionEvent e){
        System.out.println("left");
    }public void right(ActionEvent e){
        System.out.println("right");
    }

}