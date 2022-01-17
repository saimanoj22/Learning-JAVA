
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*System.out.println("Where to? ");
        int whereTo1 = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= whereTo1; i++){
            System.out.println(i);
        }*/
        
        System.out.println("Where to? ");
        int whereTo2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int whereFrom2 = Integer.valueOf(scanner.nextLine());
        for(int i = whereFrom2; i <= whereTo2; i++){
            System.out.println(i);
        }
    }
}
