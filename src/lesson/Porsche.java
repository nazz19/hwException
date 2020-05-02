package lesson;

public class Porsche extends Automobile {


    public Porsche(String name, int price, int speed, int year, int height, int width, int length) {
        super(name, price, speed, year, height, width, length);
    }

    public void priceOfAutomobile() {
        System.out.println("Price of Porsche:" + getPrice());
    }
}
