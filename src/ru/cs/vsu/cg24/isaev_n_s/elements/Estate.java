package ru.cs.vsu.cg24.isaev_n_s.elements;

import java.awt.*;
import java.util.Random;

public class Estate {
    private int x, currX, y, widthOfHouse, heightOfHouse, yOfRoad, heightOfGarden, widthOfGarden;
    private Color colorOfRoof;

    private AbstractBodyOfHouse bodyOfHouse;
    private AbstractRoof roofType;
    private AbstractGardenType gardenType;

    //конструктор класса
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
        Random rnd = new Random();
         setCurrX(getX());

         class BodyHouseProvider implements  InfoProvider{
             @Override
             public int getX() {
                 return getCurrX();
             }

             @Override
             public int getY() {
                 return getCurrX();
             }

             @Override
             public int getWidth() {
                 return getWidthOfHouse();
             }

             @Override
             public int getHeight() {
                 return getHeightOfHouse();
             }
         }

         BodyHouseProvider bhp = new BodyHouseProvider();
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

        class GardenProvider implements InfoProvider {
            private int delta;

            public GardenProvider(int delta) {
                this.delta = delta;
            }

            @Override
            public int getX() {
                return getCurrX() - delta;
            }

            @Override
            public int getY() {
                return getyOfRoad();
            }

            @Override
            public int getWidth() {
                return getWidthOfGarden() + delta*2;
            }

            @Override
            public int getHeight() {
                return getHeightOfGarden();
            }
        };
        GardenProvider gp = new GardenProvider(100);

        AbstractGardenType[] arrOfGardenTypes = new AbstractGardenType[]{
                new GardenType2(gp),
                new GardenType3(gp),
                new GardenType1(gp)
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

