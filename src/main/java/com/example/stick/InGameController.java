package com.example.stick;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class InGameController {

    @FXML
    private Line stick;

    @FXML
    private Rectangle plat1;

    @FXML
    private Rectangle plat2;

    @FXML
    private Rectangle plat3;

    @FXML
    private Rectangle plat4;

    @FXML
    private Rectangle plat5;

    @FXML
    private Rectangle plat6;
    @FXML
    private Rectangle plat7;
    @FXML
    private ImageView player;


    public void stickIncrease() {
        stick.getScene().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE) {
                stick.setEndY(stick.getEndY() - 3);
            }
        });
    }

    public void new_stick() {
        stick.getScene().setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.SPACE) {
                stick.setEndX(-stick.getEndY());
                stick.setEndY(0);
                moveImageViewToStickEndX();
            }
        });

    }

    public void moveImageViewToStickEndX() {

//        if (player.getLayoutX() >= plat7.getLayoutX()){
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
//            Stage stage = (Stage) player.getScene().getWindow();
//            Parent root = null;
//            try {
//                root = loader.load();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//        }

        Translate t = new Translate();
        t.setX(0);
        t.setY(0);
        player.getTransforms().add(t);

        Duration duration = Duration.seconds(1);  // Set the duration of the animation
        double endX = stick.getEndX() - 5;  // Set the destination X coordinate

        // Using TranslateTransition
        TranslateTransition transition = new TranslateTransition(duration, player);
        transition.setToX(endX);
        transition.play();

        // Using Timeline for more control
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(duration, e -> t.setX(endX));
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
    }

    public void stickDistanceValididtyCheck(){
        
    }


}


