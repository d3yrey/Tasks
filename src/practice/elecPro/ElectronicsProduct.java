package practice.elecPro;

public class ElectronicsProduct {
    String productName;
    double price;
    long Id;

    public ElectronicsProduct(String productName, double price, long Id) {
        this.productName = productName;
        this.price = price;
        this.Id = Id;
    }

   public double discount(double percentage){
        return  (percentage / 100) * price;

   }
   public double calculateFinalPrice(double percentage){
         return price - discount(percentage);

   }

    public static void main(String[] args) {
        ElectronicsProduct laptop = new ElectronicsProduct("Laptop", 1000.0, 123456789L);
        double discountAmount = laptop.discount(10);
        double finalPrice = laptop.calculateFinalPrice(10);
        WashingMachine wm = new WashingMachine("Washing Machine", 500.0, 987654321L, 2);
        wm.extendWarrant(1);

        System.out.println("Original Price: $" + laptop.price);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price after Discount: $" + finalPrice);
    }

   }


