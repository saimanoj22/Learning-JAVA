
import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipes;
    
    public Pipe(){
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipes.add(value);
    }
    public T takeFromPipe(){
        if(this.pipes.isEmpty()){
            return null;
        }
        T element = this.pipes.get(0);
        this.pipes.remove(0);
        return element;
    }
    
    public boolean isInPipe(){
        if(this.pipes.isEmpty()){
            return false;
        }
        return true;
    }
}
