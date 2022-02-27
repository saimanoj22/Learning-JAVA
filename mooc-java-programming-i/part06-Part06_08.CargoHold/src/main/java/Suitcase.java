import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight, totalWeigh;
    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        this.totalWeigh = 0;
    }
    public void addItem(Item item){
        if(this.totalWeigh + item.getWeight() <= this.maximumWeight){
            this.items.add(item);
            this.totalWeigh += item.getWeight();
        }
    }
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (" + this.totalWeigh + " kg)";
        }
        else if(this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeigh + "kg)";
        }
        return this.items.size() + " items (" + this.totalWeigh + "kg)";
    }
    public void printItems(){
        for(Item item : this.items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        return this.totalWeigh;
    }
    public Item heaviestItem(){
        if(this.items.size() == 0){
            return null;
        }
        Item heavy = this.items.get(0);
        for(Item item : this.items){
            if(heavy.getWeight() < item.getWeight()){
                heavy = item;
            }
        }
        return heavy;
    }
    
}
