import javax.swing.JOptionPane;
public class GradeController {
    private GradeModel model;
    private GradeView view;

    public GradeController(GradeModel model, GradeView view) {
        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(e -> calculateResult());
    }

    private void calculateResult() {
        try {
            String name = view.nameField.getText().trim();
            int m1 = Integer.parseInt(view.mark1Field.getText().trim());
            int m2 = Integer.parseInt(view.mark2Field.getText().trim());
            int m3 = Integer.parseInt(view.mark3Field.getText().trim());

            if (name.isEmpty() || m1 < 0 || m1 > 100 ||
                    m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                throw new IllegalArgumentException();
            }

            model.calculate(name, m1, m2, m3);

            view.resultLabel.setText(String.format(
                    "<html>Total: %d | Average: %.2f | Grade: %s</html>",
                    model.getTotal(), model.getAverage(), model.getGrade()));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view,
                    "Enter a valid name and marks between 0 and 100.",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
}
