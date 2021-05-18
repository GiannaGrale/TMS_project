package src.clothes.jackets;

public class  Blue_Jacket implements Jacket {
    @Override
    public void takeOn() {
        System.out.println("Надела голубую куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняла голубую куртку");

    }
}
