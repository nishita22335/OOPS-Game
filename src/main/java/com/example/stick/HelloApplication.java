package com.example.stick;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        int cherry_count;
        int high_score;

        launch();
    }
}

class Cherry {
    private Point2D location;

    public Cherry(double x, double y) {
        location = new Point2D(x, y);
    }

    public Point2D getLocation() {
        return location;
    }
}


class CherryManager {
    private ArrayList<Cherry> cherries;

    public CherryManager() {
        cherries = new ArrayList<>();
    }

    public void addCherry(double x, double y) {
        cherries.add(new Cherry(x, y));
    }

    public ArrayList<Cherry> getCherries() {
        return cherries;
    }
}

class Player {
    void moveCharacter() {
        // Handles the movement of the stick-hero character between platforms
    }

    void stretchStick() {
        // Stretches out the stick to bridge the gaps between platforms
    }

    void collectCherries() {
        // Collects cherries and increases cherry_count
    }

    void flipCharacter() {
        // Flips the character upside down to collect rewards
    }
}

class Platform {
    private int width;

    void getWidth() {
        // Get the width of the platform
    }
}

class StartGameScreen {
    public void levelSelection() {
        // Code for level selection screen
    }

    public void startGame() {
        // Code for the start game screen
    }
}

class DuringGameScreen {
    public void duringGame() {
        // Code for the gameplay phase
    }
}

class EndGameScreen {
    public void endGame() {
        // Code for the end game screen
    }
}