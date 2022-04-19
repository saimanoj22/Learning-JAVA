
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices, stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            if (this.stocks.get(product) > 0) {
                int newStock = this.stocks.get(product);
                newStock--;
                this.stocks.put(product, newStock);
                return true;
            }
            return false;
        }
        return false;
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }
    
    public Set<String> products(){
        Set<String> products = this.prices.keySet();
        return products;
    }
}
