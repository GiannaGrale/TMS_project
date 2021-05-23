package com.company.Lesson_7;

// 4.1 task in OOP style
public class TextFormatter {
    public static int wordCount(String text) {
        int count = 0;
        if (text.length() != 0) {
            count++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean isBool(String line) {
        String reversedString = new StringBuffer(line).reverse().toString();
        return line.equals(reversedString);
    }
}

