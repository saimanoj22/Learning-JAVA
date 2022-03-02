import java.util.Scanner;

public class UserInterface {
    private Container first, second;
    public Scanner scan;
    
    public UserInterface(Scanner scanner){
        this.first = new Container();
        this.second = new Container();
        this.scan = scanner;
    }
    
    public void start(){
        while(true){
            
            printContainers();
            
            String input = this.scan.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            executeCommands(command, amount);
        }
    }
    
    public void printContainers(){
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
    
    public void executeCommands(String command, int amount){
        if(command.equals("add")){
            this.first.add(amount);
        }
        else if(command.equals("move")){
            int firstAmount = this.first.contains();
            if(firstAmount - amount < 0){
                this.second.add(firstAmount);
            }
            else{
                this.second.add(amount);
            }
            this.first.remove(amount);
            
        }
        else if(command.equals("remove")){
            this.second.remove(amount);
        }
    }
    
}
