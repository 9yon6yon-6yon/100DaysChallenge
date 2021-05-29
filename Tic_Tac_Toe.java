import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tic_Tac_Toe implements WindowListener, ActionListener {

    int i;
    Random random = new Random();
    JFrame f;
    JPanel bp = new JPanel();
    JPanel txtp = new JPanel();
    MenuBar mb;
    Menu m, smenu;
    MenuItem mi1, mi2, resetmenu;
    TextField textfield1;
    JLabel textField2 = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player_turn;
    String sign;

    public Tic_Tac_Toe() {
        f = new JFrame("Tic Tac Toe ");
        mb = new MenuBar();
        textfield1 = new TextField(10);
        m = new Menu("☰ Menu");
        smenu = new Menu("VS");
        resetmenu = new MenuItem("⟳ Reload");
        resetmenu.setActionCommand("reset");
        mi1 = new MenuItem("Player vs Player");
        mi1.setActionCommand("playervsplayer");
        mi2 = new MenuItem("Player vs Computer");
        mi2.setActionCommand("playervscomputer");
        mb.add(m);
        m.add(resetmenu);
        resetmenu.addActionListener(this);
        m.add(smenu);
        smenu.add(mi1);
        mi1.addActionListener(this);
        smenu.add(mi2);
        mi2.addActionListener(this);
        f.setSize(800, 800);
        f.getContentPane().setBackground(new Color(50, 50, 50));
        f.setLayout(new BorderLayout());
        f.setVisible(true);

        textField2.setBackground(new Color(25, 25, 25));
        textField2.setForeground(new Color(25, 255, 0));
        textField2.setFont(new Font("InK Free", Font.BOLD, 70));
        textField2.setHorizontalAlignment(JLabel.CENTER);
        textField2.setText("Tic Tac Toe");
        textField2.setOpaque(true);

        txtp.setLayout(new BorderLayout());
        txtp.setBounds(0, 0, 800, 100);
        bp.setLayout(new GridLayout(3, 3));

        for (i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setBackground(new Color(255, 255, 255));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            bp.add(buttons[i]);

        }
        f.add(textfield1, BorderLayout.NORTH);
        f.setMenuBar(mb);
        txtp.add(textField2);
        f.add(txtp, BorderLayout.SOUTH);
        f.add(bp);
        f.addWindowListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setBackground(new Color(255, 255, 255));
                        buttons[i].setText("X");
                        player_turn = false;
                        sign = "X";
                        textField2.setText("O's turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setBackground(new Color(255, 255, 255));
                        buttons[i].setText("O");
                        sign = "O";
                        player_turn = true;
                        textField2.setText("X's turn");
                        check();
                    }
                }
            }
        }
        if (e.getActionCommand() == "playervsplayer") {
            textfield1.setText("\t\t\t\tPlayer VS Player   \t\t");

        }
        if (e.getActionCommand() == "playervscomputer") {
            textfield1.setText("\t\t\t\tPlayer VS Computer   \t\t");

        }

        if (e.getActionCommand() == "reset") {
            textfield1.setText("\t\t\t\t    Reset  \t\t");
            for (i = 0; i < 9; i++) {
                buttons[i].setText("");
                buttons[i].setBackground(new Color(255, 255, 255));
            }
            new Tic_Tac_Toe();

        }

    }

    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0) {
            player_turn = true;
            sign = "X";
            textField2.setText("X turn");

        } else {
            player_turn = false;
            sign = "O";
            textField2.setText("O turn");

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

        textField2.setText(sign + " wins !!!");
    }

    public void draw() {

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

    public static void main(String[] args) {
        new Tic_Tac_Toe();

    }

}
