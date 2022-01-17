
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, evenCount = 0, oddCount = 0;
        while(true){
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            sum = sum + num;
            count = count + 1;
            if(num % 2 == 0){
                evenCount = evenCount + 1;
            } else{
                oddCount = oddCount + 1;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (sum / (double)count));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
