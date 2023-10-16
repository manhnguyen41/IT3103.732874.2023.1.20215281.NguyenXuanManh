package lab01;

// Example 5: ShowTwoNumbers.java

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1;
        String strNum2;
        String strNotification = "";

        // Input first number
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ","Input the first number",
                JOptionPane. INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        // Input second number
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ","Input the second number",
                JOptionPane. INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        // Calculate
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Display result
        strNotification += "Sum: " + sum +
                "\nDifference: " + difference +
                "\nProduct: " + product +
                "\nQuotient: " + quotient;

        JOptionPane.showMessageDialog(null, strNotification,
                "Result: ", JOptionPane. INFORMATION_MESSAGE);
        System.exit(0);
    }
}