package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class GardenType2 extends GardenType3{
    public GardenType2(int x, int y, int width, int heigth) {
        super(x, y, width, heigth);
    }

    @Override
    public void drawFrontGarden(Graphics2D g) {
        super.drawFrontGarden(g);
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

        Tree treeRight = new Tree(getX() + getWidth() - 35, currentHeight - heightOfTree - 70,
                widthOfTree,  heightOfTree,
                getX() + getWidth() - 35 + widthOfTree / 2 - radius, currentHeight - heightOfTree - 80 - radius, radius);
        treeRight.drawTree(g);


    }
}
