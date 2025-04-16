public class Transactions {
    public static void main(String[] args) {
        
        Account account1 = new Account("123456", "John Doe");

        
        account1.deposit(1000.0);

     
        System.out.println(account1);

        
        account1.withdraw(500.0);

        
        System.out.println("Updated balance: $" + account1.getBalance());
    }
}
