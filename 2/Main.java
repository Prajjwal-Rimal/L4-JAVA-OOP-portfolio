public class Main {
    public static void main(String[] args) {
        Password secret = new Password("Hello, World!");
        Password password = new Password("MyPassword123");

        System.out.println("Original Secret: " + secret);
        secret.encrypt();
        System.out.println("Encrypted Secret: " + secret);
        System.out.println("Decrypted Secret: " + secret.decrypt());

        System.out.println("\nOriginal Password: " + password);
        password.encrypt();
        System.out.println("Encrypted Password: " + password);
        System.out.println("Decrypted Password: " + password.decrypt());
    }
}
