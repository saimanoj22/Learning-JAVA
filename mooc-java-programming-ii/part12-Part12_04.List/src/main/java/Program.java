
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.contains("Hello!"));
        strings.add("Hello!");
        System.out.println(strings.contains("Hello!"));
        strings.remove("Hello!");
        System.out.println(strings.contains("Hello!"));
        System.out.println("");

        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");
        System.out.println("");

        myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        System.out.println("");

        myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
        System.out.println("");

        myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList.value(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
        System.out.println("");

        myList = new List<>();
        myList.add("hello");
        myList.add("world");
        System.out.println("");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
        System.out.println("");
    }

}
