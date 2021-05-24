package com.company.Lesson_7;

import java.io.*;

//5th task
public class Lists {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bf = new BufferedReader(new FileReader(("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/list/text.txt")));
             BufferedReader bf2 = new BufferedReader(new FileReader(("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/list/blackList.txt")))) {
            String line;
            String secondLine;
            int count = 0;

            while (((line = bf.readLine()) != null) && ((secondLine = bf2.readLine()) != null)) {
                String[] sentences = line.split("[!?.:]+");
                String[] blackWords = secondLine.split(", ");
                for (String sent : sentences) {
                    for (String blackWord : blackWords) {
                        if (sent.contains(blackWord)) {
                            System.out.println(sent + "\nCensor!");
                            count++;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("Everything is Ok with censorship :) Congrats!");
                } else {
                    System.out.println(count);
                }
            }
        }
    }
}




