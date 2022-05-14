package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label one = new Label("Monthly savings");
        Slider slider1 = new Slider(25, 250, 26);
        slider1.setShowTickMarks(true);
        slider1.setShowTickLabels(true);
        slider1.setMajorTickUnit(25f);
        slider1.setBlockIncrement(0.01);
        Label monthly = new Label(String.valueOf(slider1.getValue()));
        BorderPane layout1 = new BorderPane();
        layout1.setLeft(one);
        layout1.setCenter(slider1);
        layout1.setRight(monthly);
        
        Label two = new Label("Yearly interest rate");
        Slider slider2 = new Slider(0, 10, 0);
        slider2.setShowTickMarks(true);
        slider2.setShowTickLabels(true);
        slider2.setMajorTickUnit(2f);
        slider2.setBlockIncrement(0.01);
        Label yearly = new Label(String.valueOf(slider2.getValue()));
        BorderPane layout2 = new BorderPane();
        layout2.setLeft(two);
        layout2.setCenter(slider2);
        layout2.setRight(yearly);
        
        VBox top = new VBox();
        top.setSpacing(20);
        top.setPadding(new Insets(20, 20, 20, 20));
        top.getChildren().addAll(layout1, layout2);
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings Counter");
        
        XYChart.Series savingsChart = new XYChart.Series();
        XYChart.Series interestsChart = new XYChart.Series();
        
        lineChart.getData().add(savingsChart);
        lineChart.getData().add(interestsChart);
                
        BorderPane finalLayout = new BorderPane();
        finalLayout.setTop(top);
        finalLayout.setCenter(lineChart);
        
        slider1.valueProperty().addListener((change, oldValue, newValue) -> {
            String newLabel = String.format("%.2f", newValue);
            monthly.setText(newLabel);
            
            double savingsCounter = 0;
            double interestsCounter = 0;
            
            for(int i = 0; i <= 31; i++){
                interestsChart.getData().add(new XYChart.Data(i, interestsCounter));
                savingsChart.getData().add(new XYChart.Data(i, savingsCounter));

                savingsCounter += slider1.getValue() * 12;
                interestsCounter = (interestsCounter + slider1.getValue() * 12) * (1.0 + slider2.getValue() / 100.0);
            }
        });
        
        slider2.valueProperty().addListener((change, oldValue, newValue) -> {
            String newLabel = String.format("%.2f", newValue);
            yearly.setText(newLabel);
            
            interestsChart.getData().clear();
            savingsChart.getData().clear();

            double savingsCounter = 0.0;
            double interestsCounter = 0.0;
            
            for(int i = 0; i <= 31; i++){
                interestsChart.getData().add(new XYChart.Data(i, interestsCounter));
                savingsChart.getData().add(new XYChart.Data(i, savingsCounter));

                savingsCounter += slider1.getValue() * 12;
                interestsCounter = (interestsCounter + slider1.getValue() * 12) * (1.0 + slider2.getValue() / 100.0);
            }
        });
        
        Scene scene = new Scene(finalLayout, 640, 480);
        window.setScene(scene);
        window.show();
    }
}

