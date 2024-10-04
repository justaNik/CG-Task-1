package ru.cs.vsu.cg24.isaev_n_s;

import ru.cs.vsu.cg24.isaev_n_s.elements.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    BackGround bckgr = new BackGround();
    Sun s;
    Houses h = new Houses(100, 300, 120, 150);
    Road road = new Road();
    Car car = new Car(300, 550, Color.green);
    PoliceCar policeCar = new PoliceCar(700, 550, Color.yellow);

    public DrawPanel() {
        s = new Sun(100, 100, 40, 50, 15);

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        bckgr.drawBackGround(g);
        h.drawHouse(g);
        s.drawSun(g);
        road.drawRoad(g);
        car.drawCar(g);
        policeCar.drawCar(g);
    }
}
