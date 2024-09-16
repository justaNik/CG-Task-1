package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;

public class Sun {
    private int x, y, r, l, n; // l - длина лучей солнца, n - кол-во лучей
    Color c = Color.ORANGE;

    public Sun(int x, int y, int r, int l, int n) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.l = l;
        this.n = n;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getL() {
        return l;
    }

    public int getN() {
        return n;
    }

    public Color getC() {
        return c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void drawSun(Graphics2D g) {
        // Paint p = new RadialGradientPaint(x, y, r + l, new float[]{0, 0.9f, 1}, new Color[]{c, Color.BLACK, c});
        // g.setPaint(p);
        Color col = g.getColor();
        g.setColor(c);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = da * i;
            double x1 = r * Math.cos(a);
            double y1 = r * Math.sin(a);
            double x2 = (r + l) * Math.cos(a);
            double y2 = (r + l) * Math.sin(a);
            g.drawLine((int) x1 + x, (int) y1 + y, (int) x2 + x, (int) y2 + y);
        }
        g.setColor(col);
    }
}
