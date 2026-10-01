import javax.swing.*;
public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;

    public EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model;
        this.view = view;

        view.loginButton.addActionListener(e -> login());

        view.addEmployeeItem.addActionListener(e -> addEmployee());
        view.viewEmployeeItem.addActionListener(e -> viewEmployee());
        view.changePasswordItem.addActionListener(e -> changePassword());
        view.logoutItem.addActionListener(e -> logout());
        view.exitItem.addActionListener(e -> System.exit(0));
    }

    private void login() {
        String user = view.usernameField.getText();
        String pass = new String(view.passwordField.getPassword());

        if (model.validateLogin(user, pass)) {
            JOptionPane.showMessageDialog(view.loginFrame, "Login successful!");
            view.loginFrame.setVisible(false);
            view.mainFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(view.loginFrame,
                    "Invalid username or password.",
                    "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addEmployee() {
        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField dept = new JTextField();

        JPanel panel = new JPanel(new java.awt.GridLayout(3, 2, 5, 5));
        panel.add(new JLabel("Employee ID:"));
        panel.add(id);
        panel.add(new JLabel("Employee Name:"));
        panel.add(name);
        panel.add(new JLabel("Department:"));
        panel.add(dept);

        int result = JOptionPane.showConfirmDialog(view.mainFrame, panel,
                "Add Employee", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(view.mainFrame,
                    "Employee added successfully.\nID: " + id.getText()
                    + "\nName: " + name.getText()
                    + "\nDepartment: " + dept.getText());
        }
    }

    private void viewEmployee() {
        JOptionPane.showMessageDialog(view.mainFrame,
                "Employee records can be displayed here.",
                "View Employee", JOptionPane.INFORMATION_MESSAGE);
    }

    private void changePassword() {
        JPasswordField oldPass = new JPasswordField();
        JPasswordField newPass = new JPasswordField();
        JPasswordField confirmPass = new JPasswordField();

        JPanel panel = new JPanel(new java.awt.GridLayout(3, 2, 5, 5));
        panel.add(new JLabel("Old Password:"));
        panel.add(oldPass);
        panel.add(new JLabel("New Password:"));
        panel.add(newPass);
        panel.add(new JLabel("Confirm Password:"));
        panel.add(confirmPass);

        int result = JOptionPane.showConfirmDialog(view.mainFrame, panel,
                "Change Password", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            boolean changed = model.changePassword(
                    new String(oldPass.getPassword()),
                    new String(newPass.getPassword()),
                    new String(confirmPass.getPassword()));

            JOptionPane.showMessageDialog(view.mainFrame,
                    changed ? "Password changed successfully."
                            : "Invalid old password or passwords do not match.");
        }
    }

    private void logout() {
        view.mainFrame.setVisible(false);
        view.usernameField.setText("");
        view.passwordField.setText("");
        view.loginFrame.setVisible(true);
    }
}
