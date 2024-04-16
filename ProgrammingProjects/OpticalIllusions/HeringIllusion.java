package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HeringIllusion extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color red = new Color(230, 10, 10);
        Color black = new Color(0, 0, 0);
        g.setColor(red);
        g.drawLine (125, 0, 125, 400);
        g.drawLine (250, 0, 250, 400);
        g.setColor(black);
        for (int angle = 0; angle < 360; angle += 9) {
            g.drawLine(190, 170, 
             200 + (int) (400 * Math.cos(angle / 180.0 * Math.PI)), 
             200 + (int) (400 * Math.sin(angle / 180.0 * Math.PI)));

        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("HeringIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HeringIllusion());
        frame.setVisible(true);
    }
}