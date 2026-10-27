import javax.swing.*;
import java.awt.*;

public class GradeView extends JFrame {
    JTextField nameField = new JTextField();
    JTextField mark1Field = new JTextField();
    JTextField mark2Field = new JTextField();
    JTextField mark3Field = new JTextField();
    JButton calculateButton = new JButton("Calculate Result");
    JLabel resultLabel = new JLabel("Result will appear here");

    public GradeView() {
        setTitle("Student Grade Calculator");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        panel.add(new JLabel("Student Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Subject 1 Marks:"));
        panel.add(mark1Field);
        panel.add(new JLabel("Subject 2 Marks:"));
        panel.add(mark2Field);
        panel.add(new JLabel("Subject 3 Marks:"));
        panel.add(mark3Field);
        panel.add(new JLabel());
        panel.add(calculateButton);
        panel.add(new JLabel("Result:"));
        panel.add(resultLabel);

        add(panel);
    }
}
