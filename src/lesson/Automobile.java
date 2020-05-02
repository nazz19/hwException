package lesson;

import java.util.ArrayList;
import java.util.List;

public abstract class Automobile {
    private String name;
    private int price;
    private int speed;
    private int year, height, width, length;


    public Automobile(String name, int price, int speed, int year, int height, int width, int length) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void priceOfAutomobile() {
        System.out.println("Automobiles");
    }

    ;
}
