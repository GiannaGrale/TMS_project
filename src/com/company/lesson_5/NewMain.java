package com.company.lesson_5;

public class NewMain {

    public static void main(String[] args) {
        Light light = new Light("Sedan", 163, 8, 4,
                "Kia", 163, 1141, 4);
        light.description();
        light.time();
        light.distanceCalc();

        System.out.println("За время " + light.time + " ч., автомобиль "
                + light.model + ", двигаясь с максимальной скоростью "
                + light.maxSpeed + " км/ч, проедет "
                + light.distance + " км и израсходует "
                + light.getSpentFuel() + " л. топлива.\n");

        Cargo cargo = new Cargo("Châssis ", 108, 17,
                3, "Mitsubishi Fuso Canter", 180, 8500, 4, 7700);
        cargo.description();
        cargo.load();
        System.out.println("\n");

        Civil civil = new Civil(850, 2600, 349,
                "Boeing 737-800", 110, 42000, 3,
                6400, 34, 2040,true);
        civil.description();
        civil.load();
        System.out.println("\n");

        Military military = new Military(true, 6, 2120,
                4900, 2, "F-16 Fighting Falcon", 1341, 9207,
                3, 16875, 10, 900);
        military.description();
        military.load();
        military.escape();
    }
}










