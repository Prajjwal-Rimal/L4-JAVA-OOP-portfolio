import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int val1, val2, val3;
        double averages;
        Scanner scan = new Scanner(System.in);

        // get three values from user
        System.out.println("Please enter three integers and " +
                           "I will compute their average");

        System.out.print("Enter first integer: ");
        val1 = scan.nextInt();

        System.out.print("Enter second integer: ");
        val2 = scan.nextInt();

        System.out.print("Enter third integer: ");
        val3 = scan.nextInt();

        // compute the average
        averages = (val1 + val2 + val3) / 3.0;

        // print the average
        System.out.println("The average of the three integers is: " + averages);
        scan.close();
    }
}