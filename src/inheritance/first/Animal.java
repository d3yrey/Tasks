package inheritance.first;

public class Animal {
    void sound(){}

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        Animal myOtherAnimal = new Cat();
        myOtherAnimal.sound();
    }
}
