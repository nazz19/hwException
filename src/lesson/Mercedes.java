package lesson;

public class Mercedes extends Automobile {


    public Mercedes(String name, int price, int speed, int year, int height, int width, int length) {
        super(name, price, speed, year, height, width, length);
    }

    public void priceOfAutomobile() {
        System.out.println("Price of Mercedes:" + getPrice());
    }
}
