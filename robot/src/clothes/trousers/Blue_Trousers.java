package src.clothes.trousers;

public class Blue_Trousers implements Trousers{
    @Override
    public void takeOn() {
        System.out.println("Надела голубые брюки");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла голубые брюки");
    }
}
