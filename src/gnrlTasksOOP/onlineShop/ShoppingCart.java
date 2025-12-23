package gnrlTasksOOP.onlineShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }
    public void removeItem(CartItem item) {
        items.remove(item);
    }
    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.product.price * item.quantity;
        }
        return total;
    }


}
