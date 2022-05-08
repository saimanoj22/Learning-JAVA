package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
        Button button2 = new Button("To the second view!");
        Button button3 = new Button("To the third view!");
        Button button1 = new Button("To the first view!");
        
        BorderPane layout1 = new BorderPane();
        layout1.setTop(new Label("First view!"));
        layout1.setCenter(button2);
        
        VBox layout2 = new VBox();
        layout2.getChildren().add(button3);
        layout2.getChildren().add(new Label("Second view!"));
        
        GridPane layout3 = new GridPane();
        layout3.add(new Label("Third view!"), 0, 0);
        layout3.add(button1, 1, 1);
        
        Scene view1 = new Scene(layout1);
        Scene view2 = new Scene(layout2);
        Scene view3 = new Scene(layout3);
        
        button2.setOnAction((event)->{
            window.setScene(view2);
        });
        button1.setOnAction((event)->{
            window.setScene(view1);
        });
        button3.setOnAction((event)->{
            window.setScene(view3);
        });
        
        window.setScene(view1);
        window.show();
    }

}
