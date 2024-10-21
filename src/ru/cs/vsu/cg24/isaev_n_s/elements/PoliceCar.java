package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class PoliceCar extends Car {
    public PoliceCar(int x, int y, Color coloOfCar) {
        super(x, y, coloOfCar);
    }


    @Override
    public void drawCar(Graphics2D g) {

        super.drawCar(g);


        g.setColor(Color.blue);
        g.fillRect(getX() + getWidth() / 2 - 15, getY() - getRoofHeight() - 10, 15, 10);

        g.setColor(Color.red);
        g.fillRect(getX() + getWidth() / 2, getY() - getRoofHeight() - 10, 15, 10);
    }

    @Override
    public void moveCar() {
        setX(getX() - 5);  // Двигаем машину влево

        // Если машина выходит за левый край, возвращаем ее на правый
        if (getX() + getWidth() < 0) {
            setX(1810);  // Возвращаем на правый край
        }
    }
}
