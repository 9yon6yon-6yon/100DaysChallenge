import java.awt.*;
import java.awt.event.*;

public class HomeCalculator implements WindowListener, ActionListener {

    private Frame f;
    private Button b[] = new Button[10];
    int i;
    private TextField tf;
    private Button dot, plus, minus, equal, div, multi, clr;

    public HomeCalculator() {
        f = new Frame("Basic Calculator");
        tf = new TextField(10);
       

    }

    private void launchFrame() {
        tf.setForeground(Color.blue);
        tf.setBackground(Color.white);
        f.add(tf);
        for (i = 0; i <= 9; i++) {
            b[i] = new Button(i + "");

            b[i].addActionListener(this);
            b[i].setBackground(Color.black);
            b[i].setForeground(Color.white);
            f.add(b[i]);

        }
        f.setLayout(new GridLayout(4,4));
       
        f.addWindowListener(this);
        f.setSize(250, 150);
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
