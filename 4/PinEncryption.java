import java.util.Random;
import java.util.Scanner;

public class PinEncryption {

    public static void main(String[] args) {
        Scanner pin=new Scanner(System.in);
        System.out.println("Enter a 4 digit pin number to encrypt: ");
        int pinNumber =pin.nextInt() ;
        String encryptedPin = encryptPin(pinNumber);
        System.out.println("Your encrypted pin number is " + encryptedPin);
    }

    public static String encryptPin(int pin) {

        String hexPin = Integer.toHexString(pin);

        Random random = new Random();
        int random1 = random.nextInt(65536 - 1000) + 1000;
        int random2 = random.nextInt(65536 - 1000) + 1000;
        String hexRandom1 = Integer.toHexString(random1);
        String hexRandom2 = Integer.toHexString(random2);

        String encryptedPin = hexRandom1 + hexPin + hexRandom2;

        return encryptedPin;
    }
}