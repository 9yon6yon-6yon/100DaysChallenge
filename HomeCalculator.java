import java.awt.*;
import java.awt.event.*;

public class HomeCalculator extends Frame implements WindowListener, ActionListener {

    Panel p = new Panel();

    public Button b[] = new Button[10];

    int i;
    public TextField tf;
    public Button cut, br1, br2, dot, plus, minus, equal, div, multi, clr;

    public HomeCalculator() {
        super("Basic Calculator");

        tf = new TextField(30);

    }

    public void launchFrame() {

        add(tf, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
        p.setLayout(new GridLayout(5, 3));

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
        cut = new Button("<-");
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

        addWindowListener(this);
        setSize(250, 250);

        setVisible(true);
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
            str=" ";
            tf.setText(str);
        }
    }

    public static void main(String[] args) {
        HomeCalculator hc = new HomeCalculator();
        hc.launchFrame();

    }

}
