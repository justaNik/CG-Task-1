package ru.cs.vsu.cg24.isaev_n_s;

import ru.cs.vsu.cg24.isaev_n_s.elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {
    BackGround bckgr = new BackGround();
    private final java.util.List<Cloud> clouds = new ArrayList<>();
    Random rnd = new Random();
    Sun sun;
    Estate houses;
    // Houses h = new Houses(120, 250, 120, 150);
    Road road;
    Car car;
    PoliceCar policeCar;


    public DrawPanel() {
        // Создаем и запускаем таймер для анимации


        car = new Car(300, 550, Color.green);
        policeCar = new PoliceCar(700, 550, Color.LIGHT_GRAY);
        sun = new Sun(100, 100, 40, 50, 15);
        houses = new Estate(120, 250, 120, 150, 500,
                200, 150, Color.RED);
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
                moveCar();  // Двигаем машину
                repaint();  // Перерисовываем экран
            }
        });
        timer.start();  // Запускаем таймер


    }

    // Метод для перемещения машины
    private void moveCar() {
        car.setX(car.getX() - 6);  // Двигаем машину влево
        policeCar.setX(policeCar.getX() - 5);

        // Если машина выходит за левый край, возвращаем ее на правый
        if (car.getX() + car.getWidth() < 0 && policeCar.getX() + policeCar.getWidth() < 0) {
            car.setX(1410);  // Возвращаем на правый край
            policeCar.setX(1810);  // Возвращаем на правый край
        }
    }

    private BufferedImage background;

    @Override
    protected void paintComponent(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        super.paintComponent(g);

        bckgr.drawBackGround(g);
        sun.drawSun(g);
        for (Cloud cloud : clouds) {
            cloud.drawCloud(g);
        }

        // Проверяем, существует ли уже буфер для фона
        if (background == null) {
            background = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bg = background.createGraphics();


            // Отрисовываем дорогу и дома один раз

            road.drawRoad(bg);
            houses.drawEstate(bg);
            bg.dispose();
        }

        // Рисуем дома и дорогу
        g.drawImage(background, 0, 0, this);
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
