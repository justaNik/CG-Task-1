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

    // Метод отрисовки машины
    public void drawCar(Graphics2D g) {
        Color bodyColor = getColorOfCar();
        Color roofColor = bodyColor;

        // Установка цвета корпуса машины
        g.setColor(bodyColor);

        // Отрисовка главного прямоугольника - корпуса машины
        g.fillRect(getX(), getY(), getWidth(), getHeight());


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
