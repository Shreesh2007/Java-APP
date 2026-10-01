import javax.swing.*;
import java.awt.*;
public class UserLoginPreferences extends JFrame {
    private JTextField username;
    private JPasswordField password;
    private JCheckBox rememberMe, notifications;
    public UserLoginPreferences() {
        setTitle("User Login and Preferences");
        setSize(450, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Username:"));
        username = new JTextField();
        panel.add(username);
        panel.add(new JLabel("Password:"));
        password = new JPasswordField();
        panel.add(password);
        panel.add(new JLabel("Preferences:"));
        JPanel prefs = new JPanel();
        rememberMe = new JCheckBox("Remember Me");
        notifications = new JCheckBox("Receive Notifications");
        prefs.add(rememberMe);
        prefs.add(notifications);
        panel.add(prefs);
        JButton login = new JButton("Login");
        panel.add(new JLabel());
        panel.add(login);
        login.addActionListener(e -> {
            if (username.getText().isEmpty() || password.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Please enter username and password.",
                        "Login", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Login successful!\nUsername: " + username.getText()
                        + "\nRemember Me: " + rememberMe.isSelected()
                        + "\nReceive Notifications: " + notifications.isSelected(),
                        "Login", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserLoginPreferences().setVisible(true));
    }
}
