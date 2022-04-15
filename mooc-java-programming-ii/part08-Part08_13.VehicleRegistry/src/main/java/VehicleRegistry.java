import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;
    
    public VehicleRegistry(){
        this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        for(LicensePlate lp : this.vehicleRegistry.keySet()){
            if(lp.equals(licensePlate)){
                return false;
            }
        }
        this.vehicleRegistry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return this.vehicleRegistry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        for(LicensePlate lp : this.vehicleRegistry.keySet()){
            if(lp.equals(licensePlate)){
                this.vehicleRegistry.remove(lp);
                return true;
            }
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate lp : this.vehicleRegistry.keySet()){
            System.out.println(lp);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(LicensePlate lp : this.vehicleRegistry.keySet()){
            String owner = this.vehicleRegistry.get(lp);
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        for(String owner : owners){
            System.out.println(owner);
        }
    }
}
