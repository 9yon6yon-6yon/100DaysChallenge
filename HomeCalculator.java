import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.MenuItemUI;

public class HomeCalculator implements WindowListener, ActionListener {

    Panel p = new Panel();
    private Frame f;
    private MenuBar mb;
    private Menu m1;
    private MenuItem mi1, mi2, mi3;

    public Button b[] = new Button[10];

    int i;
    public TextField tf;
    public Button cut, br1, br2, dot, plus, minus, equal, div, multi, clr;

    public HomeCalculator() {
        f = new Frame("Calculator");

        tf = new TextField(12);
        mb = new MenuBar();
        m1 = new Menu("☰");

        mi1 = new MenuItem("Dark");
        mi1.setActionCommand("black_theme");

        mi2 = new MenuItem("Light");
        mi2.setActionCommand("light_theme");
        mi3 = new MenuItem("Exit");
        mi3.setActionCommand("exit");

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
        f.setMenuBar(mb);

        p.setLayout(new GridLayout(5, 3));
        f.add(tf, BorderLayout.NORTH);

        f.add(p, BorderLayout.CENTER);
        f.setLayout(new FlowLayout());

        for (i = 0; i <= 9; i++) {
            b[i] = new Button(i + "");

            b[i].addActionListener(this);

        }
        dot = new Button(".");
        clr = new Button("C");
        clr.setActionCommand("clear");
        multi = new Button("*");
        plus = new Button("+");
        minus = new Button("-");
        equal = new Button("=");
        div = new Button("/");
        br1 = new Button("(");
        br2 = new Button(")");
        cut = new Button("<");
        cut.setActionCommand("remove");
        dot.addActionListener(this);
        clr.addActionListener(this);
        multi.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        equal.addActionListener(this);
        div.addActionListener(this);
        br1.addActionListener(this);
        br2.addActionListener(this);
        cut.addActionListener(this);

        p.add(br1);
        p.add(br2);
        p.add(cut);
        p.add(clr);

        p.add(b[7]);
        p.add(b[8]);
        p.add(b[9]);
        p.add(div);

        p.add(b[4]);
        p.add(b[5]);
        p.add(b[6]);
        p.add(multi);

        p.add(b[1]);
        p.add(b[2]);
        p.add(b[3]);
        p.add(minus);

        p.add(b[0]);
        p.add(dot);
        p.add(plus);
        p.add(equal);

        f.add(p);// adding panel to the frame
        f.addWindowListener(this);

        f.setSize(200, 230);

        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        String str;
        if (e.getActionCommand() == "clear") {
            str = " ";
            tf.setText(str);
        }
        if (e.getActionCommand() == "black_theme") {
            tf.setForeground(Color.white);
            tf.setBackground(Color.black);
            f.setBackground(Color.black);
            f.setForeground(Color.white);

        }
        if (e.getActionCommand() == "light_theme") {
            tf.setForeground(Color.black);
            tf.setBackground(Color.white);
            f.setBackground(Color.white);
            f.setForeground(Color.black);
        }
        if (e.getActionCommand() == "exit")
            System.exit(0);
    }

    public static void main(String[] args) {
        HomeCalculator hc = new HomeCalculator();
        hc.launchFrame();

    }

}
