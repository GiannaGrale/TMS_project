package com.company.Lesson_7;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        Streams.formatText();
        Streams.writeSentences();

        Auto auto = new Auto("Volvo", 180.5, 3000);
        Serializator serializator = new Serializator();
        serializator.serialization(auto);
        serializator.deserialization();
        System.out.println(auto.getBrand());
        System.out.println(auto.getPrice());
        System.out.println(auto.getSpeed());
    }
}