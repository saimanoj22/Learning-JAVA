
public class MisplacingBox extends Box{
    private Item misplaceItem;
    private boolean check;
    
    public MisplacingBox(){
        this.check = false;
    }

    @Override
    public void add(Item item) {
        this.misplaceItem = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
