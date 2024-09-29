package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class PoliceCar extends Car{
    public PoliceCar(int x, int y) {
        super(x, y);
    }

    @Override
    public void setBodyColor(Color bodyColor) {
        super.setBodyColor(Color.cyan);
        super.setRoofColor(Color.cyan);
    }

    @Override
    public void drawCar(Graphics2D g) {
        super.drawCar(g);


        g.setColor(Color.blue);
        g.fillRect(getX() + getWidth() / 2 - 15, getY() - getRoofHeight() - 10, 15, 10);

        g.setColor(Color.red);
        g.fillRect(getX() + getWidth() / 2, getY() - getRoofHeight() - 10, 15, 10);
    }
}
