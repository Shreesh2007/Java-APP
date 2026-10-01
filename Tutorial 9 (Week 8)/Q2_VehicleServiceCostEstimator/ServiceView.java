import javax.swing.*;
import java.awt.*;

public class ServiceView extends JFrame {
    JTextField registrationField = new JTextField();
    JRadioButton twoWheeler = new JRadioButton("Two Wheeler", true);
    JRadioButton car = new JRadioButton("Car");
    JCheckBox general = new JCheckBox("General Service - Rs.1000");
    JCheckBox oil = new JCheckBox("Oil Change - Rs.800");
    JCheckBox brake = new JCheckBox("Brake Service - Rs.1200");
    JCheckBox battery = new JCheckBox("Battery Check - Rs.500");
    JButton calculateButton = new JButton("Calculate Cost");
    JLabel resultLabel = new JLabel("Total: Rs.0");

    public ServiceView() {
        setTitle("Vehicle Service Cost Estimator");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        panel.add(new JLabel("Vehicle Registration Number:"));
        panel.add(registrationField);

        JPanel typePanel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        group.add(twoWheeler);
        group.add(car);
        typePanel.add(twoWheeler);
        typePanel.add(car);
        panel.add(typePanel);

        panel.add(general);
        panel.add(oil);
        panel.add(brake);
        panel.add(battery);

        JPanel bottom = new JPanel();
        bottom.add(calculateButton);
        bottom.add(resultLabel);
        panel.add(bottom);

        add(panel);
    }
}
