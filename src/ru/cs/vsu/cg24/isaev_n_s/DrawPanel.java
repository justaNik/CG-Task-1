package ru.cs.vsu.cg24.isaev_n_s;

import ru.cs.vsu.cg24.isaev_n_s.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class DrawPanel extends JPanel {
    BackGround bckgr = new BackGround();
    private final java.util.List<Cloud> clouds = new ArrayList<>();
    Random rnd = new Random();
    Sun s;
    Estate houses = new Estate(120, 250, 120, 150, 500,
            200, 150, Color.RED);
    // Houses h = new Houses(120, 250, 120, 150);
    Road road = new Road();
    Car car = new Car(300, 550, Color.green);
    PoliceCar policeCar = new PoliceCar(700, 550, Color.LIGHT_GRAY);


    public DrawPanel() {
        s = new Sun(100, 100, 40, 50, 15);
        for (int i = 0; i < 5; i++) {
            clouds.add(new Cloud(
                    100 + rnd.nextInt(1000),
                    rnd.nextInt(250)
            ));
        }

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        bckgr.drawBackGround(g);
        s.drawSun(g);
        for (Cloud cloud : clouds) {
            cloud.drawCloud(g);
        }
        road.drawRoad(g);
        car.drawCar(g);
        policeCar.drawCar(g);
        houses.drawEstate(g);

        /*
        Timer timer = new Timer(16, e->{
car.
        });
        */
    }
}
