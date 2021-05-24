package src.clothes.shoes;

public class Boots implements  Shoes{
    @Override
    public void takeOn() {
        System.out.println("Надела сапоги \n");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла сапоги \n");

    }
}
