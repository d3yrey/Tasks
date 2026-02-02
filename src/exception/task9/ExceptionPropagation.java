package exception.task9;

/**
 * 9. Exception Propagation
 */
public class ExceptionPropagation {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception handled in method1: " + e.getMessage());
        }
    }

    static void method2() {
        method3();
    }

    static void method3() {
        throw new RuntimeException("Error in method3");
    }
}
