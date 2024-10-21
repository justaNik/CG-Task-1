package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class RoofType3 extends AbstractRoof {
    public RoofType3() {
        super();
    }

    @Override
    public void draw(Graphics2D g, int x, int y, int widthOfHoese, int heightOfHouse, Color color) {
        g.setColor(color);

        int[] xPointRoof = {x - widthOfHoese / 4, x + widthOfHoese + widthOfHoese / 4,
                x + widthOfHoese / 2};
        int[] yPointRoof = {y, y, y - heightOfHouse / 3};
        Polygon roof = new Polygon(xPointRoof, yPointRoof, 3);
        g.fillPolygon(roof);
    }
}
