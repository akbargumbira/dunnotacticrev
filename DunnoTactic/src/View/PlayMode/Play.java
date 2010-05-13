/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package View.PlayMode;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicBorders.FieldBorder;

/**
 *
 * @author user
 */
public class Play extends JFrame{

    public Play() {
        initComponents();
    }

    public void initComponents() {
        label = new JLabel("Hai...");
        mainPanel = new JPanel(null);
        mainPanel.add(label);

        Dimension size = label.getPreferredSize();
        label.setBounds(0, 0, size.width, size.height);

        Container pane = getContentPane();
        pane.setLayout(null);
        pane.add(mainPanel);
        mainPanel.setBounds(0,0, 100, 100);        
    }

    public static void main(String[] args) {
        Play p = new Play();
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setSize(300, 300);
        p.setVisible(true);
    }

    private JLayeredPane layerpane;
    private JPanel mainPanel;
    private JLabel label;
}
