package main;

import uk.ac.leedsbeckett.oop.OOPGraphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;

public class MainClass extends OOPGraphics {

    private BufferedImage currentImage;
    private List<String> savedCommands;

    public static void main(String[] args) {
        new MainClass(); // create instance of class that extends OOPGraphics
    }

    public MainClass() {
        JFrame mainFrame = new JFrame(); // create a frame to display the turtle panel on
        mainFrame.setLayout(new FlowLayout()); // not strictly necessary
        mainFrame.add(this); // add a turtle graphics panel to the frame
        mainFrame.pack(); // set the frame to a size we can see
        mainFrame.setVisible(true); // now display it
        about(); // call the OOPGraphics about method to display version information.
        savedCommands = new ArrayList<>();
    }

    @Override
    public void about() {
        displayMessage("PRAJJWAL RIMAL");
        super.about();
    }

    public void processCommand(String command) {
        String[] validCommands = {"penDown","penUp","turnLeft","turnRight","forward","backward","black","green","white","red",
                "reset","clear","square", "triangle","pencolor","penwidth","triangle","triangleCustom","save","load","loadImage",
                "saveImage"};

        String[] parts = command.split(" ");
        if (Arrays.asList(validCommands).contains(parts[0])) { // convert to list and check the commands existence
            savedCommands.add(command); // Add the command to the list of saved commands
            switch (parts[0]) {
                case "penDown" -> penDown();
                case "penUp" -> penUp();
                case "turnLeft" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error");
                        return;
                    }
                    turnLeft(parts[1]);
                }
                case "turnRight" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error");
                        return;
                    }
                    turnRight(parts[1]);
                }
                case "forward" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error");
                        return;
                    }
                    forward(parts[1]);
                }
                case "backward" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error");
                        return;
                    }
                    forward("-" + parts[1]);
                }
                case "black" -> this.PenColour = Color.BLACK; // from jar file
                case "green" -> this.PenColour = Color.GREEN;
                case "red" -> this.PenColour = Color.RED;
                case "white" -> this.PenColour = Color.WHITE;
                case "reset" -> {this.PenColour = Color.RED;
                    reset();}
                case "square" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error.");
                        return;
                    }
                    int length = Integer.parseInt(parts[1]);
                    for (int i = 0; i < 4; i++) {
                        forward(length);
                        turnRight(90);
                    }
                }
                case "pencolor" -> {
                    if (parts.length < 4 || !isNumeric(parts[1]) || !isNumeric(parts[2]) || !isNumeric(parts[3])) {
                        System.out.println("error.");
                        return;
                    }
                    int red = Integer.parseInt(parts[1]);
                    int green = Integer.parseInt(parts[2]);
                    int blue = Integer.parseInt(parts[3]);
                    if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                        System.out.println("error");
                        return;
                    }
                    this.PenColour = new Color(red, green, blue);
                }

                case "penwidth" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error");
                        return;
                    }
                    int width = Integer.parseInt(parts[1]);
                    if (width <= 0) {
                        System.out.println("error.");
                        return;
                    }
                    setStroke(width);
                }
                case "triangle" -> {
                    if (parts.length < 2 || !isNumeric(parts[1])) {
                        System.out.println("error");
                        return;
                    }
                    int size = Integer.parseInt(parts[1]);
                    for (int i = 0; i < 3; i++) {
                        forward(size);
                        turnLeft(120);
                    }
                }
                case "triangleCustom" -> {
                    if (parts.length < 4 || !isNumeric(parts[1]) || !isNumeric(parts[2]) || !isNumeric(parts[3])) {
                        System.out.println("error");
                        return;
                    }
                    int side1 = Integer.parseInt(parts[1]);
                    int side2 = Integer.parseInt(parts[2]);
                    int side3 = Integer.parseInt(parts[3]);
                    turnRight(side1);
                    forward(side1);
                    turnRight(side2);
                    forward(side2);
                    turnRight(side3);
                    forward(side3);
                }
                case "clear" -> clear();
                case "save" -> saveCommands();
                case "load" -> loadCommands();
                case "saveImage" -> {
                    saveImage(currentImage);
                }

                case "loadImage" -> {
                    BufferedImage loadedImage = loadImage();
                    if (loadedImage != null) {
                        currentImage = loadedImage;
                        repaint(); // Redraw the image
                    }
                }
                default -> about();
            }
        } else {
            System.out.println("Error: Invalid command.");
        }
    }

    private void saveCommands() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Commands");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(fileToSave)) {
                for (String command : savedCommands) {
                    writer.println(command);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadCommands() {
        if (!savedCommands.isEmpty()) {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    " unsaved work in progress",
                    "SAVE YOUR WORK", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                return;
            }
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Load Commands");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);
        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileToLoad))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    processCommand(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveImage(BufferedImage currentImage) {
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selector.setDialogTitle("Save a File");

        int state = selector.showSaveDialog(null);
        if (state != JFileChooser.APPROVE_OPTION) {
            displayMessage("Try Again");
        } else {
            try {
                File outputFile = selector.getSelectedFile();
                // Replace getBufferedImage() with your actual BufferedImage
                ImageIO.write(getBufferedImage(), "png", outputFile);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error saving image: " + e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private BufferedImage loadImage() {
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selector.setDialogTitle("Open a File");

        int state = selector.showOpenDialog(null);
        if (state != JFileChooser.APPROVE_OPTION) {
            displayMessage("Try Again");
        } else {
            File inputFile = selector.getSelectedFile();
            try {
                BufferedImage img = ImageIO.read(inputFile);
                // Replace setBufferedImage() with your actual method to handle the loaded image
                setBufferedImage(img);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error loading image: " + e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }

    private boolean isNumeric(String str) { // convert and catch exception
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
