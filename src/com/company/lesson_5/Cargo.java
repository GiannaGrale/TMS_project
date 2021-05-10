package com.company.lesson_5;

import java.util.Scanner;

public class Cargo extends GroundTransport {
    int payload;
    public Cargo(int maxSpeed, double fuelInput, String model,
                 int power, int weight, int wheelNumber, int payload) {
        this.power = power;
        this.weight = weight;
        this.wheelNumber = wheelNumber;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelInput = fuelInput;
        this.payload = payload;
        this.kWatt();
    }

    public void load() {
        System.out.println("Введите ваш груз в кг.");
        Scanner scanner = new Scanner(System.in);
        int currentLoad = scanner.nextInt();
        String loadCheck = (payload > currentLoad) ? "Грузовик загружен" : "Вам нужен грузовик побольше";
        System.out.println(loadCheck);
    }

    @Override
    public void kWatt() {
        super.kWatt();
    }

    @Override
    public void description() {
        System.out.println("Марка машины: " + model
                + "\n" + "Количество колес: " + wheelNumber
                + "\n" + "Расход топлива (л/100км) : " + fuelInput
                + "\n" + "Масса (кг) : " + weight
                + "\n" + "Максимальная скорость (км/ч) : " + maxSpeed
                + "\n" + "Мощность (л/с): " + power
                + "\n" + "Мощность (кВт/ч): " + kiloWatt
                + "\n" + "Грузоподъемность (кг): " + payload +"\n");
    }
}
