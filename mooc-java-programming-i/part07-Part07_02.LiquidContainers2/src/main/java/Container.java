
public class Container {

    private int initialAmount;

    public Container() {
        this.initialAmount = 0;
    }

    public int contains() {
        return this.initialAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.initialAmount += amount;
            if (this.initialAmount > 100) {
                this.initialAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.initialAmount -= amount;
            if (this.initialAmount < 0) {
                this.initialAmount = 0;
            }
        }
    }

    public String toString() {
        return this.initialAmount + "/100";
    }
}
