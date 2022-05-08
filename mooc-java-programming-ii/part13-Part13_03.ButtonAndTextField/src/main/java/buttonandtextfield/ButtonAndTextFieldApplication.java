package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button button = new Button("This is a button");
        TextField text = new TextField("This is a text field.");
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(button);
        flowPane.getChildren().add(text);
        
        Scene view = new Scene(flowPane);
        
        window.setScene(view);
        window.show();
    }
}
