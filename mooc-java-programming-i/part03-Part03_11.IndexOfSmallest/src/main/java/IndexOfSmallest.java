
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList<>();
        int max =0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            numbers.add(input);
            if(input == 9999){
                break;
            }
            if(max < input){
                max = input;
            }
        }
        int index = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(max > numbers.get(i)){
                max = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + max);
        
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == max){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
