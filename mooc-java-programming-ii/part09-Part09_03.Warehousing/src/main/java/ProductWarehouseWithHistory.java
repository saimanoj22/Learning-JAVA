
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory chHistory = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        chHistory.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount){
        double ans = super.getBalance() + amount;
        this.chHistory.add(ans);
        super.addToWarehouse(amount);
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double ans = super.getBalance() - amount;
        this.chHistory.add(ans);
        return super.takeFromWarehouse(amount);
    }
    
    public String history(){
        return this.chHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.chHistory.toString());
        System.out.println("Largest amount of product: " + this.chHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.chHistory.minValue());
        System.out.println("Average: " + this.chHistory.average());
    }
}
