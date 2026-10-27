import javax.swing.SwingUtilities;

public class ServiceMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ServiceModel model = new ServiceModel();
            ServiceView view = new ServiceView();
            new ServiceController(model, view);
            view.setVisible(true);
        });
    }
}
