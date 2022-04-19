
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> cartList;

    public ShoppingCart() {
        this.cartList = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cartList.containsKey(product)) {
            this.cartList.get(product).increaseQuantity();
        } 
        else {
            Item item = new Item(product, 1, price);
            this.cartList.put(product, item);
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : this.cartList.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : this.cartList.values()) {
            System.out.println(item);
        }
    }
}
