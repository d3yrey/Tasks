package exception.task4;

/**
 * 4. Single Catch Block
 */
public class SingleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int a = 10;
            int b = 0;
            System.out.println(arr[5]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
