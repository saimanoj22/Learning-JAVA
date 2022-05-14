package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        xAxis.setLabel("");
        yAxis.setLabel("");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        int line = 1;
        ArrayList<Integer> years = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String[] parts = row.split("\t");
                
                if(line == 1){
                    for(int i = 1; i < parts.length; i++){
                        years.add(Integer.valueOf(parts[i]));
                    }
                    line++;
                }
                else{
                    XYChart.Series partyData = new XYChart.Series();
                    partyData.setName(parts[0]);
                    for(int i = 1; i < parts.length; i++){
                        if(!parts[i].equals("-")){
                            partyData.getData().add(new XYChart.Data(years.get(i - 1), Double.valueOf(parts[i])));
                        }
                    }
                    lineChart.getData().add(partyData);
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        Scene scene = new Scene(lineChart, 640, 480);
        window.setScene(scene);
        window.show();
    }
}
