package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        HBox text = new HBox();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");

        text.setSpacing(10);
        text.getChildren().add(letters);
        text.getChildren().add(words);
        text.getChildren().add(longest);

        TextArea area = new TextArea();
        layout.setCenter(area);
        layout.setBottom(text);

        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int noOfWords = parts.length;
            String longestString = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            letters.setText("Letters: " + characters);
            words.setText("Words: " + noOfWords);
            longest.setText("The longest word is: " + longestString);
        });

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
