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

    int time;

    int getTime() {
        Scanner console = new Scanner(System.in);
        time = console.nextInt();
        return time;
    }

    double distance;

    double getDistance() {
        distance = time * maxSpeed;
        return distance;

    }

    @Override
    void description() {
        super.description();
        System.out.println("Количество посадочных мест: " + passengerNumber
                + "\n" + "Тип кузова: " + bodyStyle
                + "\n" + "Количество колес: " + wheelNumber
                + "\n" + "Расход топлива (л/100км) : " + fuelInput);

        System.out.println("За время " + getTime() + " ч., автомобиль "
                + model + ", двигаясь с максимальной скоростью "
                + maxSpeed + " км/ч, проедет "
                + getDistance() + " км и израсходует "
                + getSpentFuel() + " л. топлива.\n");
    }
}




