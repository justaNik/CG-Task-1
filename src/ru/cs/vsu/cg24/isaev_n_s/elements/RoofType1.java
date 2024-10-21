package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class RoofType1 extends AbstractRoof {


    public RoofType1() {
        super();
    }

    public void draw(Graphics2D g, int x, int y, int widthOfHoese, int heightOfHouse, Color color){
        // делаем так, чтобы объект крыши можно было создавать без каких-либо параметров, а все параметры передавать в метод draw
        g.setColor(color);

        int[] xPointRoof = {x, x + widthOfHoese, x + widthOfHoese / 2};
        int[] yPointRoof = {y, y, y - heightOfHouse / 3};
        Polygon roof = new Polygon(xPointRoof, yPointRoof, 3);
        g.fillPolygon(roof);
    }
}
