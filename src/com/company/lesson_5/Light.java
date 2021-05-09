package com.company.lesson_5;

public class Light extends GroundTransport {
    private double spentFuel;
    public Light(String bodyStyle, int maxSpeed, double fuelInput, int passengerNumber,
                 String model, int power, int weight, int wheelNumber) {
        this.bodyStyle = bodyStyle;
        this.passengerNumber = passengerNumber;
        this.power = power;
        this.weight = weight;
        this.wheelNumber = wheelNumber;
        this.maxSpeed = maxSpeed;
        this.fuelInput = fuelInput;
        this.model = model;
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

    @Override
    public void distanceCalc() {
        super.distanceCalc();
    }

    @Override
    void load() {
        System.out.println(loadCheck);
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

