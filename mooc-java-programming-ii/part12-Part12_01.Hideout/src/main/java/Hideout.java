
import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hideout;
    
    public Hideout(){
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if(this.hideout.isEmpty()){
            this.hideout.add(toHide);
        }
        else{
            this.hideout.remove(0);
            this.hideout.add(toHide);
        }
    }
    public T takeFromHideout(){
        if(this.hideout.isEmpty()){
            return null;
        }
        T element = this.hideout.get(this.hideout.size() - 1);
        this.hideout.remove(this.hideout.size() - 1);
        return element;
    }
    public boolean isInHideout(){
        if(this.hideout.isEmpty()){
            return false;
        }
        return true;
    }
}
