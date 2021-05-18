package src.by.teachmeskills.robot.hands;

public class SamsungHand implements IHand {

    private int price = 1500;
    public SamsungHand (int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Это рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
