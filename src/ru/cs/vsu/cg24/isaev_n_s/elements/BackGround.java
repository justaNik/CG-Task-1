package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class BackGround {
    private int xSky = 0;
    private int ySky = 0;
    private int widthSky = 1400;
    private int heigthSky = 250;
    private int xLand;
    private int yLand;
    private int widthLand = 1400;
    private int heigthLand = 250;
    private final Color COLOR_SKY = Color.CYAN;
    private final Color COLOR_LAND = Color.GREEN;

    public int getxSky() {
        return xSky;
    }

    public void setxSky(int xSky) {
        this.xSky = xSky;
    }

    public int getySky() {
        return ySky;
    }

    public void setySky(int ySky) {
        this.ySky = ySky;
    }

    public int getxLand() {
        return xLand;
    }

    public void setxLand(int xLand) {
        this.xLand = xLand;
    }

    public int getyLand() {
        return yLand;
    }

    public void setyLand(int yLand) {
        this.yLand = yLand;
    }

    public int getWidthSky() {
        return widthSky;
    }

    public void setWidthSky(int widthSky) {
        this.widthSky = widthSky;
    }

    public int getHeigthSky() {
        return heigthSky;
    }

    public void setHeigthSky(int heigthSky) {
        this.heigthSky = heigthSky;
    }

    public int getWidthLand() {
        return widthLand;
    }

    public void setWidthLand(int widthLand) {
        this.widthLand = widthLand;
    }

    public int getHeigthLand() {
        return heigthLand;
    }

    public void setHeigthLand(int heigthLand) {
        this.heigthLand = heigthLand;
    }

    public Color getCOLOR_SKY() {
        return COLOR_SKY;
    }

    public Color getCOLOR_LAND() {
        return COLOR_LAND;
    }

    public void drawBackGround(Graphics2D g){
        g.setColor(getCOLOR_SKY());
        g.fillRect(getxSky(), getySky(), getWidthSky(), getHeigthSky());
        setyLand(getySky() + getHeigthSky());
        g.setColor(getCOLOR_LAND());
        g.fillRect(getxLand(), getyLand(), getWidthLand(), getHeigthLand());
    }
}
