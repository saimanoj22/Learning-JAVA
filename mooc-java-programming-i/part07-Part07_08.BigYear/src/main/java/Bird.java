public class Bird {
    private String name, latinName;
    private int observation;
    
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void incrementObservation(){
        this.observation++;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }
}
