import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String postalCode;

    public Person(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public String getFullName() {

        return firstName + " " + lastName;
    }

    public String getPostalCode() {

        return postalCode;
    }
}
