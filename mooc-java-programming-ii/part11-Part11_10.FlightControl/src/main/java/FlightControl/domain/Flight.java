
package FlightControl.domain;

public class Flight {
    private AirPlane plane;
    private Place target, departure;
    
    public Flight(AirPlane plane, Place departure, Place target){
        this.plane = plane;
        this.target = target;
        this.departure = departure;
    }
    
    public AirPlane getAirPlane(){
        return this.plane;
    }
    
    public Place getArrival(){
        return this.target;
    }
    
    public Place getDepartue(){
        return this.departure;
    }
    
    @Override
    public String toString(){
        return this.plane.toString() + " (" + this.departure + "-" + this.target + ")";
    }
}
