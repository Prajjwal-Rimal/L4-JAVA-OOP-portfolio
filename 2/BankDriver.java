public class BankDriver {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1001", "hello");
        account1.deposit(1000.0);
        account1.withdraw(200.0);
        account1.addInterest();
        account1.displayAccountInfo();

        System.out.println();

        BankAccount account2 = new BankAccount("1002", "srijana");
        account2.deposit(500.0);
        account2.withdraw(700.0);
        account2.addInterest();
        account2.displayAccountInfo();
    }
}