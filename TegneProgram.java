package com.example.paint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class TegneProgram extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();     // Som en div i html

        pane.setOnMousePressed(klikk -> {           // Lager ny sirkel med museklikk
            Circle sirkel = new Circle();
            sirkel.setCenterX(klikk.getSceneX());
            sirkel.setCenterY(klikk.getSceneY());
            pane.getChildren().add(sirkel);
            pane.setOnMouseDragged(drag -> {
                double x = Math.abs(drag.getSceneX()-sirkel.getCenterX());
                double y = Math.abs(drag.getSceneY()-sirkel.getCenterY());
                if (x > y) {
                    sirkel.setRadius(x);
                }
                else {
                    sirkel.setRadius(y);
                }

            });

        });







        Scene scene = new Scene(pane, 800, 800);
        stage.setTitle("Tegneprogram");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}