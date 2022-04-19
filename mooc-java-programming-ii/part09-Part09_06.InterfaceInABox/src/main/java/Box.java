import java.util.ArrayList;
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> contents;
    
    public Box(double capacity){
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    }
    
    public void add(Packable pack){
        if(this.weight() + pack.weight() <= this.capacity){
            this.contents.add(pack);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(Packable pack : this.contents){
            weight += pack.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }
}
