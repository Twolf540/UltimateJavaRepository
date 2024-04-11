package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class GradientIllusion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GradientIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new GradientIllusion());
        frame.setVisible(true);
    }
}