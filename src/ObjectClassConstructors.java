public class ObjectClassConstructors {

    public static void main(String[] args) {
        demoCar();
        demoStudents();
        demoBooks();
        demoPerson();
        demoEngineCar();
        demoRectangle();
        demoEmployees();


    }

    private static void demoCar() {
        Car car = new Car("Toyota", "Corolla", 2022);
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
    }

    private static void demoStudents() {
        Student[] students = {
                new Student("John", 20),
                new Student("Ana", 19),
                new Student("Li", 22)
        };
        for (Student student : students) {
            student.displayInfo();
        }
    }

    private static void demoBooks() {
        Book full = new Book("Clean Code", "Robert C. Martin", 42.5);
        Book partial = new Book("Effective Java", "Joshua Bloch");
        Book empty = new Book();

        System.out.println(full);
        System.out.println(partial);
        System.out.println(empty);
    }

    private static void demoPerson() {
        Person person = new Person();
        person.setName("Emily");
        person.setHeight(1.68);
        System.out.println("Name via getter: " + person.getName());
        System.out.println("Height via getter: " + person.getHeight());
        person.printInfo();
    }

    private static void demoEngineCar() {
        Engine engine = new Engine(180);
        PoweredCar car = new PoweredCar(engine);
        car.startCar();
    }

    private static void demoRectangle() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    private static void demoEmployees() {
        Address addr1 = new Address("123 Main St", "Baku", "AZ1000");
        Address addr2 = new Address("45 Elm St", "Ganja", "AZ2000");
        Address addr3 = new Address("9 Pine Ave", "Sumqayit", "AZ3000");

        Employee e1 = new Employee("Nihat", 2500.0, addr1);
        Employee e2 = new Employee("Leyla", 2700.0, addr2);
        Employee e3 = new Employee("Murad", 2300.0, addr3);

        e1.showEmployeeDetails();
        e2.showEmployeeDetails();
        e3.showEmployeeDetails();
    }

    // ---------------------------------------------------------------------

    static class Car {
        String brand;
        String model;
        int year;

        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
    }

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo() {
            System.out.println(name + " is " + age + " years old.");
        }
    }

    static class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        Book(String title, String author) {
            this(title, author, 0.0);
        }

        Book() {
            this("Unknown Title", "Unknown Author", 0.0);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static class Person {
        private String name;
        private double height;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void printInfo() {
            System.out.println("Person{name='" + name + "', height=" + height + "}");
        }
    }

    static class Engine {
        int horsePower;

        Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void startEngine() {
            System.out.println("Engine with " + horsePower + " HP started.");
        }
    }

    static class PoweredCar {
        Engine engine;

        PoweredCar(Engine engine) {
            this.engine = engine;
        }

        void startCar() {
            System.out.println("Starting car...");
            engine.startEngine();
        }
    }

    static class Rectangle {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double getArea() {
            return length * width;
        }

        double getPerimeter() {
            return 2 * (length + width);
        }
    }

    static class Address {
        String street;
        String city;
        String zipcode;

        Address(String street, String city, String zipcode) {
            this.street = street;
            this.city = city;
            this.zipcode = zipcode;
        }

        @Override
        public String toString() {
            return street + ", " + city + " " + zipcode;
        }
    }

    static class Employee {
        String name;
        double salary;
        Address address;

        Employee(String name, double salary, Address address) {
            this.name = name;
            this.salary = salary;
            this.address = address;
        }

        void showEmployeeDetails() {
            System.out.println(name + " earns $" + salary + " and lives at " + address);
        }
    }

    //clean code sekilde gorsenme sebebi copilot dir (yazib bitirdikden sora bas vermisdir 100/100 garatnti)
}

