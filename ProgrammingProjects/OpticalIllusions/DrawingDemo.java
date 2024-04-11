package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class DrawingDemo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        Color gray = new Color(100, 100, 100);
        g.setColor(gray);
        g.fillRect(50, 50, 100, 100);

        // Draw a circle
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);

        // Draw a line
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 300, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawingDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new DrawingDemo());
        frame.setVisible(true);
    }
}