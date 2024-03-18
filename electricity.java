
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ecity extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4;
    JTextField textField;
    JButton button;

        public Ecity() {
        setTitle("Electricity Bill Generator");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Enter units consumed:");
        label1.setBounds(50, 50, 150, 30);
        add(label1);

        textField = new JTextField();
        textField.setBounds(200, 50, 150, 30);
        add(textField);

        button = new JButton("Generate Bill");
        button.setBounds(150, 100, 150, 30);
        button.addActionListener(this);
        add(button);

        label2 = new JLabel("Electricity Bill");
        label2.setBounds(150, 150, 100, 30);
        label2.setFont(new Font("Serif", Font.BOLD, 20));
        add(label2);

        label3 = new JLabel();
        label3.setBounds(100, 200, 200, 30);
        add(label3);

        label4 = new JLabel();
        label4.setBounds(100, 230, 200, 30);
        add(label4);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String unitsString = textField.getText();
            if (!unitsString.isEmpty() && isNumeric(unitsString)) {
                int units = Integer.parseInt(unitsString);
                double billAmount = calculateBill(units);
                label3.setText("Units Consumed: " + units);
                label4.setText("Bill Amount: $" + billAmount);
            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid units consumed.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Function to calculate bill amount based on units consumed
    public double calculateBill(int units) {
        double billAmount = 0;
        if (units <= 100) {
            billAmount = units * 1.0; // ₹1 per unit for the first 100 units
        } else if (units <= 200) {
            billAmount = 100 + (units - 100) * 2.0; // ₹2 per unit for units 101 to 200
        } else if (units <= 300) {
            billAmount = 100 + 200 + (units - 200) * 3.0; // ₹3 per unit for units 201 to 300
        } else {
            billAmount = 100 + 200 + 300 + (units - 300) * 5.0; // ₹5 per unit for units above 300
        }
        return billAmount;
    }

    // Function to check if a string is numeric
    public boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Ecity();
    }
}
Ecity.java
Displaying Ecity.java.