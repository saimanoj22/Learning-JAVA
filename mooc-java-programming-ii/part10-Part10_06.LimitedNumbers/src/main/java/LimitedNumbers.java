
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int num = scanner.nextInt();
            if(num < 0){
                break;
            }
            numbers.add(num);
        }
        
        numbers.stream()
                .filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));
                       
    }
}
