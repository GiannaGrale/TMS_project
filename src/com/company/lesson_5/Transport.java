package com.company.lesson_5;

import java.util.Scanner;

public abstract class Transport {
    String model;
    String loadCheck;
    protected int passengerNumber;
    protected int wheelNumber;
    protected double fuelInput;
    protected int payload;
    int power;
    int maxSpeed;
    int weight;
    int time;
    double kiloWatt;
    double distance;

    abstract void description();

    abstract void load ();

    public void time() {
        Scanner console = new Scanner(System.in);
        time = console.nextInt();
    }

    public void kWatt() {
        kiloWatt = power * 0.74;
    }

    public void distanceCalc() {
        distance = time * maxSpeed;
    }

}