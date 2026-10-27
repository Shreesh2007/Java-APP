import javax.swing.SwingUtilities;

public class EmployeeMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeModel model = new EmployeeModel();
            EmployeeView view = new EmployeeView();
            view.createLoginView();
            view.createMainView();
            new EmployeeController(model, view);
            view.loginFrame.setVisible(true);
        });
    }
}
