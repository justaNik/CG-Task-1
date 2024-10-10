package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class RoofType2 extends RoofType1{

    public RoofType2(int x, int y, int widthOfHouse, int heightOfHouse, Color colorOfRoof) {
        super(x, y, widthOfHouse, heightOfHouse, colorOfRoof);
    }

    @Override
    public void draw(Graphics2D g) {
        drawChimney(g);
        g.setColor(getColorOfRoof());
       int[] xPointRoof = {getX() - getWidthOfHouse() / 4, getX() + getWidthOfHouse() + getWidthOfHouse() / 4,
       getX() + getWidthOfHouse() - getWidthOfHouse() / 4, getX() + getWidthOfHouse() / 4};
       int[] yPointRoof = {getY(), getY(), getY() - getHeightOfHouse() / 3, getY() - getHeightOfHouse() / 3};
       g.fillPolygon(xPointRoof, yPointRoof, 4);

    }

    private void drawChimney(Graphics2D g){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(getX() + getWidthOfHouse() - getWidthOfHouse() / 8,
                getY() - getHeightOfHouse() / 3 - getHeightOfHouse() / 6,
                getWidthOfHouse() / 5,
                getHeightOfHouse() / 3 + getHeightOfHouse() / 6);
    }
}
