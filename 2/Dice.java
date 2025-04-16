import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of sides for each die
        System.out.print("Enter the number of sides for the first die: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the number of sides for the second die: ");
        int side2 = scanner.nextInt();

        // Initialize random number generator
        Random random = new Random();

        // Roll the dice three times
        int totalRolls = 3;
        int sumDie1 = 0;
        int sumDie2 = 0;

        for (int roll = 1; roll <= totalRolls; roll++) {
            int rollResultDie1 = random.nextInt(side1) + 1;
            int rollResultDie2 = random.nextInt(side2) + 1;

            sumDie1 += rollResultDie1;
            sumDie2 += rollResultDie2;

            System.out.println("Roll " + roll + ": Die 1 = " + rollResultDie1 + ", Die 2 = " + rollResultDie2);
        }

        // Calculate averages
        double averageDie1 = (double) sumDie1 / totalRolls;
        double averageDie2 = (double) sumDie2 / totalRolls;

        System.out.println("\nSum of Die 1: " + sumDie1);
        System.out.println("Average of Die 1: " + averageDie1);

        System.out.println("Sum of Die 2: " + sumDie2);
        System.out.println("Average of Die 2: " + averageDie2);


    }
}