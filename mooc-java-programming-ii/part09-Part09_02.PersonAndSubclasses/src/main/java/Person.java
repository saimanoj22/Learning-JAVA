
public class Person {
    private String name, address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String toString(){
        return this.name + "\n  " + this.address;
    }
}
