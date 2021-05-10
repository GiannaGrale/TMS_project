package com.company.lesson_5;

import java.util.Scanner;

public class Light extends GroundTransport {
    private double spentFuel;
    int passengerNumber;
    String bodyStyle;
    public Light(String bodyStyle, int maxSpeed, double fuelInput, int passengerNumber,
                 String model, int power, int weight, int wheelNumber) {
        this.bodyStyle = bodyStyle;
        this.maxSpeed = maxSpeed;
        this.fuelInput = fuelInput;
        this.passengerNumber = passengerNumber;
        this.model = model;
        this.power = power;
        this.weight = weight;
        this.wheelNumber = wheelNumber;
        this.kWatt();
    }

    public void setSpentFuel(double spentFuel) {
        this.spentFuel = spentFuel;
    }

    public double getSpentFuel() {
        return spentFuel = (fuelInput * distance) / 100;
    }

    private double actualSpentFuel() {
        return spentFuel;
    }

    @Override
    public void kWatt() {
        super.kWatt();
    }

    int time;
    public void time() {
        Scanner console = new Scanner(System.in);
        time = console.nextInt();
    }

    double distance;
    public void distanceCalc() {
        distance = time * maxSpeed;
    }


    @Override
    public void description() {
        System.out.println("Марка машины: " + model
                + "\n" + "Количество посадочных мест: " + passengerNumber
                + "\n" + "Тип кузова: " + bodyStyle
                + "\n" + "Количество колес: " + wheelNumber
                + "\n" + "Расход топлива (л/100км) : " + fuelInput
                + "\n" + "Масса (кг) : " + weight
                + "\n" + "Максимальная скорость (км/ч) : " + maxSpeed
                + "\n" + "Мощность (л/с): " + power
                + "\n" + "Мощность (кВт/ч): " + kiloWatt + "\n");
    }

}


