package ru.maxple.jfxtest;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author pletnyov
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        stage.show();

        StackPane root = new StackPane();
        Circle c1 = new Circle(50);
        root.getChildren().add(c1);
        Scene scene = new Scene(root, Color.WHITE);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
