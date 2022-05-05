package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> reads;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.reads;
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor : this.sensors){
            if(sensor.isOn() == false){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor sensor : this.sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor : this.sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(!isOn()){
            throw new IllegalStateException("Average Sensor must be turned on.");
        }
        if(this.sensors.isEmpty()){
            throw new IllegalStateException("Atleast one sensor must be added to Average Sensor.");
        }
        int sum = 0;
        for(Sensor sensor : this.sensors){
            if(sensor.isOn()){
                sum += sensor.read();
            }
        }
        int average = sum / this.sensors.size();
        this.reads.add(average);
        return average;
    }
}
