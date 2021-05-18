package src.by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price = 1500;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Это нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
