package com.company.lesson_5;

public abstract class Transport {

    int power;
    int maxSpeed;
    int weight;
    String model;

    abstract void description();

    double kiloWatt;
    public void kWatt() {
       kiloWatt = power * 0.74;
    }
}
