package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class BodyOfHouseType2 extends AbstractBodyOfHouse{
    public BodyOfHouseType2(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g) {
        setWidthOfWindow((getX() + getWidth() - 10) - (getX() + 10));
        setHeightOfWindow(getHeight() / 4);
        setxOfWindow(getX()  + 10);
        setyOfWindow(getY() + (getHeight() - getHEIGHT_WINDOW_OVER_FLOOR() - getHeightOfWindow()));

        g.setColor(getColorOfHouse());
        g.fillRect(getX(), getY(), getWidth(), getHeight()); // рисование дома

        g.setColor(getColorOfWindow());
        g.fillRect(getxOfWindow(), getyOfWindow(), getWidthOfWindow(), getHeightOfWindow()); // рисование окна
        g.setColor(Color.BLACK);
        g.drawLine(getxOfWindow() + getWidthOfWindow() / 2, getyOfWindow(),
                getxOfWindow() + getWidthOfWindow() / 2, getyOfWindow() + getHeightOfWindow());

       /* g.drawLine(getxOfWindow(), getyOfWindow() + getHeightOfWindow() / 2,
                getxOfWindow() + getWidthOfWindow(), getyOfWindow() + getHeightOfWindow() / 2);

        */
    }
}
