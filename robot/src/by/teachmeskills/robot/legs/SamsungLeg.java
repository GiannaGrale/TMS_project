package src.by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg{
    private int price = 1300;

    public SamsungLeg (int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Это нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
