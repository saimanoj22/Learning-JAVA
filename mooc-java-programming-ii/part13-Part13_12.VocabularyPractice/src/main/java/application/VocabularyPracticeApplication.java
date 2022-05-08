package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception{
        this.dictionary = new Dictionary();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        InputView inputView = new InputView(this.dictionary);
        PracticeView practiceView = new PracticeView(this.dictionary);
        
        Button add = new Button("Enter new words");
        Button test = new Button("Practice");

        HBox options = new HBox();
        options.getChildren().add(add);
        options.getChildren().add(test);

        options.setPadding(new Insets(20, 20, 20, 20));
        options.setSpacing(10);
        
        BorderPane layout = new BorderPane();
        layout.setTop(options);
        
        layout.setCenter(inputView.getView());
        
        add.setOnAction((event) -> layout.setCenter(inputView.getView()));
        test.setOnAction((event) -> layout.setCenter(practiceView.getView()));
        
        Scene view = new Scene(layout, 400, 300);
        
        window.setScene(view);
        window.show();
    }
}
