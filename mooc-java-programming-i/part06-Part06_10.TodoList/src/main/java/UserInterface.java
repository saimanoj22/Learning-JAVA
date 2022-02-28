import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("add")){
                add();
            }
            else if(command.equals("remove")){
                remove();
            }
            else if(command.equals("list")){
                print();
            }
        }
    }
    
    public void add(){
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.list.add(task);
    }
    
    public void print(){
        this.list.print();
    }
    
    public void remove(){
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
        this.list.remove(index);
    }
}
