package com.example.stick;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void shiftToShop() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("buy_cherries.fxml"));
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void In_Game() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("in_game.fxml"));
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        InGameController controller = loader.getController();
        controller.stickIncrease();
        controller.new_stick();
        controller.moveImageViewToStickEndX();

    }


}