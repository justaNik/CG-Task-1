package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class RoofType1 {
    private int x;
    private int  y;
    private int widthOfHouse;
    private int heightOfHouse;
    private Color colorOfRoof;

    public RoofType1(int x, int y, int widthOfHouse, int heightOfHouse, Color colorOfRoof) {
        this.x = x;
        this.y = y;
        this.heightOfHouse = heightOfHouse;
        this.widthOfHouse = widthOfHouse;
        this.colorOfRoof = colorOfRoof;
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

    public int getHeightOfHouse() {
        return heightOfHouse;
    }

    public void setHeightOfHouse(int heightOfHouse) {
        this.heightOfHouse = heightOfHouse;
    }

    public int getWidthOfHouse() {
        return widthOfHouse;
    }

    public void setWidthOfHouse(int widthOfHouse) {
        this.widthOfHouse = widthOfHouse;
    }

    public Color getColorOfRoof() {
        return colorOfRoof;
    }

    public void setColorOfRoof(Color colorOfRoof) {
        this.colorOfRoof = colorOfRoof;
    }

    public void draw(Graphics2D g){
        g.setColor(getColorOfRoof());

        int[] xPointRoof = {getX(), getX() + getWidthOfHouse(), getX() + getWidthOfHouse() / 2};
        int[] yPointRoof = {getY(), getY(), getY() - getHeightOfHouse() / 3};
        Polygon roof = new Polygon(xPointRoof, yPointRoof, 3);
        g.fillPolygon(roof);
    }
}
