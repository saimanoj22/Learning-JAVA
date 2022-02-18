
public class ClockHand {

    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}

class Timer{
    private ClockHand hundsecs;
    private ClockHand seconds;
    
    public Timer(){
        this.hundsecs = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        this.hundsecs.advance();
        if(this.hundsecs.value() == 0){
            this.seconds.advance();
        }
    }
    public String toString(){
        return seconds + ":" + hundsecs;
    }
}