package com.company.lesson_5;

public class Military extends AirTransport {
    boolean assistedEscapeSystem;
    int missile;

    public Military(String model, boolean assistedEscapeSystem, int missile,
                    int maxSpeed, int power, int weight,
                    int wingspread, int airstripMinLength) {
        this.model = model;
        this.assistedEscapeSystem = assistedEscapeSystem;
        this.maxSpeed = maxSpeed;
        this.missile = missile;
        this.power = power;
        this.weight = weight;
        this.wingspread = wingspread;
        this.airstripMinLength = airstripMinLength;
        this.kWatt();
    }

    public void missileShot() {
        String loadCheck = missile != 0 ? "Ракета пошла!" : "Боеприпасы отсутсвуют";
        System.out.println(loadCheck);
    }

    public void escape() {
        String assistedEscapeSystemCheck = assistedEscapeSystem ? "Катапультирование прошло успешно." : "У вас нет такой системы.";
        System.out.println(assistedEscapeSystemCheck);
    }

    @Override
    void description() {
        super.description();
        System.out.println("Длина ВПП (м): " + airstripMinLength
                + "\n" + "Размах крыла: " + wingspread
                + "\n" + "Наличие системы катапультрования: " + assistedEscapeSystem
                + "\n" + "Количество ракет на борту: " + missile + "\n");
    }
}

