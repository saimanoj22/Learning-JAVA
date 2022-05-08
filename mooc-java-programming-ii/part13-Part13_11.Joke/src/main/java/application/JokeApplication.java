package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.getChildren().add(joke);
        menu.getChildren().add(answer);
        menu.getChildren().add(explanation);

        StackPane one = createStackPane("What do you call a bear with no teeth?");
        StackPane two = createStackPane("A gummy bear.");
        StackPane three = createStackPane("Hmm, let me google this !!!");
        
        layout.setTop(menu);
        layout.setCenter(one);
        
        Scene view = new Scene(layout);
        
        joke.setOnAction((event) -> {
            layout.setCenter(one);
        });
        answer.setOnAction((event) -> {
            layout.setCenter(two);
        });
        explanation.setOnAction((event) -> {
            layout.setCenter(three);
        });
        
        window.setScene(view);
        window.show();

    }

    public static StackPane createStackPane(String label) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(label));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
