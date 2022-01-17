import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String ask = scanner.nextLine();
        if(ask.equals("everything")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i).toString());
            }
        }
        if(ask.equals("name")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i).getName());
            }
        }
    }
}
