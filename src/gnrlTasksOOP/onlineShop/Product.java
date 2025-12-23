package gnrlTasksOOP.onlineShop;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        System.out.println("Product 1: " + product1.name + " - Price: $" + product1.price);
        System.out.println("Product 2: " + product2.name + " - Price: $" + product2.price);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1, 1);
        cart.addItem(product2, 2);
        System.out.println("Total Price: $" + cart.getTotalPrice());

//        cart.removeItem(product1 , 1); bu hisseni bacara bilmedim


    }
}
