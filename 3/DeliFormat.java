import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DeliFormat {
    public static void main(String[] args) {
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound;    // price per pound
        double weightOunces;     // weight in ounces
        double weight;           // weight in pounds
        double totalPrice;       // total price for the item

        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance(); // Declare money as a NumberFormat object
        DecimalFormat fmt = new DecimalFormat("0.00"); // Declare fmt as a DecimalFormat object

        // prompt the user and read in each input
        System.out.println("***** CS Deli *****\n ");
        System.err.println("fill the following field");
        System.out.print("Enter the price per pound: ");

        // Input validation for price per pound
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid price: ");
            scan.next(); // Consume the invalid input
        }
        pricePerPound = scan.nextDouble();

        System.out.print("Enter the weight (ounces): ");

        // Input validation for weight in ounces
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid weight: ");
            scan.next(); // Consume the invalid input
        }
        weightOunces = scan.nextDouble();

        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        // Print the label using the formatting objects
        // fmt for the weight in pounds and money for the prices
        System.out.println("\n*****  CS Deli  *****");
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("\nTOTAL:  " + money.format(totalPrice));

        // Close the scanner
        scan.close();
    }
}