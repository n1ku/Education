/**
 * Grafische Benutzeroberflächen mit JAVA
 *
 * Aufgabe B - Dialoge
 *
 * Tasks
 * Welche Basisklasse wird für Dialoge benutzt?
 * Worin liegt der Unterschied zwischen modalen und nicht-modalen  Dialogen?
 * Welche Standarddialoge sind in Java verfügbar
 * Wie entwirft man eigene Dialogfenster?
 *
 * @autor Besnik Istrefi, Fernando Maniglio, Aaron Stetter
 * @version 2018.0.1
 *
 */
package ch.n1k.edu.grp.Dialoge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog extends JDialog implements ActionListener{
    // attributes
    private JFrame frame;
    private JDialog dialog;
    private JButton btn1;
    private JPanel panel;

    public Dialog(JFrame frame, JDialog dialog, JButton btn1, JPanel panel) {
        this.frame = frame;
        this.dialog = dialog;
        this.btn1 = btn1;
        this.panel = panel;
    }

    /**
     * Generiert neues JFrame, JDialog und einen JButton
     */
    public Dialog() {
        this.frame = new JFrame();
        this.dialog = new JDialog();
        this.btn1 = new JButton("Start");
        this.panel = new JPanel();
    }

    public void initGui(){
        frame.setSize(300,100);
        frame.add(btn1,BorderLayout.CENTER);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Dialog g = new Dialog();
        g.initGui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(isVisible());
    }
}
