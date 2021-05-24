package com.company.Lesson_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FormatterRun {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/formatter/formatFile.txt"));
             FileWriter writer = new FileWriter("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/formatter/writeFormat.txt"))
           {
            String sentences;
            while ((sentences = reader.readLine()) != null) {
               String [] s = sentences.split("[!?. :]+");
                int count = TextFormatter.wordCount(sentences);
                for (String word : s) {
                    if ((count >= 3 & count <= 5) | TextFormatter.isBool(word)) {
                        writer.write(sentences + "\n");
                        break;
                    }
                }
            }
        }
    }
}