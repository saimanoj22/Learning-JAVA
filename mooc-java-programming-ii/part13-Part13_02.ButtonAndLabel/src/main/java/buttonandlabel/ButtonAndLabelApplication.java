package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button button = new Button("This is a button");
        Label label = new Label("This is a label");
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(button);
        flowPane.getChildren().add(label);
        
        Scene view = new Scene(flowPane);
        
        window.setScene(view);
        window.show();
    }

}
