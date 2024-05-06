package SideProjects.RPG;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RPGGUI extends Application {
    private RPGCharacter ex;
    private RPGEnemy exen;
    private int countA;


    @Override
    public void start(Stage primaryStage) {
        // Create labels
        Label nameLabel = new Label("Name:");
        Label classLabel = new Label("Class:");

        // Create text fields
        TextField nameField = new TextField();
        TextField classField = new TextField();

        // Create submit button
        Button submitButton = new Button("Create Character");
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String characterClass = classField.getText();
            ex = new RPGCharacter(name, characterClass);
            ex.printInfo();
            exen = new RPGEnemy("Goblin");        
            System.out.println("You have " + ex.getHP() + " HP");
            System.out.println("Your enemy has " + exen.getHP() + " HP");
            while(ex.getHP() > 0 && exen.getHP() > 0){
                if(countA == 0){
                    showMoveSelection(name);
                }
            }
        });

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        // Add components to layout
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(classLabel, 0, 1);
        gridPane.add(classField, 1, 1);
        gridPane.add(submitButton, 0, 2, 2, 1);

        // Set scene
        Scene scene = new Scene(gridPane, 300, 150);
        primaryStage.setTitle("RPG Character Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showMoveSelection(String characterName) {
        Stage moveStage = new Stage();
        moveStage.setTitle("Select Move");
        
        // Create radio buttons for move selection
        RadioButton attackButton = new RadioButton("Normal");
        RadioButton defendButton = new RadioButton("Defend");
        RadioButton spellButton = new RadioButton("Skill");

        ToggleGroup toggleGroup = new ToggleGroup();
        attackButton.setToggleGroup(toggleGroup);
        defendButton.setToggleGroup(toggleGroup);
        spellButton.setToggleGroup(toggleGroup);

        // Create submit button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            countA++;
            RadioButton selectedButton = (RadioButton) toggleGroup.getSelectedToggle();
            if (selectedButton != null) {
                String move = selectedButton.getText();
                System.out.println(characterName + " chose to " + move + ".");
                RPG.playerTurn(ex, exen, move);
                countA--;
                moveStage.close();
            } else {
                System.out.println("Please select a move.");
            }
        });

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        // Add components to layout
        gridPane.add(attackButton, 0, 0);
        gridPane.add(defendButton, 0, 1);
        gridPane.add(spellButton, 0, 2);
        gridPane.add(submitButton, 0, 3);

        // Set scene
        Scene scene = new Scene(gridPane, 200, 150);
        moveStage.setScene(scene);
        moveStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}