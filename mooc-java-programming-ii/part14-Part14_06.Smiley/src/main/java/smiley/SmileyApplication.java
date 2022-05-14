package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Canvas canvas = new Canvas(640, 480);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        
        ColorPicker color = new ColorPicker();
        
        painter.setFill(Color.BLACK);
        painter.fillRect(20, 20, 20, 20);
        painter.fillRect(80, 20, 20, 20);
        painter.fillRect(20, 100, 80, 20);
        painter.fillRect(0, 80, 20, 20);
        painter.fillRect(100, 80, 20, 20);
        
        BorderPane layout = new BorderPane();
        layout.setCenter(canvas);
        
        Scene scene = new Scene(layout, 640, 480, Color.WHITE);
        window.setScene(scene);
        window.show();
    }
}
