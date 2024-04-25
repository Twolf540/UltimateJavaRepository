package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class CafeWall extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color gray = new Color(100, 105, 110);
        Color black = new Color(0, 0, 0);
        int height = 400;
        int width = 480;
        int switch1 = 0;
        int x1 = 20;
        g.setColor(gray);
        g.fillRect(0 , 0, 500, 3);
        g.fillRect(0, 357, 500, 3);
        for(int i = 40; i < height; i += 40){
            g.fillRect(0, i, 500, 3);
        }
        g.setColor(black);
        for(int i = 0; i < 9; i++){
            int y = 40 * i + 3;
            if(i < 8){
                for(int x = x1; x < width; x += 115){
                    g.fillRect(x, y, 50, 37);
                }
            }
            else{
                for(int x = x1; x < width; x += 115){
                    g.fillRect(x, y, 50, 34);
                }
            }
            if (switch1 == 0){
                switch1++;
                x1 += 20;
            }
            else{
                switch1--;
                x1 -= 20;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CafeWall");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(470, 400);
        frame.add(new CafeWall());
        frame.setVisible(true);
    }
}