package src.clothes.trousers;

public class Red_Trousers implements  Trousers{
    @Override
    public void takeOn() {
        System.out.println("Надела красные брюки");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла красные брюки");
    }
}
