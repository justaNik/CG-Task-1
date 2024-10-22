package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class GardenType1 extends AbstractGardenType{

    public GardenType1(int x, int y, int width, int heigth) {
        super(x, y, width, heigth);
    }

    @Override
    public void draw(Graphics2D g) {
        int currentHeight = getY();
        int widthOfTree = 20;
        int heightOfTree = 100;
        int radius = 50;
        int startX = getX();
        int lengthOfSticks = 50;
        int currentWidth = getWidth();


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


        //рисуем деревья
        Tree treeLeft = new Tree(getX() + 25, currentHeight - heightOfTree - 70,
                widthOfTree, heightOfTree, getX() + 25 + widthOfTree / 2 - radius,
                currentHeight - heightOfTree - 80 - radius, radius);
        Tree treeRight = new Tree(getX() + getWidth() - 35, currentHeight - heightOfTree - 70,
                widthOfTree,  heightOfTree,
                getX() + getWidth() - 35 + widthOfTree / 2 - radius, currentHeight - heightOfTree - 80 - radius, radius);
        treeLeft.drawTree(g);
        treeRight.drawTree(g);
    }
}

