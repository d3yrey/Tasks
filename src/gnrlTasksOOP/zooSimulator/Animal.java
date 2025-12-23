package gnrlTasksOOP.zooSimulator;

public abstract class Animal {
    public abstract void makeSound();
    static void callAnimal(Animal animal){
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();

        callAnimal(lion);
        callAnimal(elephant);
        callAnimal(monkey);
    }
}
