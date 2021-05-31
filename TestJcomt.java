import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestJcomt extends JFrame {
    private static final long serialVersionUID = 0;

    private JCheckBox bold, italic;
    private JRadioButton male, female;
    private ButtonGroup radioGroup;
    private JComboBox cBox;
    private String[] str1 = { "Spring", "Summer", "Fall" };
    private JList colorList;
    private String[] str2 = { "Red", "Green", "Pink", "Magenta", "Blue", "Orange", "Black" };

    private JTextArea ta1;

    public TestJcomt() {
        super("Test JComponents");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        bold = new JCheckBox("BOLD");
        c.add(bold);
        italic = new JCheckBox("ITALIC");
        c.add(italic);

        male = new JRadioButton("Male");
        c.add(male);
        female = new JRadioButton("Female");
        c.add(female);
        radioGroup = new ButtonGroup();
        radioGroup.add(male);
        radioGroup.add(female);

        cBox = new JComboBox(str1);
        c.add(cBox);

        colorList = new JList(str2);
        colorList.setVisibleRowCount(5);
        c.add(new JScrollPane(colorList));

        String s = "Java is a object oriented programming language";
        ta1 = new JTextArea(s, 10, 15);
        c.add(new JScrollPane(ta1));

        setSize(200, 350);

        show();

    }

    public static void main(String[] args) {
        TestJcomt jc = new TestJcomt();
        jc.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
