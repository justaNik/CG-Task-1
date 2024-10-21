package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class RoofType2 extends AbstractRoof{

    public RoofType2() {
        super();
    }

    @Override
    public void draw(Graphics2D g, int x, int y, int widthOfHoese, int heightOfHouse, Color color) {
        drawChimney(g, x, y, widthOfHoese, heightOfHouse);
        g.setColor(color);
       int[] xPointRoof = {x - widthOfHoese / 4, x + widthOfHoese + widthOfHoese / 4,
       x + widthOfHoese - widthOfHoese / 4, x + widthOfHoese / 4};
       int[] yPointRoof = {y, y, y - heightOfHouse / 3, y - heightOfHouse / 3};
       g.fillPolygon(xPointRoof, yPointRoof, 4);

    }

    private void drawChimney(Graphics2D g, int x, int y, int widthOfHoese, int heightOfHouse){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + widthOfHoese - widthOfHoese / 8,
                y - heightOfHouse / 3 - heightOfHouse / 6,
                widthOfHoese / 5,
                heightOfHouse / 3 + heightOfHouse / 6);
    }
}
