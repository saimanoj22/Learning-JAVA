import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    public Room(){
        this.persons = new ArrayList<>();
    }
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        if(this.persons.size() == 0){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){
        if(this.persons.size() == 0){
            return null;
        }
        Person shortHeight = this.persons.get(0);
        for(Person person : this.persons){
            if(person.getHeight() < shortHeight.getHeight()){
                shortHeight = person;
            }
        }
        return shortHeight;
    }
    public Person take(){
        if(this.persons.size() == 0){
            return null;
        }
        Person shortHeight = this.persons.get(0);
        for(Person person : this.persons){
            if(person.getHeight() < shortHeight.getHeight()){
                shortHeight = person;
            }
        }
        this.persons.remove(shortHeight);
        return shortHeight;   
    }
}
