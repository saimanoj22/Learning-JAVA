package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean status;
    
    public TemperatureSensor(){
        this.status = false;
    }
    
    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if(this.status == false){
            throw new IllegalStateException("Sensor must be turned on state.");
        }
        int num = new Random().nextInt(61);
        num -= 30;
        return num;
    }
    
}
