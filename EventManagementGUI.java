import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventManagementGUI {
    private JFrame frame;
    private JPanel panel;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public EventManagementGUI() {
        frame = new JFrame("Event Management System");
        panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Implement login logic here
                // If login successful, transition to event booking page
                if (loginSuccessful(username, password)) {
                    openEventBookingPage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Implement registration logic here
                // If registration successful, transition to event booking page
                if (registerUser(username, password)) {
                    openEventBookingPage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Registration failed");
                }
            }
        });
    }

    private boolean loginSuccessful(String username, String password) {
        // Implement login logic (e.g., validate credentials against database)
        // Return true if login successful, false otherwise
        // Placeholder implementation
        return true;
    }

    private boolean registerUser(String username, String password) {
        // Implement registration logic (e.g., insert user into database)
        // Return true if registration successful, false otherwise
        // Placeholder implementation
        return true;
    }

    private void openEventBookingPage() {
        // Implement code to open the event booking page
        // Placeholder implementation
        JOptionPane.showMessageDialog(frame, "Redirecting to event booking page");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventManagementGUI();
            }
        });
    }
}
