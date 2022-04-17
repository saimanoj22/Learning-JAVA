import java.util.ArrayList;
public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> itemsInMaxBox;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.itemsInMaxBox = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int total(){
        int sum = 0;
        for(Item item : this.itemsInMaxBox){
            sum += item.getWeight();
        }
        return sum;
    }
    
    @Override
    public void add(Item item) {
        if(total() + item.getWeight() <= this.capacity){
            this.itemsInMaxBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){
        if(this.itemsInMaxBox.contains(item)){
            return true;
        }
        return false;
    }
}
