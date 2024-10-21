package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public abstract class AbstractBodyOfHouse {
    private int x, y, width, height;
    private final Color colorOfHouse = Color.DARK_GRAY;
    private Color colorOfWindow = Color.CYAN;

    private int widthOfWindow;
    private int heightOfWindow;
    private int xOfWindow; //начальная координата х для окна
    private int yOfWindow; // начальная координата у для окна

    private Color colorOfDoor;
    private int xPointOfDoor;
    private int yPointOfDoor;

    public AbstractBodyOfHouse(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }


    public int getxOfWindow() {
        return xOfWindow;
    }

    public void setxOfWindow(int xOfWindow) {
        this.xOfWindow = xOfWindow;
    }

    public int getyOfWindow() {
        return yOfWindow;
    }

    public void setyOfWindow(int yOfWindow) {
        this.yOfWindow = yOfWindow;
    }

    public int getWidthOfWindow() {
        return widthOfWindow;
    }

    public void setWidthOfWindow(int widthOfWindow) {
        this.widthOfWindow = widthOfWindow;
    }

    public int getHeightOfWindow() {
        return heightOfWindow;
    }

    public void setHeightOfWindow(int heightOfWindow) {
        this.heightOfWindow = heightOfWindow;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHEIGHT_WINDOW_OVER_FLOOR() { // не знаю зачем, предло;ила идея
        return 50;
    }

    public Color getColorOfWindow() {
        return colorOfWindow;
    }

    public void setColorOfWindow(Color colorOfWindow) {
        this.colorOfWindow = colorOfWindow;
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

    public abstract void draw(Graphics2D g);

    }
