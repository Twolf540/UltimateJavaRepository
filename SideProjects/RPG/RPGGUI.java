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
    private static RPGCharacter ex;
    private static RPGEnemy exen;

    private static int currentStage = 0;
    private static final int CREATE_CHARACTER = 1;
    private static final int DO_FIGHT = 2;
    private static final int VISIT_MERCHANT = 3;

    private static String fightText = "test";
    private static Stage primaryStage = new Stage();
    private static Stage secondaryStage = new Stage();
    private static void doNext(Stage primaryStage) {
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

    public static void showMoveSelection() {
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
            RPGGUI.displayFightDetails(secondaryStage, move);
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


    public static void createCharacter(Stage primaryStage) {
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

    public static void doFight(Stage primaryStage) {
        System.out.println("You have " + ex.getHP() + " HP");
        System.out.println("Your enemy has " + exen.getHP() + " HP");
        showMoveSelection();

            
    }
    public static void displayFightDetails(Stage secondaryStage, String move) {
        fightText = RPG.playerTurn(ex, exen, move);
        Label t = new Label(fightText);
        
        GridPane g = new GridPane();
        g.setPadding(new Insets(10));
        g.setHgap(10);
        g.setVgap(5);
        // check to see if text is null
        if(fightText.equals(null)){
            System.out.println("Done fighting");
            primaryStage.close();
            secondaryStage.close();
        }
        // Create button
        Button nextButton = new Button("Next");
        nextButton.setOnAction(e -> {
            RPGGUI.doFight(primaryStage);
            secondaryStage.close();
        });
        // Center the button at the bottom
        g.add(t, 0, 0);
        g.add(nextButton, 15, 49);
        // Create scene
        Scene scene = new Scene(g, 400, 300);
        secondaryStage.setTitle("Outcome");
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}