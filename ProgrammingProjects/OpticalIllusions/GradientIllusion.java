package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class GradientIllusion extends JPanel {
    private static int width = 400;
    private static int height = 400;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int re1 = 0;
        int gr1 = 0;
        int bl1 = 0;
        int re2 = 200;
        int gr2 = 200;
        int bl2 = 200;
        for(int i = 0; i < width - 5; i += 5){
            Color gray1 = new Color(re1, gr1 ,bl1);
            g.setColor(gray1);
            g.fillRect(i, 0, 5, height);
            if(re1 < 250){
                re1 += 5;
            }
            if(gr1 < 250){
                gr1 += 5;
            }
            if(bl1 < 250){
                bl1 += 5;
            }
            System.out.println("just drew a rectangle...");
        }
        for(int i = 50; i < width - 70; i += 5){
            Color gray2 = new Color(re2, gr2 ,bl2);
            g.setColor(gray2);
            g.fillRect(i, 75, 5, height - 200);
            if(re2 > 0){
                re2 -= 2;
            }
            if(gr2 > 0){
                gr2 -= 2;
            }
            if(bl2 > 0){
                bl2 -= 2;
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