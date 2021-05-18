package src.clothes.shoes;

public class Heels implements Shoes{
    @Override
    public void takeOn() {
        System.out.println("Надела туфли на каблуках \n");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла туфли на каблуках \n");
    }
}
