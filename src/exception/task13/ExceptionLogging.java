package exception.task13;

/**
 * 13. Exception Logging
 */
public class ExceptionLogging {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int result = arr[5];
        } catch (Exception e) {
            System.out.println("=== Message ===");
            System.out.println(e.getMessage());

            System.out.println("\n=== Cause ===");
            System.out.println(e.getCause() != null ? e.getCause() : "No cause");

            System.out.println("\n=== Stack Trace ===");
            e.printStackTrace();
        }
    }
}
