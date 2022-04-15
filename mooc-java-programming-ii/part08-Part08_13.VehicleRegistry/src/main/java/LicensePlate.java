
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object li) {
        if (this == li) {
            return true;
        }
        if (!(li instanceof LicensePlate)) {
            return false;
        }

        LicensePlate comparedLi = (LicensePlate) li;
        
        if (this.liNumber.equals(comparedLi.liNumber)
                && this.country.equals(comparedLi.country)) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        if(this.country == null){
            return 0;
        }
        return this.liNumber.hashCode() + this.country.hashCode();
    }

}
