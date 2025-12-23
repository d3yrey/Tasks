package inheritance.first;

public class Dog extends Animal{
    @Override
    void sound() {
        super.sound();
        System.out.println("Woof Woof");
    }
}
