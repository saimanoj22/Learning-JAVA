
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while(number > 0){
            System.out.print("*");
            number = number - 1;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while(number > 0){
            System.out.print(" ");
            number = number - 1;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(int i = 1; i <= height; i++){
            printSpaces(height - i);
            printStars(i*2-1);
        }
        int temp = ((height*2-1)/2)-1;
        printSpaces(temp);
        printStars(3);
        printSpaces(temp);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
