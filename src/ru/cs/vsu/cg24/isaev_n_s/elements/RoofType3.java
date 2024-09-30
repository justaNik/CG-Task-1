package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class RoofType3 extends RoofType1{
    public RoofType3(int x, int y, int widthOfHouse, int heightOfHouse, Color colorOfRoof) {
        super(x, y, widthOfHouse, heightOfHouse, colorOfRoof);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(getColorOfRoof());

        int[] xPointRoof = {getX() - getWidthOfHouse() / 4, getX() + getWidthOfHouse() + getWidthOfHouse() / 4,
                getX() + getWidthOfHouse() / 2};
        int[] yPointRoof = {getY(), getY(), getY() - getHeightOfHouse() / 3};
        Polygon roof = new Polygon(xPointRoof, yPointRoof, 3);
        g.fillPolygon(roof);
    }
}
