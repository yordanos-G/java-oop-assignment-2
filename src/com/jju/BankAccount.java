public class BankAccount {
    private String accountHolder;
    protected double balance; // Protected so subclasses can see it, but not the public

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Student Task: Ensure balance cannot be negative during initialization
    }

    public void deposit(double amount) {
        // Student Task: Implement deposit logic with validation
    }

    public void withdraw(double amount) {
        // Student Task: Implement withdrawal logic (prevent overdraft)
    }

    public double getBalance() {
        return balance;
    }
}
