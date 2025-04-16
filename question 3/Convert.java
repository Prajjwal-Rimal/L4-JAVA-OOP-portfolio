import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        float miles;
        float kilometer;// create float kilometers and miles 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the distance in miles to get output in kilometers:");
        miles = scan.nextFloat(); // accept float value for miles

        kilometer = miles / 1.60935f;
        System.out.println("Distance in kilometers: " + kilometer); //output 
        
        scan.close();
    }
}