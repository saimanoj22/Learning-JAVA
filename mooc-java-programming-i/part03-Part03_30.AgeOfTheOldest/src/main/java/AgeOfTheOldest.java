
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max  = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            if(max < Integer.valueOf(pieces[1])){
                max = Integer.valueOf(pieces[1]);
            }
        }        
        System.out.println("Age of the oldest: " + max);
    }
}
