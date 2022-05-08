package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = this.dictionary.getRandomWord();
    }

    public Parent getView() {
        Label randomWord = new Label("Translate the word '" + this.word + "'");
        TextField input = new TextField();
        Button check = new Button("check");
        Label status = new Label("");

        GridPane layout = new GridPane();
        layout.add(randomWord, 0, 0);
        layout.add(input, 0, 1);
        layout.add(check, 0, 2);
        layout.add(status, 0, 3);

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        check.setOnAction((event)->{
            if(!this.dictionary.get(this.word).equals(input.getText())){
                status.setText("Incorrect! The translation for word " + this.word + " is " + this.dictionary.get(this.word));
            }
            else{
                status.setText("Correct!");
            }
            this.word = this.dictionary.getRandomWord();
            randomWord.setText("Translate the word '" + this.word + "'");
            input.clear();
        });
        
        return layout;
    }
}
