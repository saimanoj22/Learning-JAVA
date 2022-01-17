
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double positiveCount = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            if(num > 0){
                sum = sum + num;
                positiveCount = positiveCount + 1;
            }
        }
        if(positiveCount > 0){
            System.out.println(sum/positiveCount);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
