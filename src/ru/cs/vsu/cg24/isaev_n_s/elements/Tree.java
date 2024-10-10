package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class Tree {
    private int xTrunk, yTrunk, widthOfTree, heightOfTree, xCrown, yCrown, radius;

    public Tree(int xTrunk, int yTrunk, int widthOfTree, int heightOfTree, int xCrown, int yCrown, int radius) {
        this.xTrunk = xTrunk;
        this.yTrunk = yTrunk;
        this.widthOfTree = widthOfTree;
        this.heightOfTree = heightOfTree;
        this.xCrown = xCrown;
        this.yCrown = yCrown;
        this.radius = radius;
    }

    public int getxTrunk() {
        return xTrunk;
    }

    public void setxTrunk(int xTrunk) {
        this.xTrunk = xTrunk;
    }

    public int getyTrunk() {
        return yTrunk;
    }

    public void setyTrunk(int yTrunk) {
        this.yTrunk = yTrunk;
    }

    public int getWidthOfTree() {
        return widthOfTree;
    }

    public void setWidthOfTree(int widthOfTree) {
        this.widthOfTree = widthOfTree;
    }

    public int getHeightOfTree() {
        return heightOfTree;
    }

    public void setHeightOfTree(int heightOfTree) {
        this.heightOfTree = heightOfTree;
    }

    public int getxCrown() {
        return xCrown;
    }

    public void setxCrown(int xCrown) {
        this.xCrown = xCrown;
    }

    public int getyCrown() {
        return yCrown;
    }

    public void setyCrown(int yCrown) {
        this.yCrown = yCrown;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
     public void drawTree(Graphics2D g){
         g.setColor(new Color(139, 70, 19));
         g.fillRect(getxTrunk(), getyTrunk(), getWidthOfTree(), getHeightOfTree());
         g.setColor(new Color(0, 100, 0));
         g.fillOval(getxCrown() , getyCrown(),
                 getRadius() * 2, getRadius() * 2);
     }
}
