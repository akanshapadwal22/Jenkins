import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a JFrame (window) with a title
                JFrame frame = new JFrame("Welcome Page");

                // Set the size of the window
                frame.setSize(400, 200);

                // Set the layout manager
                frame.setLayout(new BorderLayout());

                // Create a label to display the welcome message
                JLabel welcomeLabel = new JLabel("Welcome to Java!", SwingConstants.CENTER);
                welcomeLabel.setFont(new Font("Serif", Font.BOLD, 30));

                // Add the label to the center of the window
                frame.add(welcomeLabel, BorderLayout.CENTER);

                // Set default close operation to exit the application
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Center the window on the screen
                frame.setLocationRelativeTo(null);

                // Make the window visible
                frame.setVisible(true);
            }
        });
    }
}
