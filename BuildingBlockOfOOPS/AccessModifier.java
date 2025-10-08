package BuildingBlockOfOOPS;

// Access Modifier

class Account {
    public String accountHolder = "Mahfooz";   // public
    private double balance = 500000000;         // private

    protected void showBalance() {             // protected
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) {          // default
        balance += amount;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.accountHolder);
        acc.deposit(500);
        acc.showBalance();
        // acc.balance Error (private)
    }
}


    

