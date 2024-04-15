package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class HeringIllusion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color red = new Color(230, 10, 10);
        Color black = new Color(0, 0, 0);
        int y = 0;
        int count = 0;
        int z = 201;
        g.setColor(red);
        g.drawLine (150, 0, 150, 400);
        g.drawLine (200, 0, 200, 400);
        g.setColor(black);
        // for (int x = 410; x > 100; x -= 30)
        //     g.drawLine(185, 163, x, 163 + y);
        //     if(z < 200){
        //         count = 1;
        //     }
        //     if(count == 0){
        //         y += 30;
        //     }
        //     if(count > 0){
        //         y -= 30;
        //     }
        for(int x = 410; x > - 300; x -= 40){
            g.drawLine(185, 163, x, 163 + y);
            if(y > 500){
                y -= 50;
                count = 1;
            }
            else if(y <= 500 && count == 0){
                y += 50;
            }
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