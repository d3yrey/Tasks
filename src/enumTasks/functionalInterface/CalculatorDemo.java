package enumTasks.functionalInterface;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        int a = 6;
        int b = 7;

        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Multiplication: " + multiply.operate(a, b));
    }
}


