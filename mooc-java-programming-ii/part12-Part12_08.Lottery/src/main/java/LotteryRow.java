
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        this.random = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while(this.numbers.size() < 7){
            int picked = this.random.nextInt(40) + 1;
            if (!containsNumber(picked)) {
                this.numbers.add(picked);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
