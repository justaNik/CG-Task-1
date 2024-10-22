package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;
import java.util.Random;
//ЭТОТ КЛАСС ДОЛЖЕН ОТВЕЧАТЬ ЗА СОЗДАНИЕ ОДНОЙ УСАДЬБЫ, А В ЦИКЛЕ В DRAWPANEL ОНИ ДОЛЖНЫ УЖЕ ОТРИСОВЫВАТЬСЯ, ПРИНЦИП ТАКОЙ ЖЕ
//КАК И С ОБЛАКАМИ
public class Estate {
    private int x, currX, y, widthOfHouse, heightOfHouse, yOfRoad, heightOfGarden, widthOfGarden;
    private Color colorOfRoof;

    private AbstractBodyOfHouse bodyOfHouse;
    private AbstractRoof roofType;
    private AbstractGardenType gardenType;

    //на кой хрен сюда передается экземпляр AbstractRoof?
    public Estate(int x, int y, int widthOfHouse, int heightOfHouse,
                  int yOfRoad, int heightOfGarden, int widthOfGarden, Color colorOfRoof) {
        this.x = x;
        this.y = y;
        this.widthOfHouse = widthOfHouse;
        this.heightOfHouse = heightOfHouse;
        this.yOfRoad = yOfRoad;
        this.heightOfGarden = heightOfGarden;
        this.widthOfGarden = widthOfGarden;
        this.colorOfRoof = colorOfRoof;
       // this.roofType = ar;
        //массивы с крышами, усадьбами, домами должны создаваться здесь, и этот
        //этот класс создает один экземпляр дома, те, в DrawPanel их должно быть 3

        Random rnd = new Random();
         setCurrX(getX());

        AbstractBodyOfHouse[] arrOfBodyHouseTypes = new AbstractBodyOfHouse[]{

                new BodyOfHouseType2(getCurrX(), getY(), getWidthOfHouse(), getHeightOfHouse()),
                new BodyOfHouseType1(getCurrX(), getY(), getWidthOfHouse(), getHeightOfHouse()),
                new BodyOfHouseType3WithDoor(getCurrX(), getY(), getWidthOfHouse(), getHeightOfHouse())
        };

        AbstractRoof[] arrOfRoofTypes = new AbstractRoof[]{
                new RoofType1(),
                new RoofType2(),
                new RoofType3(),
        };

        AbstractGardenType[] arrOfGardenTypes = new AbstractGardenType[]{
                new GardenType2(getCurrX(), getyOfRoad(), getWidthOfGarden(), getHeightOfGarden()),
                new GardenType3(getCurrX(), getyOfRoad(), getWidthOfGarden(), getHeightOfGarden()),
                new GardenType1(getCurrX(), getyOfRoad(), getWidthOfGarden(), getHeightOfGarden())
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

    public int getCurrX() {
        return currX;
    }

    public void setCurrX(int currX) {
        this.currX = currX;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidthOfHouse() {
        return widthOfHouse;
    }

    public void setWidthOfHouse(int widthOfHouse) {
        this.widthOfHouse = widthOfHouse;
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

    public int getWidthOfGarden() {
        return widthOfGarden;
    }

    public void setWidthOfGarden(int widthOfGarden) {
        this.widthOfGarden = widthOfGarden;
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

        getGardenType().draw(g);
        getBodyOfHouse().draw(g);
        getRoofType().draw(g, getCurrX(), getY(), getWidthOfHouse(), getHeightOfHouse(), getColorOfRoof());
    }
}

