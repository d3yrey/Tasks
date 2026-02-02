package exception.task2;

/**
 * 2. Array Index Error
 */
public class ArrayIndexError {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        try {
            System.out.println("Accessing index 2: " + arr[2]);
            System.out.println("Accessing index 10 (invalid): " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }
    }
}
