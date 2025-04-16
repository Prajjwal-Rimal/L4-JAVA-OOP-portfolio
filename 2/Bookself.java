public class Bookself {
    public static void main(String[] args) {
        // Instantiate Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);

        // Update book details
        book1.setAuthor("Francis Scott Fitzgerald");
        book2.setPublisher("HarperCollins");

        // Display book information
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
    }
}
