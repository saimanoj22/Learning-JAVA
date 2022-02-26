
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        else{
            String line = "";
            if(this.elements.size() == 1){
                line = "The collection " + this.name + " has " + this.elements.size() + " element:\n";
                for(String element : this.elements){
                    line += element;
                }
            }
            else{
                line = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
                for(String element : this.elements){
                    line += element + "\n";
                }
            }

            return line;
        }
    }
    
}
