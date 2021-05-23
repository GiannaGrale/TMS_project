package com.company.Lesson_7;

import java.io.*;

class Auto implements Serializable {

    private String brand;
    private double speed;
    private int price;

    public Auto(String brand, double speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }
}


