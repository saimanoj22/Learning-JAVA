package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {

    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        Label word = new Label("Word");
        Label translation = new Label("Translation");
        TextField wordText = new TextField();
        TextField translateText = new TextField();
        Button add = new Button("Add the word pair");

        GridPane layout = new GridPane();
        layout.add(word, 0, 0);
        layout.add(wordText, 0, 1);
        layout.add(translation, 0, 2);
        layout.add(translateText, 0, 3);
        layout.add(add, 0, 4);

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        add.setOnAction((event)->{
            this.dictionary.add(wordText.getText(), translateText.getText());
            wordText.clear();
            translateText.clear();
        });

        return layout;
    }
}
