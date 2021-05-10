package com.company.lesson_5;

import java.util.Scanner;

public class Civil extends AirTransport {
    boolean businessClass;
    int passengerNum;
    public Civil(String model,int maxSpeed, int passengerNum,
                  int power, int weight, int wingspread, int airstripMinLength,
                 boolean businessClass) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.passengerNum = passengerNum;
        this.power = power;
        this.weight = weight;
        this.wingspread = wingspread;
        this.airstripMinLength = airstripMinLength;
        this.businessClass = businessClass;
        this.kWatt();
    }

    @Override
    public void kWatt() {
        super.kWatt();
    }

    public void load() {
        System.out.println("Количество пасссажиров: ");
        Scanner scanner = new Scanner(System.in);
        int currentLoad = scanner.nextInt();
        String loadCheck = (passengerNum > currentLoad) ? "Вместимость самолета не превышена" : "Нет мест";
        System.out.println(loadCheck);
    }

    @Override
    public void description() {
        System.out.println("Марка самолета: " + model
                + "\n" + "Количество посадочных мест: " + passengerNum
                + "\n" + "Масса (кг) : " + weight
                + "\n" + "Максимальная скорость (км/ч) : " + maxSpeed
                + "\n" + "Мощность (л/с): " + power
                + "\n" + "Мощность (кВт/ч): " + kiloWatt
                + "\n" + "Длина ВПП (м): " + airstripMinLength
                + "\n" + "Размах крыла: " + wingspread
                + "\n" + "Наличие бизнес класса: " + businessClass + "\n");
    }
}
