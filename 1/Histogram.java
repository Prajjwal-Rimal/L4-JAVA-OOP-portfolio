import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int[] frequency = new int[10]; // Frequency array for each range

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (1 to 100, -1 to stop):");

        int input;
        do {
            input = scanner.nextInt();
            if (input >= 1 && input <= 100) {
                int index = (input - 1) / 10; // Determine the range index
                frequency[index]++;
            }
        } while (input != -1);

        // Print the histogram
        System.out.println("Histogram:");
        for (int i = 0; i < frequency.length; i++) {
            int lowerBound = i * 10 + 1;
            int upperBound = (i + 1) * 10;
            System.out.printf("%2d - %2d | %s%n", lowerBound, upperBound, getAsterisks(frequency[i]));
        }
    }

    private static String getAsterisks(int count) {
        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < count; i++) {
            asterisks.append("*");
        }
        return asterisks.toString();
    }
}
