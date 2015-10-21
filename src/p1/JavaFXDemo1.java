package p1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/*
 * Created by emailman on 10/20/2015.
 */
public class JavaFXDemo1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Build a button object
        Button btOK = new Button("OK");

        // Build a scene with a button in it
        Scene scene = new Scene(btOK, 200, 250);

        // Setup the stage and show it
        primaryStage.setTitle("Welcome to JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
