package com.company.Lesson_7;

// 1st & 2d tasks
public class Strings {
    public static void main(String[] args) {
        // substring cutout
        String firstString = "Spring is hot";
        System.out.println(firstString.subSequence(10, 13)); //hot
        System.out.println(firstString.substring(0, 6)); //Spring

        // below are two methods of the 3rd char replacement in the whole string
        System.out.println(firstString.replace("i", "S")); //SprSng Ss hot
        System.out.println(firstString.replace(firstString.charAt(3), 'S')); //SprSng Ss hot

        // the replacement only for the 3rd char in the string
        char[] chars = firstString.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'i') {
                chars[i] = 'S';
                break;
            }
        }
        String newString = new String(chars);
        System.out.println(newString); //SprSng is hot
    }
}