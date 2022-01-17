
public class Statistics {
    private int numberCount, sum;
    public Statistics(){
        this.numberCount = 0;
        this.sum = 0;
    }
    public void addNumber(int number){
        this.sum = this.sum + number;
        this.numberCount = this.numberCount + 1;
    }
    public int getCount(){
        return this.numberCount;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        if(this.numberCount == 0){
            return 0;
        }
        return (this.sum / (double)this.numberCount);
    }
}
