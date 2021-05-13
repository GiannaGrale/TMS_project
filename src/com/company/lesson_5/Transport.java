package com.company.lesson_5;

public abstract class Transport {

    int power;
    int maxSpeed;
    int weight;
    String model;

    double kWatt() {
        return power * 0.74;
    }

    void description() {
        System.out.println("Марка: " + model
                + "\n" + "Максимальная скорость (км/ч) : " + maxSpeed
                + "\n" + "Масса (кг) : " + weight
                + "\n" + "Мощность (л/с): " + power
                + "\n" + "Мощность (кВт/ч): " + kWatt());
    }
}
