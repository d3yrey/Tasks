package exception.task12;

/**
 * 12. Multiple Custom Exceptions
 */
public class MultipleCustomExceptionsDemo {
    private static final int CORRECT_PIN = 1234;
    private static final double BALANCE = 500;
    private static final double DAILY_LIMIT = 1000;
    private static double dailyWithdrawn = 0;

    public static void withdraw(int pin, double amount) throws InvalidPINException,
            InsufficientBalanceException, DailyLimitExceededException {
        if (pin != CORRECT_PIN) {
            throw new InvalidPINException("Invalid PIN");
        }
        if (amount > BALANCE) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + BALANCE);
        }
        if (dailyWithdrawn + amount > DAILY_LIMIT) {
            throw new DailyLimitExceededException("Daily limit exceeded. Limit: " + DAILY_LIMIT);
        }
        dailyWithdrawn += amount;
        System.out.println("Withdrawn: " + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(1234, 200);
            withdraw(9999, 100);
        } catch (InvalidPINException e) {
            System.out.println("InvalidPINException: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("InsufficientBalanceException: " + e.getMessage());
        } catch (DailyLimitExceededException e) {
            System.out.println("DailyLimitExceededException: " + e.getMessage());
        }

        try {
            withdraw(1234, 1000);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        dailyWithdrawn = 900;
        try {
            withdraw(1234, 200);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
