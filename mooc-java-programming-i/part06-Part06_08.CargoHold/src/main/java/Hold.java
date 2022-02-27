import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight, totalWeigh;
    
    public Hold(int maximumHeight){
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumHeight;
        this.totalWeigh = 0;
    }
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.totalWeigh <= this.maximumWeight){
            this.suitcases.add(suitcase);
            this.totalWeigh += suitcase.totalWeight();
        }
    }
    public void printItems(){
        for(Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeigh + " kg)";
    }
    
}
