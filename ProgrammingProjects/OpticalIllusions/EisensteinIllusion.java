package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class EisensteinIllusion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color black = new Color(0,0,0);
        Color red = new Color(230, 10, 10);
        g.setColor(black);
        for (int angle = 0; angle < 360; angle += 9) {
            g.drawLine(190, 170, 
             200 + (int) (400 * Math.cos(angle / 180.0 * Math.PI)), 
             200 + (int) (400 * Math.sin(angle / 180.0 * Math.PI)));

        }
        g.setColor(red);
        g.drawRect(240, 110, 125, 125);
        g.drawOval(25, 110, 125, 125);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EisensteinIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new EisensteinIllusion());
        frame.setVisible(true);
    }
}