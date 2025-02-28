package com.iit.tutorials.tutorialsixteen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TutorialSixteen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader fxmlLoader = new FXMLLoader(TutorialSixteen.class.getResource("show-results.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        primaryStage.setTitle("Tutorial Sixteen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
