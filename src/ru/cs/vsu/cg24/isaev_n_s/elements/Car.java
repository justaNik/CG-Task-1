package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;

public class Car {

    // Приватные поля координат и размеров
    private int x;
    private int y;
    private Color colorOfCar;
    private final int width;
    private final int height;
    private int xOfHeadlight;
    private int yOfHeadlight;
    private int rOfheadlight;
    private final int wheelRadius;
    private final int roofHeight;
    private final int windowHeight;


    // Конструктор, принимающий только начальные координаты машины
    public Car(int x, int y, Color colorOfCar) {
        this.x = x;
        this.y = y;
        this.colorOfCar = colorOfCar;
        this.width = 250;         // Ширина главного корпуса машины
        this.height = 60;         // Высота главного корпуса машины
        this.wheelRadius = 20;  // Диаметр колес
        this.roofHeight = 40;     // Высота крыши (трапеции)
        this.windowHeight = 25;   // Высота окна (внутри трапеции)
        this.xOfHeadlight = x + 13;
        this.yOfHeadlight = y + 13;
        this.rOfheadlight = 8;
    }


    public Color getColorOfCar() {
        return colorOfCar;
    }

    public void setColorOfCar(Color colorOfCar) {
        this.colorOfCar = colorOfCar;
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

    public int getHeight() {
        return height;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public int getRoofHeight() {
        return roofHeight;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getxOfHeadlight() {
        return xOfHeadlight;
    }

    public void setxOfHeadlight(int xOfHeadlight) {
        this.xOfHeadlight = xOfHeadlight;
    }

    public int getyOfHeadlight() {
        return yOfHeadlight;
    }

    public void setyOfHeadlight(int yOfHeadlight) {
        this.yOfHeadlight = yOfHeadlight;
    }

    public int getrOfheadlight() {
        return rOfheadlight;
    }

    public void setrOfheadlight(int rOfheadlight) {
        this.rOfheadlight = rOfheadlight;
    }

    // Метод отрисовки машины
    public void drawCar(Graphics2D g) {
        Color bodyColor = getColorOfCar();
        Color roofColor = bodyColor;

        // Установка цвета корпуса машины
        g.setColor(bodyColor);

        // Отрисовка главного прямоугольника - корпуса машины
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        //отрисовка выхлопной трубы
        g.setColor(Color.BLACK);
        g.fillRect(getX() + getWidth(), getY() + getHeight() - 15, 12, 6);

        //отрисвка фары
        g.setColor(Color.yellow);
        g.fillOval(getxOfHeadlight() - getrOfheadlight(), getyOfHeadlight() - getrOfheadlight(),
                getrOfheadlight() * 2, getrOfheadlight() * 2);

        // Установка цвета для колес
        g.setColor(Color.BLACK);
        // Отрисовка переднего колеса
        g.fillOval(getX() + getWidth() / 4 - getWheelRadius(), getY() + getHeight() - getWheelRadius(),
                2 * getWheelRadius(), 2 * getWheelRadius());
        // g.fill(new Ellipse2D.Double(x + 10, y + height, whellRadius, whellRadius));

        // Отрисовка заднего колеса
        g.fillOval(getX() + getWidth() / 4 * 3 - getWheelRadius(), getY() + getHeight() - getWheelRadius(),
                2 * getWheelRadius(), 2 * getWheelRadius());
        //g.fill(new Ellipse2D.Double(x + width - 30, y + height, wheelRadius, wheelRadius));

        // Установка цвета для крыши машины (трапеции)
        g.setColor(roofColor);

        // Координаты для крыши (трапеции)
        int[] xPointsRoof = {getX() + 40, getX() + getWidth() - 40, getX() + getWidth() - 50, getX() + 50};
        int[] yPointsRoof = {getY(), getY(), getY() - getRoofHeight(), getY() - getRoofHeight()};
        Polygon roof = new Polygon(xPointsRoof, yPointsRoof, 4);

        // Отрисовка крыши машины (трапеции)
        g.fillPolygon(roof);

        // Установка цвета для окон
        g.setColor(Color.cyan);

        // Координаты для окна (внутри трапеции)
        int[] xPointsWindow = {getX() + 50, getX() + getWidth() - 50, getX() + getWidth() - 60, getX() + 60};
        int[] yPointsWindow = {getY() - 5, getY() - 5, getY() - getWindowHeight() - 5, getY() - getWindowHeight() - 5};
        Polygon window = new Polygon(xPointsWindow, yPointsWindow, 4);

        // Отрисовка окна машины (трапеции)
        g.fillPolygon(window);

        // Установка цвета для разделяющей линии
        g.setColor(Color.BLACK);

        // Отрисовка вертикальной разделяющей линии посередине окна
        g.drawLine(getX() + getWidth() / 2, getY() - 5, getX() + getWidth() / 2, getY() - getWindowHeight() - 5);
    }
}
