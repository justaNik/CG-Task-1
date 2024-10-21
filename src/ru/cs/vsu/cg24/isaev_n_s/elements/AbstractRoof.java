package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public abstract class AbstractRoof {
    public AbstractRoof() {
    }
    /*
    private int x;
    private int  y;

    private int widthOfHouse;
    private int heightOfHouse;
    private Color colorOfRoof;

   */

    /*
    public AbstractRoof(int x, int y, int widthOfHouse, int heightOfHouse, Color colorOfRoof) {
        this.x = x;
        this.y = y;
        this.heightOfHouse = heightOfHouse;
        this.widthOfHouse = widthOfHouse;
        this.colorOfRoof = colorOfRoof;
    }

     */
 /*
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

     */

    public abstract void draw(Graphics2D g, int x, int y, int widthOfHoese, int heightOfHouse, Color color);
}
