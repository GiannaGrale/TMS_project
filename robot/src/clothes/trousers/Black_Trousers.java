package src.clothes.trousers;

public class Black_Trousers implements Trousers{
    @Override
    public void takeOn() {
        System.out.println("Надела черные брюки");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла черные брюки");
    }
}
