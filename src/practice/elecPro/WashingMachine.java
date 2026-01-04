package practice.elecPro;

public class WashingMachine extends ElectronicsProduct{
    int warrant;

    public WashingMachine(String productName, double price, long Id, int warrant) {
        super(productName, price, Id);
        this.warrant = warrant;
    }
    public void extendWarrant(int extraYear){
        this.warrant += extraYear;
        System.out.println("New warranty period for " + productName + ": " + warrant + " years");
    }
}
