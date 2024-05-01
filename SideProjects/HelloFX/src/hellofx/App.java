package hellofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label for character name
        Label nameLabel = new Label("Enter your character name:");

        // Create a text field for character name input
        TextField nameInput = new TextField();

        // Create a VBox layout to hold the components
        VBox vbox = new VBox(10); // 10 pixels spacing
        vbox.setPadding(new Insets(20)); // 20 pixels padding
        vbox.getChildren().addAll(nameLabel, nameInput);

        // Create a scene and set it on the stage
        Scene scene = new Scene(vbox, 300, 150); // Width, Height
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple RPG");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}