import javax.swing.*;
import java.awt.*;
public class StudentRegistration extends JFrame {
    private JTextField nameField, registerField;
    private JRadioButton male, female, other;
    private JComboBox<String> department;
    public StudentRegistration() {
        setTitle("Student Registration");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        panel.add(nameField);
        panel.add(new JLabel("Register Number:"));
        registerField = new JTextField();
        panel.add(registerField);
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");
        ButtonGroup group = new ButtonGroup();
        group.add(male); group.add(female); group.add(other);
        genderPanel.add(male); genderPanel.add(female); genderPanel.add(other);
        panel.add(genderPanel);
        panel.add(new JLabel("Department:"));
        department = new JComboBox<>(new String[]{"CSE", "ECE", "EEE", "Mechanical", "Civil"});
        panel.add(department);
        JButton submit = new JButton("Submit");
        panel.add(new JLabel());
        panel.add(submit);
        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : other.isSelected() ? "Other" : "Not Selected";
            String message = "Student Name: " + nameField.getText() + "\nRegister Number: " + registerField.getText() 
                            + "\nGender: " + gender + "\nDepartment: " + department.getSelectedItem();
            JOptionPane.showMessageDialog(this, message, "Registration Details",
                    JOptionPane.INFORMATION_MESSAGE);
        });
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistration().setVisible(true));
    }
}
