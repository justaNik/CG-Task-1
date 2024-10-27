package ru.cs.vsu.cg24.isaev_n_s;

import ru.cs.vsu.cg24.isaev_n_s.elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class DrawPanel extends JPanel {
    private BackGround bckgr = new BackGround();
    private final List<Cloud> clouds = new ArrayList<>();
    private static final Random rnd = new Random();
    private Sun sun;
    private List<Estate> houses;
    private Road road;
    private Car car;
    private PoliceCar policeCar;


    public DrawPanel() {

        car = new Car(300, 550, Color.green);
        policeCar = new PoliceCar(700, 550, Color.LIGHT_GRAY);
        sun = new Sun(100, 100, 40, 50, 15);
        houses = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            houses.add(new Estate(150 + i * 450, 250, 120, 150, 500,
                    200, 150, Color.red));
        }

        road = new Road();

        for (int i = 0; i < 5; i++) {
            clouds.add(new Cloud(
                    100 + rnd.nextInt(1000),
                    rnd.nextInt(250)
            ));
        }

        Timer timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.moveCar();
                policeCar.moveCar();
                for (Estate h : houses)
                    h.setX(h.getX() + 1);
                repaint();
            }
        });
        timer.start();  // Запускаем таймер


    }

    @Override
    protected void paintComponent(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        super.paintComponent(g);

        bckgr.drawBackGround(g);
        sun.drawSun(g);
        for (Cloud cloud : clouds) {
            cloud.drawCloud(g);
        }

        // Рисуем дома и дорогу
        road.drawRoad(g);

        for (Estate h : houses) {
            h.drawEstate(g);
        }
        car.drawCar(g);
        policeCar.drawCar(g);
    }

   /* @Override
    public void paint(Graphics gr) {

        super.paint(g);


        bckgr.drawBackGround(g);
        sun.drawSun(g);
        for (Cloud cloud : clouds) {
            cloud.drawCloud(g);
        }
        road.drawRoad(g);
        houses.drawEstate(g);
        car.drawCar(g);
        policeCar.drawCar(g);
    }
    */
}
