package gui;

import javax.swing.*;
import java.awt.*;

public class JavaPhoneGUI {
    public static void main(String[] args) {
    private JFrame mainFrame;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnS, btnH;
    private JTextField display;
    private JLabel state;
    private JPanel hookPanel, keyPanel;




    public JavaPhoneGUI() {
        mainFrame = new JFrame("JavaPhone");
        // Key fields
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btnS = new JButton("*");
        btnH = new JButton("#");

        // Text fields
        display = new JTextField("Nummer eingeben");

        // Labels
        state = new JLabel("Verbindungsfehler");

        // Pannels
        hookPanel = new JPanel();
        keyPanel = new JPanel();
    }

    public void paint () {
        // Main frame definitions
        mainFrame.setLayout(new BorderLayout(20, 20));
        // Panel definitions
        keyPanel.setLayout(new GridLayout(4,3,20,20));
        hookPanel.setLayout(new BorderLayout(20,20));

        keyPanel.add(btn1, 1);
        keyPanel.add(btn2, 2);
        keyPanel.add(btn2, 3);
        keyPanel.add(btn1, 4);
        keyPanel.add(btn1, 5);
        keyPanel.add(btn1, 6);
        keyPanel.add(btn1, 7);
        keyPanel.add(btn1, 8);
        keyPanel.add(btn1, 9);
        keyPanel.add(btnH, 10);
        keyPanel.add(btn0, 11);
        keyPanel.add(btnS,12);
        // Label definitions

        // Text Fields definitions

        mainFrame.add(keyPanel, BorderLayout.CENTER);

        mainFrame.setSize(300,300);
        mainFrame.setVisible(true);

    }
}
