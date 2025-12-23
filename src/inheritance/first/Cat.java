package inheritance.first;

public class Cat extends Animal{
    @Override
    void sound() {
        super.sound();
        System.out.println("Meow Meow");
    }
}
