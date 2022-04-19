
public class Book implements Packable{
    String author, name;
    double weight;
    
    public Book(String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.author + ": " + this.name;
    }
}
