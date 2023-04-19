package chatting_application;// Import required modules
import javax.swing.*;
import java.awt.*;

// Create server class inheriting JFrames
public class Server extends JFrame {
    // Create class constructor
    Server() {
        // Create layout
        setLayout(null);

        // Create panel
        JPanel p1 = new JPanel();
        // Set panel background
        p1.setBackground(new Color(7, 94, 84));
        // Add position to the panel
        p1.setBounds(0, 0, 450, 70);
        // Add panel to the frame
        add(p1);

        // Set frame size
        setSize(450, 700);
        // Set location of window
        setLocation(300, 50);
        // Set background color
        getContentPane().setBackground(Color.WHITE);

        // Set visibility to true
        setVisible(true);
    }

    // Create main method
    public static void main(String[] args) {
        // Create server class
        new Server();
    }
}
