package BuildingBlock2;

// Data Hiding ( Encapsulation )

public class BankAccount {
    private double balance; // hidden data

    public BankAccount(double initialAmount) {
        if (initialAmount < 0)
            throw new IllegalArgumentException("Initial amount cannot be negative");
        this.balance = initialAmount;
    }

    // controlled access
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit");
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

