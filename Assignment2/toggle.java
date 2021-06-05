package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class toggle extends JFrame {
    TextField textfield;
    JButton button;
    JFrame frame;

    toggle() {
        frame = new JFrame("Toggle");
        frame.setLayout(new FlowLayout());
        frame.setSize(350, 200);
        frame.setVisible(true);
        textfield = new TextField(20);
        button = new JButton("toggle");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = textfield.getText();
                char[] ch = str.toCharArray();
                boolean f = false;
                for (int i = 0; i < str.length(); i++) {
                    if (ch[i] > 99) {
                        f = true;
                    } else {
                        f = false;

                    }
                    if (f == true) {
                        textfield.setText(str.toUpperCase());
                    } else {
                        textfield.setText(str.toLowerCase());

                    }
                }
            }
        });
        frame.add(button);
        frame.add(textfield);
    }

    public static void main(String[] args) {
        new toggle();
    }

}
/*Design a UI with: [10]
○ A button and a textfield
○ Name the button as “toggle”
○ Pressing the button would
■ If any of the characters of the textfield are lowercase, change it to
UPPERCASE (Abcf -> ABCF)
■ If all the characters of the textfield are UPPERCASE, change it to
lowercase (ABCF -> abcf)
○ Event handling must be implemented with anonymous inner class*/