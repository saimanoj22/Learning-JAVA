
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        
        // Part 1
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        /*TextUI ui = new TextUI(scanner, dictionary);
        ui.start();*/
        
        // Part 2 & Part 3 & Part 4
        scanner = new Scanner(System.in);
        dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}
