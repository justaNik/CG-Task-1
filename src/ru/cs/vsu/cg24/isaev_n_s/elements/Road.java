package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class Road {
    private int x = 0;
    private int y = 500;
    private int widthOfRoad = 1400;
    private int heigthOfRoad = 300;


    public int getWidthOfRoad() {
        return widthOfRoad;
    }

    public void setWidthOfRoad(int widthOfRoad) {
        this.widthOfRoad = widthOfRoad;
    }

    public int getHeigthOfRoad() {
        return heigthOfRoad;
    }

    public void setHeigthOfRoad(int heigthOfRoad) {
        this.heigthOfRoad = heigthOfRoad;
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

    public void drawRoad(Graphics2D g){
        g.setColor(Color.gray);
        g.fillRect(getX(), getY(), getWidthOfRoad() , getHeigthOfRoad());
        g.setColor(Color.white);
        g.fillRect(getX(), getY() + getHeigthOfRoad()/2 - 4, getWidthOfRoad(), 8);
    }
}

