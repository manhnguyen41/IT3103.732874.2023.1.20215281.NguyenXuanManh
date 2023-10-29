package lab01;

// Example 3: HelloNameDialog.java

import javax.swing.JOptionPane;

public class HelloNameDialog {
        public static void main(String[] args) {
            String result;

            // Display the input dialog
            result = JOptionPane.showInputDialog("Please enter your name:");

            // Display the result
            JOptionPane.showMessageDialog(null, "Hi "+ result + "!");
            System.exit(0);
        }
}