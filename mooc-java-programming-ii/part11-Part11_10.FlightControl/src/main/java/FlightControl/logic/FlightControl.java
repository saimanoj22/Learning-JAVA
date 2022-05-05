package FlightControl.logic;

import FlightControl.domain.AirPlane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String, AirPlane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirPlane(String id, int capacity){
        AirPlane plane = new AirPlane(id ,capacity);
        this.airplanes.put(id, plane);
    }
    
    public void addFlight(AirPlane plane, String departure, String target){
        this.places.putIfAbsent(target, new Place(target));
        this.places.putIfAbsent(departure, new Place(departure));
        
        Flight flight = new  Flight(plane, this.places.get(departure), this.places.get(target));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<AirPlane> printAirplanes(){
        return this.airplanes.values();
    }
    
    public Collection<Flight> printFlights(){
        return this.flights.values();
    }
    
    public AirPlane getAirplane(String id){
        return this.airplanes.get(id);
    }
}
