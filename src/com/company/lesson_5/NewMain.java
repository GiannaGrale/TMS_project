package com.company.lesson_5;

public class NewMain {

    public static void main(String[] args) {
        Light light = new Light("Sedan", 163, 8, 4,
                "Kia", 108, 1141, 4);
        light.description();
        light.time();
        light.distanceCalc();

        System.out.println("За время " + light.time + " ч., автомобиль "
                + light.model + ", двигаясь с максимальной скоростью "
                + light.maxSpeed + " км/ч, проедет "
                + light.distance + " км и израсходует "
                + light.getSpentFuel() + " л. топлива.\n");

        Cargo cargo = new Cargo(180, 108, "Mitsubishi Fuso Canter",180,
                8500, 3,7700);
        cargo.description();
        cargo.load();
        System.out.println("\n");

        Civil civil = new Civil("Boeing 737-800", 800,350, 3100 ,41400 ,
                34, 2000, true);
        civil.description();
        civil.load();
        System.out.println("\n");

        Military military = new Military("F-16 Fighting Falcon", true, 6,
                1214, 1200 , 9201, 10,900);
        military.description();
        military.missileShot();
        military.escape();
    }
}
