package lab01;

// Write, compile and run the ChoosingOption program

import javax.swing.JOptionPane;

public class ChoosingOption {
        public static void main(String[] args){
            // Display Yes/No dialog
            int option = JOptionPane.showConfirmDialog(null,
                    "Do you want to change to the first class ticket?");

            // Display the result
            JOptionPane.showMessageDialog(null, "You've chosen: "

            + (option==JOptionPane. YES_OPTION?"Yes":"No"));
            System.exit(0);
        }
}