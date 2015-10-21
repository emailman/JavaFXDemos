package p2;

/**
 * Created by emailman on 10/21/2015.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXDemo2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(150);
        circle.setRadius(50);
        circle.setStroke(Color.RED);
        circle.setFill(Color.AQUA);

        // Create a pane and add the circle to it
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Create a scene and add the pane to it
        Scene scene = new Scene(pane, 200, 200);

        // Setup the stage and add the scene to it
        primaryStage.setTitle("Show a circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
