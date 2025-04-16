package main;

import java.awt.*;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics {


    public static void main(String[] args) {
        TurtleGraphics turtleGraphics = new TurtleGraphics(); // Creating an instance of TurtleGraphics
        JFrame mainFrame = new JFrame(); // Create a frame to display the turtle panel on
        mainFrame.setLayout(new FlowLayout()); // Not strictly necessary
        mainFrame.add(turtleGraphics); // Adding a turtle graphics panel to the frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the app exits when closed
        mainFrame.pack(); // Set the frame to a size we can see
        mainFrame.setVisible(true); // Now display it
        turtleGraphics.about();
    }


    public void processCommand(String command) {
        // This method must be provided because OOPGraphics will call it when its JTextField is used
        // Cases for command
    }
}
