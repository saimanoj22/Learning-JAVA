
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error

        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        joan = null;
        joan.growOlder();

    }
}
