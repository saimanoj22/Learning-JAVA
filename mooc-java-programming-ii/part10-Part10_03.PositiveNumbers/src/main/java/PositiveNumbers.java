
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        Stream<Integer> numStream = Stream.of(1, 2, 3, -1, -2);
        List<Integer> numbers = numStream.collect(Collectors.toList());
        System.out.println(positive(numbers).toString());
    }
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> newNumbers = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return newNumbers;
    }
}
