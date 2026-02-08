import java.awt.*;
import javax.swing.*;

public class SimpleUi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Assignement");
        frame.setSize(500,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu aboutMenu = new JMenu("About Us");

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(aboutMenu);

        frame.setJMenuBar(menuBar);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel userLabel = new JLabel("UserName: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        formPanel.add(userLabel, gbc);

        JTextField userText = new JTextField(15);
        gbc.gridx =1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(userText, gbc);

        JLabel passLabel = new JLabel("Password: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        formPanel.add(passLabel, gbc);

        JPasswordField passText = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(passText, gbc);

        JLabel userTypeLabel = new JLabel("User Type:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        formPanel.add(userTypeLabel, gbc);

        String[] userTypes = {"Admin", "Normal User"};
        JComboBox<String> userTypeDropdown = new JComboBox<>(userTypes);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(userTypeDropdown, gbc);


        JButton submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(100,30));

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(submitButton,gbc);

        frame.add(formPanel, BorderLayout.CENTER);                
        frame.setVisible(true);
    }
}
