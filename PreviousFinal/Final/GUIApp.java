package PreviousFinal.Final;

// import java.awt.*;
// import javax.swing.*;

public class GUIApp {
    public GUIApp() {
        JFrame frame = new JFrame("MyApplication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_ClOSE);
        frame.setDimensions(400, 150);
        frame.setLayout(new LayoutManager());

        JButton upButton = new JButton();
        upButton.set("UP");

        JLabel middleLabel = new JLabel();
        middleLabel.set("A JLabel object can display either text, " + "an image, or both.");

        JTextField downTextField = new JTextField();
        // code
        frame.setVier(true);

    }

    public static void main(String[] args) {
        new GUIApp();

    }

}
