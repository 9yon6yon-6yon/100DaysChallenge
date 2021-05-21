import java.awt.*;
import java.awt.event.*;

public class HomeCalculator implements WindowListener, ActionListener {

    private Frame f;

    public Button b[] = new Button[10];

    int i;
    public TextField tf;
    public Button cut, br1, br2, dot, plus, minus, equal, div, multi, clr;

    public HomeCalculator() {
        f = new Frame("Basic Calculator");
        tf = new TextField(30);

    }

    public void launchFrame() {

        //f.add(tf, BorderLayout.NORTH);
        f.setLayout(new GridLayout(5, 3));

        for (i = 0; i <= 9; i++) {
            b[i] = new Button(i + "");

            b[i].addActionListener(this);

        }
        dot = new Button(".");
        clr = new Button("C");
        multi = new Button("*");
        plus = new Button("+");
        minus = new Button("-");
        equal = new Button("=");
        div = new Button("/");
        br1 = new Button("(");
        br2 = new Button(")");
        cut = new Button("<-");
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

        f.add(br1);
        f.add(br2);
        f.add(cut);
        f.add(clr);

        f.add(b[7]);
        f.add(b[8]);
        f.add(b[9]);
        f.add(div);

        f.add(b[4]);
        f.add(b[5]);
        f.add(b[6]);
        f.add(multi);

        f.add(b[1]);
        f.add(b[2]);
        f.add(b[3]);
        f.add(minus);

        f.add(b[0]);
        f.add(dot);
        f.add(plus);
        f.add(equal);

        f.addWindowListener(this);
        f.setSize(250, 200);
        f.setBackground(Color.lightGray);

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

    }

    public static void main(String[] args) {
        HomeCalculator hc = new HomeCalculator();
        hc.launchFrame();

    }

}
