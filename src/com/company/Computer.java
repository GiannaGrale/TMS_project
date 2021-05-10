package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String CPU;
    private String RAM;
    private String SSD;
    private final int resource;
    boolean on = false;
    int counter = 0;
    boolean condition = true;

    public Computer(String RAM, String SSD, String CPU, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.resource = resource;

    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getCPU() {
        return CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getSSD() {
        return SSD;
    }

    public int getResource() {
        return resource;
    }

    public void description() {
        System.out.println("У нас есть ПК с процессором " + getSSD() + ", "
                + "с оперативой " + getRAM() + " " + "и жестким диском " + getSSD() +
                ".\nРесурс полных циклов работы равен " + getResource());

    }

    void turnON_OFF() {

        if (!condition) {
            System.out.println("Невозможно вкючить компьютер, сгорел");
        } else {
            System.out.println("Введите 0 или 1: ");
            Random random = new Random();
            int guess = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            int temp = scanner.nextInt();

            if (guess == temp & !on) {
                System.out.println("Компьютер включается");
                on = true;
            } else {
                System.out.println("Компьютер сгорел");
                condition = false;
            }

            if (on) {
                System.out.println("Введите 0 или 1: ");
                Random console = new Random();
                int newGuess = console.nextInt(2);
                Scanner scanner1 = new Scanner(System.in);
                int count = scanner1.nextInt();

                if (newGuess == count) {
                    System.out.println("Компьютер выключается");
                    counter++;
                    System.out.println("Счетчик: " + counter);
                    on = false;
                } else {
                    System.out.println("Компьютер сгорел");
                    condition = false;

                }

            }

            if (counter >= resource) {
                System.out.println("Ресурс превышен, компьютер сгорел");
                condition = false;
            }
        }
            while (!on) {
            if (condition) {
                turnON_OFF();

            }
        }

    }
}
