package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {
        Label enter = new Label("Enter your name and start.");
        TextField input = new TextField();
        Button start = new Button("Start");
        Label error = new Label("");
        Label greeting = new Label("");

        GridPane layout1 = new GridPane();
        layout1.add(enter, 0, 0);
        layout1.add(input, 0, 1);
        layout1.add(start, 0, 2);
        layout1.add(error, 0, 3);
        /********************************/
        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        /********************************/

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(greeting);
        /********************************/
        layout2.setPrefSize(300, 180);
        layout2.setAlignment(Pos.CENTER);
        /********************************/

        Scene view1 = new Scene(layout1);
        Scene view2 = new Scene(layout2);

        start.setOnAction((event) -> {
            if (input.getText().equals("")) {
                error.setText("Name must not be empty.");
                return;
            }
            greeting.setText("Welcome " + input.getText() + "!");
            window.setScene(view2);
        });

        window.setScene(view1);
        window.show();

    }
}
