import java.awt.*;
import java.awt.event.*;

public class Calculator1 implements WindowListener, ActionListener {

	private Frame f;
	private Panel p;
	private TextField tf1, tf2, tf3, tf;
	private Button b1, clr;

	public Calculator1() {
		f = new Frame("Basic Calculator");
		p = new Panel();
		tf1 = new TextField(15);
		tf2 = new TextField(15);
		tf3 = new TextField(15);
		tf = new TextField(15);

		b1 = new Button("Convert USD-TK");
		b1.setActionCommand("CON");
		clr = new Button("AC");
		clr.setActionCommand("CLR");
	}

	public void display() {
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.WHITE);

		clr.setForeground(Color.BLACK);
		clr.setBackground(Color.WHITE);

		f.setLayout(new FlowLayout());
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		// f.add(tf);

		f.add(b1);
		b1.addActionListener(this);
		f.add(clr);
		clr.addActionListener(this);
		f.add(tf);

		f.addWindowListener(this);
		f.setSize(400, 200);
		f.setBackground(Color.BLACK);
		f.setVisible(true);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		String Str1;

		double s, d;
		if (e.getActionCommand() == "CON") {
			Str1 = tf1.getText();
			s = Float.parseFloat(Str1);
			d = (s * 80);

			tf.setText("Result = " + String.valueOf(d));
		}

		if (e.getActionCommand() == "CLR") {
			tf.setText("CLEARED");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}

	}

	public static void main(String[] args) {
		Calculator1 cal = new Calculator1();
		cal.display();
	}
}