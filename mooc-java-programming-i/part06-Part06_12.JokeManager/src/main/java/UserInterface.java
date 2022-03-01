import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        loopRun();
    }
    
    public void loopRun(){
        while(true){
            showCommands();
            String command = scanner.nextLine();
            if(command.equals("X")){
                break;
            } else {
                commandConditions(command);
            }
            
        }
    }
    
    public void showCommands(){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
    
    public void commandConditions(String command){
        if(command.equals("1")){
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            this.manager.addJoke(joke);
        }
        else if(command.equals("2")){
            System.out.println(this.manager.drawJoke());;
        }
        else if(command.equals("3")){
            this.manager.printJokes();
        }
    }
}
