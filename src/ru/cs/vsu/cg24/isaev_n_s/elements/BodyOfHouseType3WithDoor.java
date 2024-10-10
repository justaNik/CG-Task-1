package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class BodyOfHouseType3WithDoor extends BodyOfHouseType1 {
    private int x, y, width, height;
    private final Color colorOfHouse = Color.DARK_GRAY;
    private Color colorOfDoor;
    private int xPointOfDoor;
    private int yPointOfDoor;

    public BodyOfHouseType3WithDoor(int x, int y, int width, int height) {
        super(x, y, width, height);
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColorOfHouse() {
        return colorOfHouse;
    }

    public Color getColorOfDoor() {
        return colorOfDoor;
    }

    public void setColorOfDoor(Color colorOfDoor) {
        this.colorOfDoor = colorOfDoor;
    }

    public int getxPointOfDoor() {
        return xPointOfDoor;
    }

    public void setxPointOfDoor(int xPointOfDoor) {
        this.xPointOfDoor = xPointOfDoor;
    }

    public int getyPointOfDoor() {
        return yPointOfDoor;
    }

    public void setyPointOfDoor(int yPointOfDoor) {
        this.yPointOfDoor = yPointOfDoor;
    }

    @Override
    public void drawBody(Graphics2D g) {
        // рисование дома
        g.setColor(getColorOfHouse());
        g.fillRect(getX(), getY(), getWidth(), getHeight());

        //рисование двери
        setxPointOfDoor(getX() + getWidth() / 4);
        setyPointOfDoor(getY() + getHeight() / 3);
        g.setColor(getColorOfDoor());
        g.fillRect(getxPointOfDoor(), getyPointOfDoor(), getWidth() / 2, getHeight() / 3 * 2);

        //рисование дверной ручки
    }
}
