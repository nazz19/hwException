package lesson;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        BMW bmw = new BMW("BMW", 15000, 25600, 1999, 6000, 2000, 2500);
        Mercedes mercedes = new Mercedes("Mercedes", 205555, 120555, 2010, 6000, 2000, 1500);
        Porsche porsche = new Porsche("Porsche", 1450000, 145000, 2020, 8800, 3000, 3300);
        Porsche porsche1 = new Porsche("Porsche", 1450000, 145000, 2020, 4000, 3000, 500);
        System.out.println("In Stock Automobiles: ");
        try {
            shop.addAutomobile(bmw);
            shop.addAutomobile(mercedes);
            shop.addAutomobile(porsche1);
            shop.addAutomobile(bmw);
            shop.addAutomobile(porsche);
            shop.addAutomobile(bmw);
        } catch (OutOfFreePlaceException e) {
            System.out.println("Couldn`t add new automobile.");
        } catch (TooBigCarException e) {
            System.out.println("The car that you want to add is too big.");

        }

        shop.inStockAuto();

    }
}
