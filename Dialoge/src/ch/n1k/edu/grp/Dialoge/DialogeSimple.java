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
 **/

package ch.n1k.edu.grp.Dialoge;

import javax.swing.*; // oder javax.swing.JDalog;

public class DialogeSimple {
    public static void main(String[] args) {

        // erstellen eines simple JDialog
        // init
        JDialog jd = new JDialog();
        // setzen eines Titels via method
        jd.setTitle("Mein Imba Dialog");
        // standart Pixel angaben für Frameumfang
        jd.setSize(250,250);
        // über method lässt sich steuern ob Modal oder nicht
        jd.setModal(true);
        // zu guter letzt müssen wir das frame noch sichtbar machen
        jd.setVisible(true);


    }
}
