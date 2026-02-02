package exception.task3;

import java.util.Scanner;

/**
 * 3. Number Format
 */
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as String: ");
        String input = sc.nextLine();
        sc.close();
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + input);
        }
    }
}
