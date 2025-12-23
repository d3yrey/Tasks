package inheritance.fifth;

public class Manager extends Employee{
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary();
    }
}
