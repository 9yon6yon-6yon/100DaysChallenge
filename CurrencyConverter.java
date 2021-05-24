import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter implements WindowListener, ActionListener {

    Panel p = new Panel();
    private Frame f;
    private MenuBar mb;
    private Menu m1;
    private MenuItem mi1, mi2, mi3;
    private TextField tf, tf1, tf2, tf3, to;
    public Button clr, convert;
    String value;
    Double ammount;

    public CurrencyConverter() {
        f = new Frame("Currency Converter");
        tf = new TextField(10);
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(20);
        to = new TextField(5);
        // menu opening
        mb = new MenuBar();
        m1 = new Menu("☰");
        mi1 = new MenuItem("Dark");
        mi1.setActionCommand("black_theme");
        mi2 = new MenuItem("Light");
        mi2.setActionCommand("light_theme");
        mi3 = new MenuItem("Exit");
        mi3.setActionCommand("exit");// menu closing

    }

    public void launchFrame() {

        m1.add(mi1);
        mi1.addActionListener(this);
        m1.add(mi2);
        mi2.addActionListener(this);
        m1.addSeparator();
        m1.add(mi3);
        mi3.addActionListener(this);
        mb.add(m1);
        clr = new Button("RELOAD");
        clr.setActionCommand("reload");
        clr.addActionListener(this);
        convert = new Button("CONVERT");
        convert.setActionCommand("converter");
        convert.addActionListener(this);

        f.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(2, 2));
        f.add(p, BorderLayout.CENTER);
        f.add(tf);
        f.add(tf1);
        f.add(to);
        f.add(tf2);
        f.add(tf3, BorderLayout.CENTER);
        f.add(tf3, BorderLayout.SOUTH);
        p.add(convert);
        p.add(clr);
        f.add(p);
        tf1.setText("USD");
        tf2.setText("BDT");
        to.setText("TO");

        f.setMenuBar(mb);
        f.addWindowListener(this);

        f.setSize(350, 300);

        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        // theme starting
        if (e.getActionCommand() == "black_theme") {
            tf.setForeground(Color.white);
            tf.setBackground(Color.black);
            to.setForeground(Color.white);
            to.setBackground(Color.black);
            tf1.setForeground(Color.white);
            tf1.setBackground(Color.black);
            tf2.setForeground(Color.white);
            tf2.setBackground(Color.black);
            tf3.setForeground(Color.white);
            tf3.setBackground(Color.black);
            f.setBackground(Color.black);
            f.setForeground(Color.white);

        }
        if (e.getActionCommand() == "light_theme") {
            tf.setForeground(Color.black);
            tf.setBackground(Color.white);
            to.setForeground(Color.black);
            to.setBackground(Color.white);
            tf1.setForeground(Color.black);
            tf1.setBackground(Color.white);
            tf2.setForeground(Color.black);
            tf2.setBackground(Color.white);
            tf3.setForeground(Color.black);
            tf3.setBackground(Color.white);
            f.setBackground(Color.white);
            f.setForeground(Color.black);
        }
        if (e.getActionCommand() == "exit") {
            System.exit(0);
        } // theme closing
        if (e.getActionCommand() == "reload") {

            tf.setText("");
            tf3.setText("");
            tf1.setText("USD");
            tf2.setText("BDT");
            to.setText("TO");
        }
        if (e.getActionCommand() == "converter") {
            value = tf.getText();
            ammount = Double.parseDouble(value) * 84;
            tf3.setText("RESULT = " + String.valueOf(ammount));

        }

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowIconified(WindowEvent arg0) {

    }

    public void windowOpened(WindowEvent arg0) {

    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.launchFrame();
    }

}
