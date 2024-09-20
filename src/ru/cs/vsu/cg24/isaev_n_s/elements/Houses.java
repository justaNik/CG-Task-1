package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class Houses {
    private int x, y, width, height;
    private Color c = Color.gray;
    private int widthOfWindow;
    private int heightOfWindow;
    private int xOfWindow; //начальная координата х для окна
    private int yOfWindow; // начальная координата у для окна

    public Houses(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public int getxOfWindow() {
        return xOfWindow;
    }

    public void setxOfWindow(int xOfWindow) {
        this.xOfWindow = xOfWindow;
    }

    public int getyOfWindow() {
        return yOfWindow;
    }

    public void setyOfWindow(int yOfWindow) {
        this.yOfWindow = yOfWindow;
    }

    public int getWidthOfWindow() {
        return widthOfWindow;
    }

    public void setWidthOfWindow(int widthOfWindow) {
        this.widthOfWindow = widthOfWindow;
    }

    public int getHeightOfWindow() {
        return heightOfWindow;
    }

    public void setHeightOfWindow(int heightOfWindow) {
        this.heightOfWindow = heightOfWindow;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHEIGHT_WINDOW_OVER_FLOOR() { // не знаю зачем, предлодила идея
        return 50;
    }

    public void drawHouse(Graphics2D g) {
        for (int i = 0; i < 8; i++){ // добавить смещение по координатам х и у, чтобы домики рисовались рядом
            g.drawRect(getX(), getY(), getWidth(), getHeight());
            g.drawLine(getX(), getY(), getX() + getWidth() / 2, getY() - 50);
            g.drawLine(getX() + getWidth() / 2, getY() - 50, getX() + getWidth(), getY());
            setWidthOfWindow(getWidth() / 2);
            setHeightOfWindow(getWidth() / 2);
            setxOfWindow(getX() + getWidth() / 4);
            setyOfWindow(getY() + (getHeight() - getHEIGHT_WINDOW_OVER_FLOOR() - getHeightOfWindow()));
            g.drawRect(getxOfWindow(), getyOfWindow(), getWidthOfWindow(), getHeightOfWindow());
            g.drawLine(getxOfWindow() + getWidthOfWindow()/2, getyOfWindow(),
                    getxOfWindow() + getWidthOfWindow()/2, getyOfWindow() + getHeightOfWindow());
            g.drawLine(getxOfWindow(), getyOfWindow() + getHeightOfWindow()/2,
                    getxOfWindow() + getWidthOfWindow(), getyOfWindow() + getHeightOfWindow()/2);

        }




        // g.drawRect(200, 200, 100, 150);
        // g.drawLine(200, 200, 250, 150);
        // g.drawLine(250, 150, 300, 200);
    }
}
