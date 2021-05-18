package src.space;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean startSystem() {
        Random random = new Random();
        int guess = random.nextInt();
        if (guess > 3) {
            System.out.println("Проверка прошла успешно :)");
            return true;
        } else {
            System.out.println("Проверка провалена :(");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла. \n");

    }
}
