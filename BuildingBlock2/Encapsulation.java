package BuildingBlock2;

/// Data Hiding (Encapsulation)

// public class Encapsulation {
//     public static void main(String[] args) {
//         BankAccount acc = new BankAccount("12345", 1000);

//         acc.deposit(500);
//         System.out.println("After deposit: ₹" + acc.getBalance());

//         boolean success = acc.withdraw(300);
//         System.out.println("Withdraw success: " + success);
//         System.out.println("Remaining Balance: ₹" + acc.getBalance());
//     }
// }



final class BankAccount { // remove 'public' keyword
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialDeposit) {
        if (initialDeposit < 0) throw new IllegalArgumentException("Negative deposit not allowed");
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
    }

    public synchronized boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        System.out.println("After deposit: ₹" + acc.getBalance());

        boolean success = acc.withdraw(300);
        System.out.println("Withdraw success: " + success);
        System.out.println("Remaining Balance: ₹" + acc.getBalance());
    }
}

