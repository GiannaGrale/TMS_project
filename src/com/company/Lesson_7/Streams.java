package com.company.Lesson_7;

import java.io.*;
// 3rd & 4th tasks
public class Streams {
    public static void formatText() {
        try (FileWriter writer = new FileWriter("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/directory/copiedFile.txt");
             BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/directory/firstFile.txt"))) {
             String line;
            while ((line = reader.readLine()) != null) {
                if (TextFormatter.isBool(line.toLowerCase())) {
                    writer.write(line + "\n");
                }
            }

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void writeSentences() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/folder/readFile.txt"));
             FileWriter writer = new FileWriter("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/folder/writeFile.txt"))
        {
            String manySentences;
            while ((manySentences = reader.readLine()) != null) {
                String[] sentences = manySentences.split("[!?.:]+");
                for (String subSent : sentences) {
                    int count = subSent.split(". ").length;
                    String[] arrSplit = subSent.trim().split("[, ]+");
                    for (String word : arrSplit) {
                        if ((count >= 3 & count <= 5) || TextFormatter.isBool(word)) {
                            writer.write(subSent.trim() + "\n");
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}