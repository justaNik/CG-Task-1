package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;
import java.util.Random;

public class Estate {
    private int x, y, widtOfHouse, heightOfHouse, yOfRoad, heightOfGarden, widthOfGatden;
    private Color colorOfRoof;

    private BodyOfHouseType1 bodyOfHouse;
    private RoofType1 roofType;
    private GardenType3 gardenType;

    public Estate(int x, int y, int widtOfHouse, int heightOfHouse, int yOfRoad, int heightOfGarden, int widthOfGatden, Color colorOfRoof) {
        this.x = x;
        this.y = y;
        this.widtOfHouse = widtOfHouse;
        this.heightOfHouse = heightOfHouse;
        this.yOfRoad = yOfRoad;
        this.heightOfGarden = heightOfGarden;
        this.widthOfGatden = widthOfGatden;
        this.colorOfRoof = colorOfRoof;
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

    public BodyOfHouseType1 getBodyOfHouse() {
        return bodyOfHouse;
    }

    public void setBodyOfHouse(BodyOfHouseType1 bodyOfHouse) {
        this.bodyOfHouse = bodyOfHouse;
    }

    public RoofType1 getRoofType() {
        return roofType;
    }

    public void setRoofType(RoofType1 roofType) {
        this.roofType = roofType;
    }

    public GardenType3 getGardenType() {
        return gardenType;
    }

    public void setGardenType(GardenType3 gardenType) {
        this.gardenType = gardenType;
    }

    public void drawEstate(Graphics2D g) {
        Random rnd = new Random();
        final int deltaX = 450;
        int currX = getX();
        for (int i = 0; i < 3; i++) {
            BodyOfHouseType1[] arrOfBodyHouseTypes = new BodyOfHouseType1[]{
                    new BodyOfHouseType1(currX, getY(), getWidtOfHouse(), getHeightOfHouse()),
                    new BodyOfHouseType2(currX, getY(), getWidtOfHouse(), getHeightOfHouse()),
                    new BodyOfHouseType3WithDoor(currX, getY(), getWidtOfHouse(), getHeightOfHouse())
            };

            RoofType1[] arrOfRoofTypes = new RoofType1[]{
                    new RoofType1(currX, getY(), getWidtOfHouse(), getHeightOfHouse(), getColorOfRoof()),
                    new RoofType2(currX, getY(), getWidtOfHouse(), getHeightOfHouse(), getColorOfRoof()),
                    new RoofType3(currX, getY(), getWidtOfHouse(), getHeightOfHouse(), getColorOfRoof()),
            };

            GardenType3[] arrOfGardenTypes = new GardenType3[]{
                    new GardenType3(currX, getyOfRoad(), getWidthOfGatden(), getHeightOfGarden()),
                    new GardenType2(currX, getyOfRoad(), getWidthOfGatden(), getHeightOfGarden()),
                    new GardenType1(currX, getyOfRoad(), getWidthOfGatden(), getHeightOfGarden())
            };

            setBodyOfHouse(arrOfBodyHouseTypes[rnd.nextInt(2)]);
            setRoofType(arrOfRoofTypes[rnd.nextInt(2)]);
            setGardenType(arrOfGardenTypes[rnd.nextInt(2)]);

            getGardenType().drawFrontGarden(g);
            getBodyOfHouse().drawBody(g);
            getRoofType().draw(g);


            currX += deltaX;
        }
         currX = getX();


    }
}

