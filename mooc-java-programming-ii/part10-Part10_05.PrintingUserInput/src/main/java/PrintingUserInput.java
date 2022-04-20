
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> messages = new ArrayList<>();
        while(true){
            String msg = scanner.nextLine();
            if(msg.equals("")){
                break;
            }
            messages.add(msg);
        }
        
        String totalMessage = messages.stream()
                .reduce("",(previous, msg) -> previous + msg + "\n");
        
        System.out.println(totalMessage);
    }
}
