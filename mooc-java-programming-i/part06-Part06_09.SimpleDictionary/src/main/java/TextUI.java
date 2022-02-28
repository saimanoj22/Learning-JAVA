import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                end();
                break;
            }
            else if(command.equals("add")){
                add();
            }
            else if(command.equals("search")){
                search();
            }
            else{
                System.out.println("Unknown command");
            }
        }
    }
    
    public void add(){
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search(){
        System.out.println("To be translated: ");
        String searchWord = scanner.nextLine();
        if(this.dictionary.translate(searchWord) != null){
            System.out.println("Translation: " + this.dictionary.translate(searchWord));
        }
        else{
            System.out.println("Word " + searchWord + " was not found");
        }
    }
    
    public void end(){
        System.out.println("Bye bye!");
    }
}
