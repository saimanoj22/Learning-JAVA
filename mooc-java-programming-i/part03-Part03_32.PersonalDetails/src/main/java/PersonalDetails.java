
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum  = 0;
        double count = 0;
        String maxName = "";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            if(maxName.length() < pieces[0].length()){
                maxName = pieces[0];
            }
            sum = sum + Integer.valueOf(pieces[1]);
            count = count + 1;
        }        
        System.out.println("Longest name: " + maxName);
        System.out.println("Average of the birth years: " + (sum / count));

    }
}
