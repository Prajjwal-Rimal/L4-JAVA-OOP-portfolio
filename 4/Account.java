public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor 
    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Initial balance set to zero
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Cannot withdraw.");
        }
    }

    // toString method to provide account details
    
    public String toString() {
        return "Account Details:\n" +
                "Account Number: " + accountNumber + "\n" +
                "Account Holder: " + accountHolder + "\n" +
                "Balance: $" + balance;
    }
}

