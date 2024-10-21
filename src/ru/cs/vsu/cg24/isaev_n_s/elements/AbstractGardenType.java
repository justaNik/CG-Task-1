package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public  abstract class AbstractGardenType {
    private int x, y, width, heigth;

    public AbstractGardenType(int x, int y, int width, int heigth) {
        this.x = x - 100;
        this.y = y;
        this.width = width + 200; //ширина палисадника
        this.heigth = heigth;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public  abstract void draw(Graphics2D g);
}
