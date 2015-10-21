package p3;

/**
 * Created by emailman on 10/21/2015.
 */

// This demo shows property binding

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXDemo3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();

        // Create a circle
        Circle circle = new Circle();

        // Bind the center property
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        circle.setRadius(50);
        circle.setStroke(Color.MAROON);
        circle.setFill(Color.YELLOW);

        // Add the circle to the pane
        pane.getChildren().add(circle);

        // Create a scene and add the pane to it
        Scene scene = new Scene(pane, 200, 200);

        // Setup the stage and add the scene to it
        primaryStage.setTitle("Show a centered circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
