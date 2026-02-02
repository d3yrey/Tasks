package exception.task11;

/**
 * 11. Bank Account Simulation
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Cannot withdraw " + amount + ", balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ", new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        try {
            account.withdraw(50);
            account.withdraw(80);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
