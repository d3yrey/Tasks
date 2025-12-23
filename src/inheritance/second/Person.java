package inheritance.second;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee emp  = new Employee("Alice", 30, 50000);
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Salary: " + emp.Salary);
    }
}
