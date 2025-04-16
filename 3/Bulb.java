public class Bulb {
    private boolean On;

    // Constructor to initialize the bulb (initially turned off)
    public Bulb() {
        On = false;
    }

    // Method to turn on the bulb
    public void turnOn() {
        On = true;
    }

    // Method to turn off the bulb
    public void turnOff() {
        On = false;
    }

    // Method to check if the bulb is on
    public boolean isBulbOn() {
        return On;
    }
}

