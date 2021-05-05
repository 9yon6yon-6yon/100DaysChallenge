
package javalecture16;

import java.awt.*;
import java.awt.event.*;

public class Javalecture16 implements WindowListener {
    private Frame f;
    private Panel p;

    public Javalecture16() {
        f = new Frame("Welcome to JAVA GUI");
        p = new Panel();
    }

    public void display() {
        f.addWindowListener(this);
        f.setSize(500, 500);
        f.setBackground(Color.green);
        f.setLayout(null);
        p.setSize(200, 300);
        p.setBackground(Color.red);
        f.add(p);
        f.setVisible(true);
    }

    public void windowOpnened(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowInconfined(WindowEvent e) {

    }

    public void windowDeiconfined(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        Javalecture16 x = new Javalecture16();
        x.display();

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }
}