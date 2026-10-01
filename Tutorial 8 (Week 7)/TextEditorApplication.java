import javax.swing.*;
import java.awt.*;
public class TextEditorApplication extends JFrame {
    private JTextArea textArea;
    public TextEditorApplication() {
        setTitle("Simple Text Editor");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem exit = new JMenuItem("Exit");
        newItem.addActionListener(e -> textArea.setText(""));
        clear.addActionListener(e -> textArea.setText(""));
        exit.addActionListener(e -> System.exit(0));
        file.add(newItem);
        file.add(clear);
        file.addSeparator();
        file.add(exit);
        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem selectAll = new JMenuItem("Select All");
        cut.addActionListener(e -> textArea.cut());
        copy.addActionListener(e -> textArea.copy());
        paste.addActionListener(e -> textArea.paste());
        selectAll.addActionListener(e -> textArea.selectAll());
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(selectAll);
        bar.add(file);
        bar.add(edit);
        setJMenuBar(bar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextEditorApplication().setVisible(true));
    }
}
