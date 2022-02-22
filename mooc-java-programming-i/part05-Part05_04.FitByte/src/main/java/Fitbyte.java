public class Fitbyte {
    private int age, restingHeartBeat;
    public Fitbyte(int age, int restingHeartBeat){
        this.age = age;
        this.restingHeartBeat = restingHeartBeat;
    }
    public double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double percentageOfMaximum){
        return ((this.maximumHeartRate() - this.restingHeartBeat)* percentageOfMaximum + this.restingHeartBeat);
    }
}
