package src.clothes.shoes;

public class Converse implements Shoes{
    @Override
    public void takeOn() {
        System.out.println("Надела конверсы \n");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла конверсы \n");
    }
}
