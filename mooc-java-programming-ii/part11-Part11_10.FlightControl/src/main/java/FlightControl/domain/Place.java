
package FlightControl.domain;

public class Place {
    private String id;
    
    public Place(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return this.id;
    }
    
}
