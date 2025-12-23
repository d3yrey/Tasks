package inheritance.fifth;

public class Employee {
    public static void main(String[] args) {
        Employee[] employees={
                new Developer("Alice", 80000),
                new Manager("Bob", 90000)
        };
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].calculateSalary());
        }
    }
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary(){
        return salary+2;
    }

}
