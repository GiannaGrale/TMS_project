package src.space;

import java.util.Random;

public class Proton implements IStart {

    @Override
    public boolean startSystem() {
        Random random = new Random();
        int guess = random.nextInt(3);
        if (guess == 1) {
            System.out.println("Проверка провалена :)");
            return true;
        } else {
            System.out.println("Проверка прошла успешно :(");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Proton запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Proton. \n");

    }
}

