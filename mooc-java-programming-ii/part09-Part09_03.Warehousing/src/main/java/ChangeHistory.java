import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue() {
        if(this.history.isEmpty()){
            return 0;
        }
        double max = 0;
        for(Double value : this.history){
            if(max < value){
                max = value;
            }
        }
        return max;
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double min = 10000;
        for(Double value : this.history){
            if(min > value){
                min = value;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0, n = this.history.size();
        if(this.history.isEmpty()){
            return 0;
        }
        for(Double value : this.history){
            sum += value;
        }
        return (sum / n);
    }
    
//    @Override
//    public boolean equals(Object compared){
//        if(this == compared){
//            return true;
//        }
//        if(!(compared instanceof ChangeHistory)){
//            return false;
//        }
//        ChangeHistory comparedNew = (ChangeHistory) compared;
//        if(this.history == comparedNew.history){
//            return true;
//        }
//        return false;
//    }
}
