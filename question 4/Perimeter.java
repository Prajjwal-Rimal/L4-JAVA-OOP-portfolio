import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the square: ");// input
        int sideLength = input.nextInt();


        int perimeter = 4 * sideLength; // calculation
        int area = sideLength * sideLength;

        System.out.println("Perimeter: " + perimeter); // result
        System.out.println("Area: " + area);

        input.close();
    }
}
