package src.by.teachmeskills.robot.legs;

public class ToshibaLeg implements  ILeg{
    private int price;

    public ToshibaLeg (int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Это нога Toshiba \n");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
