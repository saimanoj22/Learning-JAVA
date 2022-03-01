import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();
        
        System.out.println("What a joke!");
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();*/
        JokeManager manager = new JokeManager();
        manager.addJoke("Just joking 1");
        manager.addJoke("Just joking 2");
        manager.addJoke("Just joking 3");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
        
    }
}
