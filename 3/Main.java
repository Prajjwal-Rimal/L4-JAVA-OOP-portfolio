import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[25];
        int count = 0;

        System.out.println("Enter up to 25 pairs of names,last name and postal codes (separated by tabs):");

        while (count < 25 && scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\t");


            if (parts.length == 3) {
                String firstName = parts[0];
                String lastName = parts[1];
                String postalCode = parts[2];

                people[count] = new Person(firstName, lastName, postalCode);
                count++;
            } else {
                System.out.println("Invalid input. Please enter three strings separated by tabs.");
            }
        }

        System.out.println("\nList of People:");
        for (int i = 0; i < count; i++) {
            System.out.println(people[i].getFullName() + "\tPostal Code: " + people[i].getPostalCode());
        }
    }
}
