package exception.task6;

/**
 * 6. Finally Block Practice
 */
public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        } finally {
            System.out.println("Finally block always executes");
        }
        System.out.println("Program continues after try-catch-finally");
    }
}
