package exception.task10;

/**
 * 10. Throw vs Throws
 */
public class ThrowVsThrows {
    public static void main(String[] args) {
        try {
            validatePositive(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    public static void validatePositive(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        System.out.println("Valid: " + n);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
