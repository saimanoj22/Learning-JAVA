package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label flag = new Label("X");
        Label turn = new Label("Turn: X");
        turn.setFont(Font.font("Monospaced", 40));

        ArrayList<Button> buttons = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            buttons.add(new Button(" "));
            buttons.get(i).setFont(Font.font("Monospaced", 40));
        }

        BorderPane layout = new BorderPane();

        GridPane grid = new GridPane();
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid.add(buttons.get(temp), i, j);
                temp++;
            }
        }

        layout.setTop(turn);
        layout.setCenter(grid);

        buttonsActions(buttons, flag, turn);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void buttonsActions(ArrayList<Button> buttons, Label flag, Label turn) {
        for (Button button : buttons) {
            button.setOnAction((event) -> {
                if(gameWon(buttons)){
                    return;
                }
                if (!button.getText().equals(" ")) {
                    return;
                }
                button.setText(flag.getText());
                if (flag.getText().equals("X")) {
                    flag.setText("O");
                    turn.setText("Turn: O");
                } else {
                    flag.setText("X");
                    turn.setText("Turn: X");
                }
                if(gameWon(buttons) || draw(buttons)){
                    turn.setText("The end!");
                }
            });
        }
    }

    public static boolean gameWon(ArrayList<Button> buttons) {
        // test rows
        if (!buttons.get(0).getText().equals(" ")) {
            if (buttons.get(0).getText().equals(buttons.get(1).getText()) && buttons.get(0).getText().equals(buttons.get(2).getText())) {
                return true;
            }
        }
        if (!buttons.get(3).getText().equals(" ")) {
            if (buttons.get(3).getText().equals(buttons.get(4).getText()) && buttons.get(3).getText().equals(buttons.get(5).getText())) {
                return true;
            }
        }
        if (!buttons.get(6).getText().equals(" ")) {
            if (buttons.get(6).getText().equals(buttons.get(7).getText()) && buttons.get(6).getText().equals(buttons.get(8).getText())) {
                return true;
            }
        }

        // text columns
        if (!buttons.get(0).getText().equals(" ")) {
            if (buttons.get(0).getText().equals(buttons.get(3).getText()) && buttons.get(0).getText().equals(buttons.get(6).getText())) {
                return true;
            }
        }
        if (!buttons.get(1).getText().equals(" ")) {
            if (buttons.get(1).getText().equals(buttons.get(4).getText()) && buttons.get(1).getText().equals(buttons.get(7).getText())) {
                return true;
            }
        }
        if (!buttons.get(2).getText().equals(" ")) {
            if (buttons.get(2).getText().equals(buttons.get(5).getText()) && buttons.get(2).getText().equals(buttons.get(8).getText())) {
                return true;
            }
        }

        // test diagoals
        if (!buttons.get(0).getText().equals(" ")) {
            if (buttons.get(0).getText().equals(buttons.get(4).getText()) && buttons.get(0).getText().equals(buttons.get(8).getText())) {
                return true;
            }
        }
        if (!buttons.get(2).getText().equals(" ")) {
            if (buttons.get(2).getText().equals(buttons.get(4).getText()) && buttons.get(2).getText().equals(buttons.get(6).getText())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean draw(ArrayList<Button> buttons){
        for(Button button : buttons){
            if(button.getText().equals(" ")){
                return false;
            }
        }
        return true;
    }
}
