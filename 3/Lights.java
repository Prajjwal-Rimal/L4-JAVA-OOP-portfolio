public class Lights {
    public static void main(String[] args) {
        // Instantiate Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Turn on some bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // Check bulb status
        System.out.println("Bulb 1 is on: " + bulb1.isBulbOn());
        System.out.println("Bulb 2 is on: " + bulb2.isBulbOn());

        // Turn off one bulb
        bulb2.turnOff();

        // Check bulb status again
        System.out.println("Bulb 2 is on: " + bulb2.isBulbOn());
    }
}
