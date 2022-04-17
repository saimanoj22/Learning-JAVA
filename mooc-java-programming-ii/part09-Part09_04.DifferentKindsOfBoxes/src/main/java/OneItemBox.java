
public class OneItemBox extends Box {
    private Item oneItem;
    private boolean check;
    public OneItemBox(){
        this.check = false;
    }

    @Override
    public void add(Item item){
        if(check == false){
            this.oneItem = item;
            this.check = true;
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if(item.equals(this.oneItem)){
            return true;
        }
        return false;
    }
    
    
}
