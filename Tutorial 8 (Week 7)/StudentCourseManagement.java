import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class StudentCourseManagement extends JFrame {
    private JList<String> courseList;
    private JTable table;
    private DefaultTableModel model;
    private JTextField studentName;

    public StudentCourseManagement() {
        setTitle("Student Course Management");
        setSize(750, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        courseList = new JList<>(new String[]{
            "Java Programming", "Data Structures", "Database Management",
            "Operating Systems", "Computer Networks"
        });
        studentName = new JTextField();
        JPanel left = new JPanel(new BorderLayout(5, 5));
        left.add(new JLabel("Student Name:"), BorderLayout.NORTH);
        left.add(studentName, BorderLayout.CENTER);
        left.add(new JScrollPane(courseList), BorderLayout.SOUTH);
        left.setBorder(BorderFactory.createTitledBorder("Course Selection"));
        model = new DefaultTableModel(new String[]{"Student Name", "Selected Course", "Enrollment Status"}, 0);
        table = new JTable(model);
        JButton add = new JButton("Add Registration");
        JButton remove = new JButton("Remove Registration");
        add.addActionListener(e -> {
            String name = studentName.getText().trim();
            String course = courseList.getSelectedValue();
            if (name.isEmpty() || course == null) {
                JOptionPane.showMessageDialog(this,
                        "Enter student name and select a course.");
                return;
            }
            model.addRow(new Object[]{name, course, "Enrolled"});
        });

        remove.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Select a registration to remove.");
            } else {
                model.removeRow(row);
            }
        });
        JPanel buttons = new JPanel();
        buttons.add(add);
        buttons.add(remove);
        setLayout(new BorderLayout(10, 10));
        add(left, BorderLayout.WEST);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentCourseManagement().setVisible(true));
    }
}
