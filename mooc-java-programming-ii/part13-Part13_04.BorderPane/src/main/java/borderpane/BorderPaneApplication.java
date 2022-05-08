package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window){
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("NORTH"));
        borderPane.setRight(new Label("EAST"));
        borderPane.setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(borderPane);
        window.setScene(view);
        window.show();
    }

}
