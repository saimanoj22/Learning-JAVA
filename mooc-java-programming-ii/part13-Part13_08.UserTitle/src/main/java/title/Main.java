package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter Tilte of Window : ");
        String title = scan.nextLine();
        Application.launch(UserTitle.class, "--title=" + title);
    }

}
