package p5;

/*
 * Created by emailman on 10/21/2015.
 */

// This demo shows the use of a stack pane

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXDemo5 extends Application {

    @Override
    public void start(Stage primaryStage)  {

        // Create a stack pane
        StackPane pane = new StackPane();

        // Create a button
        Button bt1 = new Button("This is a big button");

        // Add the button to the pane
        pane.getChildren().add(bt1);

        // Add the pane to the scene
        Scene scene = new Scene(pane, 250, 50);

        // Setup the stage and show it
        primaryStage.setTitle("Button in a stack pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
