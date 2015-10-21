package p4;

/*
 * Created by emailman on 10/21/2015.
 */

// This demo shows a simple use of a pane

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class JavaFXDemo4 extends Application {

    @Override
    public void start(Stage primaryStage)  {

        // Create a stack pane
        Pane pane = new Pane();

        // Create a button
        Button bt1 = new Button("This is a big button");

        // Add the button to the pane
        pane.getChildren().add(bt1);

        // Add the pane to the scene
        Scene scene = new Scene(pane, 250, 50);

        // Setup the stage and show it
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
