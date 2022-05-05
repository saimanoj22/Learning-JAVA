
package FlightControl.domain;

public class AirPlane {
    private String id;
    private int capacity;
    
    public AirPlane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId(){
        return this.id;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    @Override
    public String toString(){
        return this.id + " (" + this.capacity + " capacity)";
    }
}
