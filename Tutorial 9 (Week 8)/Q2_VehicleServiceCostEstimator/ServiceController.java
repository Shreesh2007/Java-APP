import javax.swing.JOptionPane;

public class ServiceController {
    private ServiceModel model;
    private ServiceView view;

    public ServiceController(ServiceModel model, ServiceView view) {
        this.model = model;
        this.view = view;
        view.calculateButton.addActionListener(e -> calculate());
    }

    private void calculate() {
        if (view.registrationField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(view,
                    "Enter the vehicle registration number.",
                    "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double total = model.calculateCost(
                view.general.isSelected(),
                view.oil.isSelected(),
                view.brake.isSelected(),
                view.battery.isSelected());

        view.resultLabel.setText(String.format("Total: Rs.%.2f", total));
    }
}
