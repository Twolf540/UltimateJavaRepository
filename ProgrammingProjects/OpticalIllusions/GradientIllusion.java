package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class GradientIllusion extends JPanel {
    private static int width = 400;
    private static int height = 400;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int r = 0;
        int gc = 0;
        int b = 0;
        for(int i = 0; i < width; i += 5){
            Color gray = new Color(r, gc ,b);
            g.setColor(gray);
            g.fillRect(i, 0, 5, height);
            if(r < 250){
                r += 5;
            }
            if(gc < 250){
                r += 5;
            }
            if(b < 250){
                r += 5;
            }
            System.out.println("just drew a rectangle...");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GradientIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.add(new GradientIllusion());
        frame.setVisible(true);
    }
}