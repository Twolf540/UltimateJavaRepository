package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class CafeWall extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CafeWall");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new CafeWall());
        frame.setVisible(true);
    }
}