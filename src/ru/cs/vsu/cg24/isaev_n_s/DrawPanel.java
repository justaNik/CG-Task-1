package ru.cs.vsu.cg24.isaev_n_s;

import ru.cs.vsu.cg24.isaev_n_s.elements.Houses;
import ru.cs.vsu.cg24.isaev_n_s.elements.Sun;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Sun s;
    Houses h = new Houses(100, 300, 120, 150);

    public DrawPanel() {
        s = new Sun(100, 100, 40, 50, 15);

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        h.drawHouse(g);
        s.drawSun(g);
    }
}
