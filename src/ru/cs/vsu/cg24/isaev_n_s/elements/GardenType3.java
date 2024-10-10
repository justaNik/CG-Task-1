package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

/*
В класс палисадника передается х - координата начала тела дома, у - координата дороги,
относительно этих координат будет рисоваться весь палисадник
 */
public class GardenType3 {
    private int x, y, width, heigth;

    public GardenType3(int x, int y, int width, int heigth) {
        this.x = x - 100;
        this.y = y;
        this.width = width + 200; //ширина палисадника
        this.heigth = heigth;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void drawFrontGarden(Graphics2D g) {
        int startX = getX();
        int lengthOfSticks = 50;
        int currentWidth = getWidth();
        int currentHeight = getY();

        //рисуем дальний забор
        g.setColor(new Color(90, 45, 10));
        for (int i = 0; i <= currentWidth / 50; i++) {
            g.fillRect(startX, getY() - getHeigth() - 30, 10, 50);
            if (i < currentWidth / 50) {
                g.fillRect(startX + 10, currentHeight - getHeigth() - 10, lengthOfSticks, 2);
                g.fillRect(startX + 10, currentHeight - getHeigth() + 10, lengthOfSticks, 2);
            }
            startX += lengthOfSticks;
        }

        //рисуем боковые заборы
        g.fillRect(getX() + 4, getY() - getHeigth() - 30, 2, (getY() - 80) - (getY() - getHeigth() - 30));
        for (int i = 0; i <= getHeigth() / 80; i++) {
            g.fillRect(getX(), getY() - 80 - 10 - lengthOfSticks - 10, 10, lengthOfSticks - 10);
        }
        g.fillRect(startX - lengthOfSticks + 4, getY() - getHeigth() - 30, 2, (getY() - 80) - (getY() - getHeigth() - 30));
        for (int i = 0; i <= getHeigth() / 80; i++) {
            g.fillRect(startX - lengthOfSticks, getY() - 80 - 10 - lengthOfSticks - 10, 10, lengthOfSticks - 10);
        }

        startX = getX();

        //рисуем ближний забор
        g.setColor(new Color(90, 45, 10));

        for (int i = 0; i <= currentWidth / 50; i++) {
            g.fillRect(startX, getY() - 80, 10, 50);
            if (i < currentWidth / 50) {
                g.fillRect(startX + 10, currentHeight - 60, lengthOfSticks, 2);
                g.fillRect(startX + 10, currentHeight - 40, lengthOfSticks, 2);
            }
            startX += lengthOfSticks;
        }


    }
}