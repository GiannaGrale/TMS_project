package src.clothes.jackets;

public class Black_Jacket implements Jacket {
    @Override
    public void takeOn() {
        System.out.println("Надела черную куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла черную куртку");
    }
}
