import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.*;

public class UserRegistration {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("User Registation", JLabel.CENTER);
        title.setFont(new Font("Times New Roman", Font.BOLD, 22));
        frame.add(title,BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8,8,8,8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int y = 0;
        //firstname
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("First Name: "),gbc);
        JTextField firstName = new JTextField(15);
        gbc.gridx = 1;
        panel.add(firstName,gbc);
        y++;

        //last name
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Last Name: "),gbc);
        JTextField lastName = new JTextField(15);
        gbc.gridx = 1;
        panel.add(lastName,gbc);
        y++;

        //dob
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Date of Birth: "),gbc);
        JTextField year = new JTextField(4);
        JTextField month = new JTextField(2);
        JTextField day = new JTextField(2);

        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,5,0));
        dobPanel.add(new JLabel("YYYY"));
        dobPanel.add(year);
        dobPanel.add(new JLabel("MM"));
        dobPanel.add(month);
        dobPanel.add(new JLabel("DD"));
        dobPanel.add(day);
        gbc.gridx = 1;
        panel.add(dobPanel,gbc);
        y++;    
        
        //gender
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Gender"),gbc);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Others");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);

        gbc.gridx = 1;
        panel.add(genderPanel, gbc);
        y++;

        //address
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Address"),gbc);
        JTextArea address = new JTextArea(3,15);
        gbc.gridx = 1;
        panel.add(address, gbc);
        y++;
        
        //contact
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Contact Number"),gbc);
        JTextField contact = new JTextField(15);
        gbc.gridx = 1;
        panel.add(contact, gbc);
        y++;

        //email
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Email"),gbc);
        JTextField email = new JTextField(15);
        gbc.gridx = 1;
        panel.add(email,gbc);
        y++;

        //password
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Password"),gbc);
        JPasswordField password = new JPasswordField(30);
        gbc.gridx = 1;
        panel.add(password,gbc);
        y++;

        //conform password
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel("Conform Password"),gbc);
        JPasswordField conformPassword = new JPasswordField(30);
        gbc.gridx =1;
        panel.add(conformPassword,gbc);
        y++;

        //submit button
        JButton submit = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submit, gbc);

            
        frame.add(panel, BorderLayout.CENTER);

        //validation logic
        submit.addActionListener(e -> {

            //DOB
            try {
                int yy = Integer.parseInt(year.getText());
                int mm = Integer.parseInt(month.getText());
                int dd = Integer.parseInt(day.getText());

                LocalDate dob = LocalDate.of(yy, mm, dd);
                int age = Period.between(dob, LocalDate.now()).getYears();

                if(age < 18){
                    JOptionPane.showConfirmDialog(frame, "User Must Be at least 18 to log in");
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid date of birt");
                return;
            }

            //email validation
            if(!email.getText().contains("@gmail.com")){
                JOptionPane.showConfirmDialog(frame, "Email must be a valid gmail address");
                return;
            }

            //passwrod validation
            String pass = new String(password.getPassword());
            String confirmPass = new String(conformPassword.getPassword());

            if(!pass.equals(confirmPass)){
                JOptionPane.showMessageDialog(frame, "Password dont match");
                return;
            }
            // Regex for strong password
            String passwordRegex =
                    "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";

            if (!pass.matches(passwordRegex)) {
                JOptionPane.showMessageDialog(frame, """
                                                     Password must be at least 8 characters and include:
                                                     Uppercase, Lowercase, Number,Symbol""");
                return;
            }

            JOptionPane.showMessageDialog(frame,"Registration Successful");

        });


        frame.setVisible(true);

    }
}
