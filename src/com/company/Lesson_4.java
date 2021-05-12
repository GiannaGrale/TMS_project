package com.company;

public class Lesson_4 {

    public static void main() {
        Computer PC = new Computer("Intel(R) Pentium CPU 5405U @ 2.30 CHz",
                "DDR4", "PCI-Express", 10);
        String CPU = PC.getCPU();
        String RAM = PC.getRAM();
        String SSD = PC.getSSD();
        int resource = PC.getResource();
        PC.description();
        PC.turnON_OFF();
    }
}