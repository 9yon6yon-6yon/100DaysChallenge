import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CurrencyConvert implements ActionListener {

    JButton convertPound, convertCAD, convertYen;
    JTextField textBox1, textBox2;
    JLabel l1;
    String tx1s, tx2s;

    public CurrencyConvert() {

        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocation(300, 200);

        l1 = new JLabel("Enter Amount in Taka:");
        textBox1 = new JTextField(10);
        textBox1.setText(" ");

        convertPound = new JButton("Convert to Pound");
        convertPound.addActionListener(this);
        convertPound.setActionCommand("pound");
        convertCAD = new JButton("Convert to CAD");
        convertCAD.addActionListener(this);
        convertCAD.setActionCommand("cad");

        convertYen = new JButton("Convert to YEN");
        convertYen.addActionListener(this);
        convertYen.setActionCommand("yen");

        textBox2 = new JTextField(20);
        textBox2.setText(" ");

        JPanel panel = new JPanel();
        panel.add(l1);
        panel.add(textBox1);
        panel.add(convertPound);
        panel.add(convertCAD);
        panel.add(convertYen);

        panel.add(textBox2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        double s, d;
        if (e.getActionCommand() == "pound") {
            tx1s = textBox1.getText();
            s = Float.parseFloat(tx1s);
            d = (s / 119.875);

            textBox2.setText(String.valueOf(d) + " Pound.");

        }
        if (e.getActionCommand() == "cad") {
            tx1s = textBox1.getText();
            s = Float.parseFloat(tx1s);
            d = (s / 70.082);

            textBox2.setText(String.valueOf(d) + " Cad.");

        }
        if (e.getActionCommand() == "yen") {
            tx1s = textBox1.getText();
            s = Float.parseFloat(tx1s);
            d = (s / 0.773);

            textBox2.setText(String.valueOf(d) + " Yen.");

        }
    }

}

public class Test {
    public static void main(String[] args) {
        new CurrencyConvert();
    }

}