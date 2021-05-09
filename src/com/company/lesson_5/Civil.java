package com.company.lesson_5;

import java.util.Scanner;

public class Civil extends AirTransport {
    boolean businessClass;
    public Civil(int maxSpeed, double fuelInput, int passengerNumber,
                 String model, int power, int weight, int wheelNumber, int payload,
                 int wingspread, int airstripMinLength, boolean businessClass) {
        this.wingspread = wingspread;
        this.airstripMinLength = airstripMinLength;
        this.passengerNumber = passengerNumber;
        this.power = power;
        this.weight = weight;
        this.wheelNumber = wheelNumber;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelInput = fuelInput;
        this.payload = payload;
        this.businessClass = businessClass;
        this.kWatt();
    }

    @Override
    public void kWatt() {
        super.kWatt();
    }

    @Override
    public void load() {
        System.out.println("Количество пасссажиров: ");
        Scanner scanner = new Scanner(System.in);
        int currentLoad = scanner.nextInt();
        loadCheck = (passengerNumber > currentLoad) ? "Вместимость самолета не превышена" : "Нет мест";
        System.out.println(loadCheck);
    }

    @Override
    public void description() {
        System.out.println("Марка самолета: " + model
                + "\n" + "Количество посадочных мест: " + passengerNumber
                + "\n" + "Количество колес: " + wheelNumber
                + "\n" + "Расход топлива (л/ч) : " + fuelInput
                + "\n" + "Масса (кг) : " + weight
                + "\n" + "Максимальная скорость (км/ч) : " + maxSpeed
                + "\n" + "Мощность (л/с): " + power
                + "\n" + "Мощность (кВт/ч): " + kiloWatt
                + "\n" + "Грузоподъемность (кг): " + payload
                + "\n" + "Длина ВПП (м): " + airstripMinLength
                + "\n" + "Размах крыла: " + wingspread
                + "\n" + "Наличие бизнес класса: " + businessClass + "\n");
    }
}