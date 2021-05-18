package src.by.teachmeskills.robot.heads;

public class SamsungHead implements IHead{
    private int price = 2290;

    public SamsungHead (int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
