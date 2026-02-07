import java.awt.*;
import javax.swing.*;

public class SimpleUi {

    public static void main(String[] args) {

        /* ================= FRAME ================= */

        // Create the main window
        JFrame frame = new JFrame("Simple Java UI");

        // Set window size
        frame.setSize(500, 400);

        // Close app when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window on screen
        frame.setLocationRelativeTo(null);

        // Use BorderLayout for main frame
        frame.setLayout(new BorderLayout());


        /* ================= NAV BAR ================= */

        // Create a panel for navigation bar
        JPanel navBar = new JPanel();

        // Set background color
        navBar.setBackground(new Color(45, 45, 45));

        // Create nav title label
        JLabel navTitle = new JLabel("My Application");

        // Set text color and font
        navTitle.setForeground(Color.WHITE);
        navTitle.setFont(new Font("Arial", Font.BOLD, 18));

        // Add label to navbar
        navBar.add(navTitle);

        // Add navbar to top of frame
        frame.add(navBar, BorderLayout.NORTH);


        /* ================= FORM PANEL ================= */

        // Panel for form content
        JPanel formPanel = new JPanel();

        // GridBagLayout is flexible for forms
        formPanel.setLayout(new GridBagLayout());

        // Helps control spacing and alignment
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing


        /* ================= LABEL: USERNAME ================= */

        JLabel userLabel = new JLabel("Username:");

        gbc.gridx = 0;  // column
        gbc.gridy = 0;  // row
        gbc.anchor = GridBagConstraints.EAST;
        formPanel.add(userLabel, gbc);


        /* ================= TEXT FIELD ================= */

        JTextField userText = new JTextField(15);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(userText, gbc);


        /* ================= LABEL: PASSWORD ================= */

        JLabel passLabel = new JLabel("Password:");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        formPanel.add(passLabel, gbc);


        /* ================= PASSWORD FIELD ================= */

        JPasswordField passText = new JPasswordField(15);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(passText, gbc);


        /* ================= SUBMIT BUTTON ================= */

        JButton submitButton = new JButton("Submit");

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(submitButton, gbc);


        /* ================= ADD FORM TO FRAME ================= */

        frame.add(formPanel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
