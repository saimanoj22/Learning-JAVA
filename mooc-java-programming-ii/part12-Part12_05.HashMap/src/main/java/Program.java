
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.add("one", 1);
        System.out.println(hashmap.get("one"));
        System.out.println(hashmap.get("two"));
    }

}
