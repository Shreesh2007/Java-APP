import javax.swing.*;
import java.awt.*;

public class EmployeeView {
    public JFrame loginFrame;
    public JTextField usernameField;
    public JPasswordField passwordField;
    public JButton loginButton;

    public JFrame mainFrame;
    public JMenuItem addEmployeeItem;
    public JMenuItem viewEmployeeItem;
    public JMenuItem changePasswordItem;
    public JMenuItem logoutItem;
    public JMenuItem exitItem;

    public JFrame createLoginView() {
        loginFrame = new JFrame("Employee Portal - Login");
        loginFrame.setSize(400, 250);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        loginFrame.add(panel);
        return loginFrame;
    }

    public void createMainView() {
        mainFrame = new JFrame("Employee Management Portal");
        mainFrame.setSize(600, 350);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        JMenuBar bar = new JMenuBar();

        JMenu employee = new JMenu("Employee");
        addEmployeeItem = new JMenuItem("Add Employee");
        viewEmployeeItem = new JMenuItem("View Employee");
        employee.add(addEmployeeItem);
        employee.add(viewEmployeeItem);

        JMenu tools = new JMenu("Tools");
        changePasswordItem = new JMenuItem("Change Password");
        tools.add(changePasswordItem);

        JMenu exit = new JMenu("Exit");
        logoutItem = new JMenuItem("Logout");
        exitItem = new JMenuItem("Exit Application");
        exit.add(logoutItem);
        exit.add(exitItem);

        bar.add(employee);
        bar.add(tools);
        bar.add(exit);

        mainFrame.setJMenuBar(bar);
        mainFrame.add(new JLabel("Welcome to Employee Management Portal",
                SwingConstants.CENTER));
    }
}
