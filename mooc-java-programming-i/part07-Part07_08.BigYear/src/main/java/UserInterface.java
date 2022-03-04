import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Bird> birds;
    private Scanner scan;
    
    public UserInterface(Scanner scan){
        this.scan = scan;
        this.birds = new ArrayList<Bird>();
    }
    
    public void start(){
        readContents();
    }
    
    public void readContents(){
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }
            else if(command.equals("Add")){
                add();
            }
            else if(command.equals("Observation")){
                observation();
            }
            else if(command.equals("All")){
                all();
            }
            else if(command.equals("One")){
                one();
            }
        }
    }
    
    public void add(){
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scan.nextLine();
        this.birds.add(new Bird(name, latinName));
    }
    
    public void observation(){
        int flag = 0;
        System.out.println("Bird? ");
        String name = scan.nextLine();
        for(int i = 0; i < this.birds.size(); i++){
            if(this.birds.get(i).getName().equals(name)){
                this.birds.get(i).incrementObservation();
            }
            else{
                flag = -1;
            }
        }
        if(flag == -1){
            System.out.println("Not a bird!");
        }
    }
    
    public void all(){
        for(int i = 0; i < this.birds.size(); i++){
            System.out.println(this.birds.get(i));
        }
    }
    
    public void one(){
        System.out.println("Bird? ");
        String name = scan.nextLine();
        for(int i = 0; i < this.birds.size(); i++){
            if(this.birds.get(i).getName().equals(name)){
                System.out.println(this.birds.get(i));
            }
        }
    }
}
