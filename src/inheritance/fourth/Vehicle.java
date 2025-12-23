package inheritance.fourth;

public class Vehicle {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.ignite();
        myElectricCar.startEngine();
        myElectricCar.chargeBattery();
    }
    void ignite(){
        System.out.println("Vehicle ignition");
    }

}
