import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Zulkar implements WindowListener, ActionListener {
    int i;
    Menu m;
    MenuItem rm;
    MenuBar menubr = new MenuBar();
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    public Zulkar() {
        m = new Menu("|||");
        rm = new MenuItem("Reset");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        rm.setActionCommand("rst");
        rm.addActionListener(this);
        m.add(rm);
        menubr.add(m);
        frame.setMenuBar(menubr);

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("InK Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();

    }

    String sign;

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "rst") {

            for (i = 0; i < 9; i++) {
                buttons[i].setText("");
                buttons[i].setBackground(new Color(255, 255, 255));
            }
            new Zulkar();

        }
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        sign = "X";
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("X turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        sign = "O";
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("O turn");
                        check();
                    }
                }
            }
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

    public void windowIconified(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {

    }

    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X turn");
        } else {
            player1_turn = false;
            textfield.setText("O turn");
        }
    }

    public void check() {
        if ((buttons[0].getText() == sign) && (buttons[1].getText() == sign) && (buttons[2].getText() == sign)) {
            Wins(0, 1, 2);
        }
        if ((buttons[3].getText() == sign) && (buttons[4].getText() == sign) && (buttons[5].getText() == sign)) {
            Wins(3, 4, 5);
        }
        if ((buttons[6].getText() == sign) && (buttons[7].getText() == sign) && (buttons[8].getText() == sign)) {
            Wins(6, 7, 8);
        }
        if ((buttons[0].getText() == sign) && (buttons[3].getText() == sign) && (buttons[6].getText() == sign)) {
            Wins(0, 3, 6);
        }
        if ((buttons[1].getText() == sign) && (buttons[4].getText() == sign) && (buttons[7].getText() == sign)) {
            Wins(1, 4, 7);
        }
        if ((buttons[2].getText() == sign) && (buttons[5].getText() == sign) && (buttons[8].getText() == sign)) {
            Wins(2, 5, 8);
        }
        if ((buttons[0].getText() == sign) && (buttons[4].getText() == sign) && (buttons[8].getText() == sign)) {
            Wins(0, 4, 8);
        }
        if ((buttons[2].getText() == sign) && (buttons[4].getText() == sign) && (buttons[6].getText() == sign)) {
            Wins(2, 4, 6);
        }
    }

    public void Wins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        textfield.setText(sign + " wins !!!");
    }

    public static void main(String[] args) {

        new Zulkar();

    }
}
