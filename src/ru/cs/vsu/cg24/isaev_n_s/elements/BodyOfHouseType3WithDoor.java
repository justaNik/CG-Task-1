package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class BodyOfHouseType3WithDoor extends AbstractBodyOfHouse {
    public BodyOfHouseType3WithDoor(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g) {
        // рисование дома
        g.setColor(getColorOfHouse());
        g.fillRect(getX(), getY(), getWidth(), getHeight());

        //рисование двери
        setColorOfDoor(new Color(120, 40, 20));
        setColorOfDoorHandle(Color.BLACK);
        setxPointOfDoor(getX() + getWidth() / 4);
        setyPointOfDoor(getY() + getHeight() / 3);
        g.setColor(getColorOfDoor());
        g.fillRect(getxPointOfDoor(), getyPointOfDoor(), getWidth() / 2, getHeight() / 3 * 2);
        //дверная ручка
        g.setColor(getColorOfDoorHandle());
        g.fillRect(getxPointOfDoor() + getWidth() / 2 - 15, getyPointOfDoor() + getHeight() / 3, 10, 3);
    }


}
