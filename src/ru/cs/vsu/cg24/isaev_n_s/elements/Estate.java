package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;
import java.util.Random;
//ЭТОТ КЛАСС ДОЛЖЕН ОТВЕЧАТЬ ЗА СОЗДАНИЕ ОДНОЙ УСАДЬБЫ, А В ЦИКЛЕ В DRAWPANEL ОНИ ДОЛЖНЫ УЖЕ ОТРИСОВЫВАТЬСЯ, ПРИНЦИП ТАКОЙ ЖЕ
//КАК И С ОБЛАКАМИ
public class Estate {
    private int x, y, widtOfHouse, heightOfHouse, yOfRoad, heightOfGarden, widthOfGatden;
    private Color colorOfRoof;

    private AbstractBodyOfHouse bodyOfHouse;
    private AbstractRoof roofType;
    private AbstractGardenType gardenType;

    //на кой хрен сюда передается экземпляр AbstractRoof?
    public Estate(int x, int y, AbstractRoof ar, int widtOfHouse, int heightOfHouse,
                  int yOfRoad, int heightOfGarden, int widthOfGatden, Color colorOfRoof) {
        this.x = x;
        this.y = y;
        this.widtOfHouse = widtOfHouse;
        this.heightOfHouse = heightOfHouse;
        this.yOfRoad = yOfRoad;
        this.heightOfGarden = heightOfGarden;
        this.widthOfGatden = widthOfGatden;
        this.colorOfRoof = colorOfRoof;
        this.roofType = ar;
        //массивы с крышами, усадьбами, домами должны создаваться здесь, и этот
        //этот класс создает один экземпляр дома, те, в DrawPanel их должно быть 3

        Random rnd = new Random();
        int currX = getX();

        AbstractBodyOfHouse[] arrOfBodyHouseTypes = new AbstractBodyOfHouse[]{

                new BodyOfHouseType2(currX, getY(), getWidtOfHouse(), getHeightOfHouse()),
                new BodyOfHouseType1(currX, getY(), getWidtOfHouse(), getHeightOfHouse()),
                new BodyOfHouseType3WithDoor(currX, getY(), getWidtOfHouse(), getHeightOfHouse())
        };

        AbstractRoof[] arrOfRoofTypes = new AbstractRoof[]{
                new RoofType1(),
                new RoofType2(),
                new RoofType3(),
        };

        AbstractGardenType[] arrOfGardenTypes = new AbstractGardenType[]{
                new GardenType2(currX, getyOfRoad(), getWidthOfGatden(), getHeightOfGarden()),
                new GardenType3(currX, getyOfRoad(), getWidthOfGatden(), getHeightOfGarden()),
                new GardenType1(currX, getyOfRoad(), getWidthOfGatden(), getHeightOfGarden())
        };


        setBodyOfHouse(arrOfBodyHouseTypes[rnd.nextInt(3)]);
        setRoofType(arrOfRoofTypes[rnd.nextInt(3)]);
        setGardenType(arrOfGardenTypes[rnd.nextInt(3)]);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        //getRoofType().setX(x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidtOfHouse() {
        return widtOfHouse;
    }

    public void setWidtOfHouse(int widtOfHouse) {
        this.widtOfHouse = widtOfHouse;
    }

    public int getHeightOfHouse() {
        return heightOfHouse;
    }

    public void setHeightOfHouse(int heightOfHouse) {
        this.heightOfHouse = heightOfHouse;
    }

    public int getyOfRoad() {
        return yOfRoad;
    }

    public void setyOfRoad(int yOfRoad) {
        this.yOfRoad = yOfRoad;
    }

    public Color getColorOfRoof() {
        return colorOfRoof;
    }

    public void setColorOfRoof(Color colorOfRoof) {
        this.colorOfRoof = colorOfRoof;
    }

    public int getHeightOfGarden() {
        return heightOfGarden;
    }

    public void setHeightOfGarden(int heightOfGarden) {
        this.heightOfGarden = heightOfGarden;
    }

    public int getWidthOfGatden() {
        return widthOfGatden;
    }

    public void setWidthOfGatden(int widthOfGatden) {
        this.widthOfGatden = widthOfGatden;
    }

    public AbstractBodyOfHouse getBodyOfHouse() {
        return bodyOfHouse;
    }

    public void setBodyOfHouse(AbstractBodyOfHouse bodyOfHouse) {
        this.bodyOfHouse = bodyOfHouse;
    }

    public AbstractRoof getRoofType() {
        return roofType;
    }

    public void setRoofType(AbstractRoof roofType) {
        this.roofType = roofType;
    }

    public AbstractGardenType getGardenType() {
        return gardenType;
    }

    public void setGardenType(AbstractGardenType gardenType) {
        this.gardenType = gardenType;
    }

    public void drawEstate(Graphics2D g) {


           /* getGardenType().drawFrontGarden(g);
            getBodyOfHouse().draw(g);
            getRoofType().draw(g);

            g.setColor(Color.BLACK);
            g.drawLine(getX(), getY(), getX() + getWidtOfHouse(), getY() + getHeightOfHouse());

            */

    }
}

