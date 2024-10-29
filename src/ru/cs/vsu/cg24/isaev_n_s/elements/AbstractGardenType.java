package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public  abstract class AbstractGardenType {
    //private int x, y, width, heigth;
    private InfoProvider ip;

    public AbstractGardenType(InfoProvider ip) {
        /*this.x = x - 100;
        this.y = y;
        this.width = width + 200; //ширина палисадника
        this.heigth = heigth;*/
        this.ip = ip;
    }

    public int getX() {
        return ip.getX();
    }

    public int getY() {
        return ip.getY();
    }

    public int getWidth() {
        return ip.getWidth();
    }

    public int getHeigth() {
        return ip.getHeight();
    }


    public  abstract void draw(Graphics2D g);
}
