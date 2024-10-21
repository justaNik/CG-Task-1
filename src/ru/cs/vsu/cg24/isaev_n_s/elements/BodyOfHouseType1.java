package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class BodyOfHouseType1 extends AbstractBodyOfHouse{
    public BodyOfHouseType1(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g) {
        setWidthOfWindow(getWidth() / 2);
        setHeightOfWindow(getWidth() / 2);
        setxOfWindow(getX() + getWidth() / 4);
        setyOfWindow(getY() + (getHeight() - getHEIGHT_WINDOW_OVER_FLOOR() - getHeightOfWindow()));

        g.setColor(getColorOfHouse());
        g.fillRect(getX(), getY(), getWidth(), getHeight()); // рисование дома

        g.setColor(getColorOfWindow());
        g.fillRect(getxOfWindow(), getyOfWindow(), getWidthOfWindow(), getHeightOfWindow()); // рисование окна
        g.setColor(Color.BLACK);
        g.drawLine(getxOfWindow() + getWidthOfWindow() / 2, getyOfWindow(),
                getxOfWindow() + getWidthOfWindow() / 2, getyOfWindow() + getHeightOfWindow());
        g.drawLine(getxOfWindow(), getyOfWindow() + getHeightOfWindow() / 2,
                getxOfWindow() + getWidthOfWindow(), getyOfWindow() + getHeightOfWindow() / 2);

        // g.drawRect(200, 200, 100, 150);
        // g.drawLine(200, 200, 250, 150);
        // g.drawLine(250, 150, 300, 200);
    }
}

