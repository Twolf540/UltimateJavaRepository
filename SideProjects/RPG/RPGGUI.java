package SideProjects.RPG;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RPGGUI extends Application {
    private RPGCharacter ex;
    private RPGEnemy exen;

    private int currentStage = 0;
    private final int CREATE_CHARACTER = 1;
    private final int DO_FIGHT = 2;
    private final int VISIT_MERCHANT = 3;

    private void doNext(Stage primaryStage) {
        currentStage++;
        if (currentStage == CREATE_CHARACTER) {
            createCharacter(primaryStage);
        } else if (currentStage == DO_FIGHT) {
            doFight(primaryStage);
        } else if (currentStage == VISIT_MERCHANT) {
            System.out.println("Merchant not yet implemented");
        } else {
            System.out.println("Uknown stage of game...");
        }
    }


    @Override
    public void start(Stage primaryStage) {
        doNext(primaryStage);
        createCharacter(primaryStage);
    
    }

    public void showMoveSelection() {
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
        RadioButton selectedButton = (RadioButton) toggleGroup.getSelectedToggle();
        if (selectedButton != null) {
            String move = selectedButton.getText();
            System.out.println(ex.getName() + " chose to " + move + ".");
            RPG.playerTurn(ex, exen, move);
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


    public void createCharacter(Stage primaryStage) {
        // Create labels
        Label nameLabel = new Label("Name:");
        Label classLabel = new Label("Class:");

        // Create text fields
        TextField nameField = new TextField();
        TextField classField = new TextField();

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        // Create submit button
        Button submitButton = new Button("Create Character");
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String characterClass = classField.getText();
            ex = new RPGCharacter(name, characterClass);
            ex.printInfo();
            exen = new RPGEnemy("Goblin");
            primaryStage.close();        
            doNext(primaryStage);
        });

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

    public void doFight(Stage primaryStage) {
        System.out.println("You have " + ex.getHP() + " HP");
        System.out.println("Your enemy has " + exen.getHP() + " HP");


        showMoveSelection();

            
    }
    public void displayFightDetails(Stage secondaryStage) {
        BorderPane root = new BorderPane();
        // Create text field
        TextField textField = new TextField();
        // Create button
        Button nextButton = new Button("Next");
        // Center the button at the bottom
        BorderPane.setAlignment(nextButton, Pos.BOTTOM_CENTER);
        BorderPane.setAlignment(textField, Pos.CENTER);
        // Add button to the bottom of the root pane
        root.setBottom(nextButton);

        // Create scene
        Scene scene = new Scene(root, 400, 300);

        secondaryStage.setTitle("Hidden Text Box and Next Button");
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}