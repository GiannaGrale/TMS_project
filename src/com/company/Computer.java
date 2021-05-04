package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String CPU;
    private String RAM;
    private String SSD;
    private static int resource;
    public static boolean on = false;
    public static int counter = 0;
    public static boolean condition = true;

    public Computer(String RAM, String SSD, String CPU, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        Computer.resource = resource;

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


    static void turnON() {

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
        }
    }

    static void turnOFF() {

        if (on) {
            System.out.println("Введите 0 или 1: ");
            Random random = new Random();
            int newGuess = random.nextInt(2);
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
    }
        static void limCount() {

            if (counter >= resource){
                System.out.println("Ресурс превышен, компьютер сгорел");
                condition = false;
            }
        }
    }


