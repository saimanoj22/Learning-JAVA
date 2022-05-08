package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        VBox contents = new VBox();
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) ->{
            label.setText(text.getText());
        });
        
        contents.getChildren().add(text);
        contents.getChildren().add(button);
        contents.getChildren().add(label);
        
        Scene view = new Scene(contents);
        window.setScene(view);
        window.show();
    }

}
