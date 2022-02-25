import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new  ArrayList<>();
    }
    public boolean isEmpty(){
        if(this.stack.size() == 0){
            return true;
        }
        return false;
    }
    public void add(String value){
        this.stack.add(value);
    }
    public String take(){
        return this.stack.remove(stack.size() - 1);
    }
    public ArrayList<String> values(){
        return this.stack;
    }
}
