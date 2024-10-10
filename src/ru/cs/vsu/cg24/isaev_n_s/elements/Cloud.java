package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Cloud {

    private int x;
    private int y;
    private final int cloudWidth;
    private final int cloudHeight;

      public Cloud(int x, int y) {
        this.x = x;
        this.y = y;
        this.cloudWidth = 100;  // ширина облака
        this.cloudHeight = 60;  // высота облака
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

    public int getCloudWidth() {
        return cloudWidth;
    }

    public int getCloudHeight() {
        return cloudHeight;
    }

    public void drawCloud(Graphics2D g) {
        g.setColor(Color.LIGHT_GRAY);

        // Рисуем овалы, чтобы создать форму облака

        // Центральный овал
        Ellipse2D.Double centerOval = new Ellipse2D.Double(getX(), getY() - getCloudHeight(), getCloudWidth(), getCloudHeight());
        g.fill(centerOval);

        // Левый овал
        Ellipse2D.Double leftOval = new Ellipse2D.Double(getX() - ((double) getCloudWidth() / 2), getY() - (getCloudHeight() * 0.75), getCloudWidth() * 0.75, getCloudHeight() * 0.75);
        g.fill(leftOval);

        // Правый овал
        Ellipse2D.Double rightOval = new Ellipse2D.Double(getX() + ((double) getCloudWidth() / 2), getY() - (getCloudHeight() * 0.75), getCloudWidth() * 0.75, getCloudHeight() * 0.75);
        g.fill(rightOval);

        // Верхний овал
        Ellipse2D.Double topOval = new Ellipse2D.Double(getX(), getY() - (getCloudHeight() * 1.5), getCloudWidth() * 0.75, getCloudHeight() * 0.75);
        g.fill(topOval);
    }

}

