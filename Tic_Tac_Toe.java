import java.awt.*;
import java.awt.event.*;

public class Tic_Tac_Toe implements WindowListener, ActionListener {

    int i, j;
    int sign;
    String str;
    private Frame f;
    private Panel p = new Panel();
    private MenuBar mb;
    private Menu m, smenu;
    private MenuItem mi1, mi2;
    private TextField textfield1;
    public Button buttons[][] = new Button[3][3];
    int winner = 0, count = 0, player;

    public Tic_Tac_Toe() {
        f = new Frame("Tic Tac Toe ");
        mb = new MenuBar();
        textfield1 = new TextField(10);
        m = new Menu("☰ Menu");
        smenu = new Menu("VS");
        mi1 = new MenuItem("Player vs Player");
        mi1.setActionCommand("playervsplayer");
        mi2 = new MenuItem("Player vs Computer");
        mi2.setActionCommand("playervscomputer");

    }

    public void launchFrame() {
        mb.add(m);
        m.add(smenu);
        smenu.add(mi1);
        mi1.addActionListener(this);
        smenu.add(mi2);
        mi2.addActionListener(this);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                buttons[i][j] = new Button(str);
                buttons[i][j].addActionListener(this);
                p.add(buttons[i][j]);
            }

        }
        buttons[0][0].setActionCommand("b00");
        buttons[0][1].setActionCommand("b01");
        buttons[0][2].setActionCommand("b02");
        buttons[1][0].setActionCommand("b10");
        buttons[1][1].setActionCommand("b11");
        buttons[1][2].setActionCommand("b12");
        buttons[2][0].setActionCommand("b20");
        buttons[2][1].setActionCommand("b21");
        buttons[2][2].setActionCommand("b22");

        f.add(textfield1, BorderLayout.NORTH);
        f.add(p);
        p.setLayout(new GridLayout(3, 3));
        f.setMenuBar(mb);
        f.setVisible(true);
        f.setSize(460, 550);
        f.addWindowListener(this);
        f.setBackground(Color.white);
        f.setForeground(Color.black);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "playervsplayer") {
            textfield1.setText("\t\tPlayer VS Player   \t\t");

        }
        if (e.getActionCommand() == "playervscomputer") {
            textfield1.setText("\t\tPlayer VS Computer   \t\t");

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

    public static void main(String[] args) {
        Tic_Tac_Toe tc = new Tic_Tac_Toe();
        tc.launchFrame();
    }

}
