package newlibrary;

import javax.swing.*;
import newlibrary.Login;

public class Main {
    public static void main(String[] args) {
        // Start the application by launching the Login screen
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
