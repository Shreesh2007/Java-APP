import javax.swing.SwingUtilities;

public class GradeMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GradeModel model = new GradeModel();
            GradeView view = new GradeView();
            new GradeController(model, view);
            view.setVisible(true);
        });
    }
}
