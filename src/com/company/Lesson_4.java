package com.company;

import static com.company.Computer.*;

public class Lesson_4 {

    public static void main() {
        Computer myComp = new Computer("Intel(R) Pentium CPU 5405U @ 2.30 CHz", "DDR4", "PCI-Express", 10);
        String CPU = myComp.getCPU();
        String RAM = myComp.getRAM();
        String SSD = myComp.getSSD();
        int resource = myComp.getResource();



        System.out.println("У нас есть компьютер с процессором " + myComp.getCPU() + "  ");
        System.out.println("У нас есть компьютер с оперативой " + myComp.getRAM() + " ");
        System.out.println("У нас есть компьютер с жестким диском " + myComp.getSSD() + " ");
        System.out.println("Ресурс полных циклов работы равен " + myComp.getResource() + " ");



        while (!on) {
            if(condition) {

                Computer.turnON();   // бесконечный метод
                Computer.turnOFF();
                Computer.limCount();
            }
        }

    }
}
