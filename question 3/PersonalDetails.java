import java.util.Scanner;
public class PersonalDetails
{
   public static void main (String[] args)
   {
    Scanner myObj = new Scanner(System.in);// alowing input capabilities 

    System.out.println("Enter name, age, address, phone number:"); // prompt user to input

    String name = myObj.nextLine(); // after taking in an input go to the next input, place all in a new line 
    String age = myObj.nextLine();
    String address = myObj.nextLine();
    String phonenumber = myObj.nextLine();

    System.out.println();
    System.out.println();
    System.out.println("Name: " + name);// print output
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
    System.out.println("Phone NUmber: " + phonenumber);
   }
}