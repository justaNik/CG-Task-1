package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class Houses {
    private int x, y, width, height;
    private Color cOfHouse = Color.DARK_GRAY;
    private Color cOfWindow = Color.CYAN;
    private Color cOfRoof = Color.RED;
    private int widthOfWindow;
    private int heightOfWindow;
    private int xOfWindow; //начальная координата х для окна
    private int yOfWindow; // начальная координата у для окна

    public Houses(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public Color getcOfWindow() {
        return cOfWindow;
    }

    public void setcOfWindow(Color cOfWindow) {
        this.cOfWindow = cOfWindow;
    }

    public Color getcOfRoof() {
        return cOfRoof;
    }

    public void setcOfRoof(Color cOfRoof) {
        this.cOfRoof = cOfRoof;
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

    public Color getcOfHouse() {
        return cOfHouse;
    }

    public void setcOfHouse(Color cOfHouse) {
        this.cOfHouse = cOfHouse;
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

    public int getHEIGHT_WINDOW_OVER_FLOOR() { // не знаю зачем, предлодила идея
        return 50;
    }

    public void drawHouse(Graphics2D g) {
        for (int i = 0; i < 7; i++) { // добавить смещение по координатам х и у, чтобы домики рисовались рядом
            if (i != 0) {
                setX(getX() + getWidth() + 50);
            }
            setWidthOfWindow(getWidth() / 2);
            setHeightOfWindow(getWidth() / 2);
            setxOfWindow(getX() + getWidth() / 4);
            setyOfWindow(getY() + (getHeight() - getHEIGHT_WINDOW_OVER_FLOOR() - getHeightOfWindow()));

            g.setColor(cOfHouse);
            g.fillRect(getX(), getY(), getWidth(), getHeight()); // рисование дома
            g.drawLine(getX(), getY(), getX() + getWidth() / 2, getY() - 50);
            g.drawLine(getX() + getWidth() / 2, getY() - 50, getX() + getWidth(), getY());


            g.setColor(cOfWindow);
            g.fillRect(getxOfWindow(), getyOfWindow(), getWidthOfWindow(), getHeightOfWindow()); // рисование окна
            g.setColor(Color.BLACK);
            g.drawLine(getxOfWindow() + getWidthOfWindow() / 2, getyOfWindow(),
                    getxOfWindow() + getWidthOfWindow() / 2, getyOfWindow() + getHeightOfWindow());
            g.drawLine(getxOfWindow(), getyOfWindow() + getHeightOfWindow() / 2,
                    getxOfWindow() + getWidthOfWindow(), getyOfWindow() + getHeightOfWindow() / 2);

        }
        /* хотел сделать рисавание треугольника для крыши
        int xOfRoof = getX();
        int yOfRoof = getY();
        public static Shape drawTriangle (Graphics2D g,double x, double y, double height, double width){
            final GeneralPath triangle = new GeneralPath();
            triangle.setWindingRule(Path2D.WIND_EVEN_ODD);
            triangle.moveTo(x - (width / 2.0), y - (height / 2));
            triangle.lineTo(x + (width / 2.0), y - (height / 2));
            triangle.lineTo(x + (width / 2.0), y + (height / 2));
            triangle.lineTo(x - (width / 2.0), y - (height / 2));
            triangle.closePath();/* w  ww. j  ava 2s.  com*/

        //g.draw(triangle);
        // }


        // g.drawRect(200, 200, 100, 150);
        // g.drawLine(200, 200, 250, 150);
        // g.drawLine(250, 150, 300, 200);
    }
}
