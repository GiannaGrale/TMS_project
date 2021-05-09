package com.company.lesson_5;

public class Military extends AirTransport {
    boolean assistedEscapeSystem;
    int missile;
    public Military(boolean assistedEscapeSystem, int missile, int maxSpeed,
                    double fuelInput, int passengerNumber, String model,
                    int power, int weight, int wheelNumber, int payload,
                    int wingspread, int airstripMinLength) {
        this.assistedEscapeSystem = assistedEscapeSystem;
        this.missile = missile;
        this.passengerNumber = passengerNumber;
        this.power = power;
        this.weight = weight;
        this.wheelNumber = wheelNumber;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelInput = fuelInput;
        this.payload = payload;
        this.airstripMinLength = airstripMinLength;
        this.wingspread = wingspread;
        this.kWatt();
    }

    @Override
    public void load() {
        String loadCheck = missile != 0 ? "Ракета пошла!" : "Боеприпасы отсутсвуют";
        System.out.println(loadCheck);
    }

    public void escape() {
        String assistedEscapeSystemCheck = assistedEscapeSystem ? "Катапультирование прошло успешно." : "У вас нет такой системы.";
        System.out.println(assistedEscapeSystemCheck);
    }

    @Override
    public void description() {
        System.out.println("Модель истребителя: " + model
                + "\n" + "Количество мест: " + passengerNumber
                + "\n" + "Количество колес: " + wheelNumber
                + "\n" + "Расход топлива (л/100км) : " + fuelInput
                + "\n" + "Масса (кг) : " + weight
                + "\n" + "Максимальная скорость (км/ч) : " + maxSpeed
                + "\n" + "Мощность (л/с): " + power
                + "\n" + "Мощность (кВт/ч): " + kiloWatt
                + "\n" + "Грузоподъемность (кг): " + payload
                + "\n" + "Длина ВПП (м): " + airstripMinLength
                + "\n" + "Размах крыла: " + wingspread
                + "\n" + "Наличие системы катапультрования: " + assistedEscapeSystem
                + "\n" + "Количество ракет на борту: " + missile+ "\n");
    }
}
