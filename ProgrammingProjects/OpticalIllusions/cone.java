package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class cone extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int height = 400;
        int width = 400;
        Color purple = new Color(64, 1 , 74);
        Color gray = new Color(100, 100, 100);
        g.setColor(purple);
        g.drawRect(150, 125, 75, 75);
        g.drawRect(100, 75, 175, 175);
        g.drawRect(50, 25, 275, 275);
        g.setColor(gray);
        for(int i = 1; i < width; i += 10){
            g.drawOval(0, 0, i, i);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("cone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new cone());
        frame.setVisible(true);
    }
}
