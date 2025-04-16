import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate volume and surface area
        double volume = (4*22/7*(radius)*3)/3;
        double surfaceArea = 4*22/7*(radius)*2;

        // Print results
       System.out.println("volume :"+volume);
       System.out.println("surface area :"+surfaceArea);

    }
}