package inheritance.second;

public class Employee extends Person{
    int Salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.Salary = salary;
    }
}
