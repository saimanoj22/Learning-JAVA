
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList task;
    private Scanner scanner;
    
    public UserInterface(TodoList task, Scanner scanner){
        this.task = task;
        this.scanner = scanner;
    }
    
    public void start(){
        readChoices();
    }
    
    public void readChoices(){
        while(true){
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("add")){
                add();
            }
            else if(command.equals("list")){
                list();
            }
            else if(command.equals("remove")){
                remove();
            }
        }
    }
    
    public void add(){
        System.out.println("To add: ");
        String task = scanner.nextLine();
        this.task.add(task);
    }
    
    public void list(){
        this.task.print();
    }
    public void remove(){
        System.out.println("Which one is removed? ");
        int num = Integer.valueOf(scanner.nextLine());
        this.task.remove(num);
    }
}
