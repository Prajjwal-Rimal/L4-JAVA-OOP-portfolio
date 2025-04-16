// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;


public class Rock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your play (R, P, or S): ");
        String userPlay = scanner.nextLine().toUpperCase();

        int computerInt = random.nextInt(3); // generate a random number from 0,1,2
        String computerPlay = switch (computerInt) { // assign the random number to the corresponding switch case
            case 0 -> "R";
            case 1 -> "P";
            case 2 -> "S";
            default -> "";
        };

        if (userPlay.equals(computerPlay)) { // user and computer comparison
            System.out.println("It's a tie!");
        } else if ((userPlay.equals("R") && computerPlay.equals("S")) ||
                (userPlay.equals("P") && computerPlay.equals("R")) ||
                (userPlay.equals("S") && computerPlay.equals("P"))) {
            System.out.println("You win! " + userPlay + " beats " + computerPlay);
        } else {
            System.out.println("You lose! " + computerPlay + " beats " + userPlay);
        }

    }
}