package src.space;

import java.util.Random;

public class SpaceX implements IStart{

    @Override
    public boolean startSystem() {
        Random random = new Random();
        boolean guess = random.nextBoolean();
        if (guess) {
            System.out.println("Проверка прошла успешно :)");
            return true;
        } else {
            System.out.println("Проверка провалена :(");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Falcon9 запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Falcon9. \n");

    }
}
