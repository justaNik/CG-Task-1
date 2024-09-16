package ru.cs.vsu.cg24.isaev_n_s;

import ru.cs.vsu.cg24.isaev_n_s.elements.Sun;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Sun s;

    public DrawPanel() {
        s = new Sun(100, 100, 40, 50, 15);

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        // g.drawRect(200, 200, 100, 150);
        // g.drawLine(200, 200, 250, 150);
        // g.drawLine(250, 150, 300, 200);
        s.drawSun(g);
    }
}
