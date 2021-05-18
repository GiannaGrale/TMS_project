package src.clothes.jackets;

public class Red_Jacket implements Jacket {
    @Override
    public void takeOn() {
        System.out.println("Надела красную куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла красную куртку");

    }
}
