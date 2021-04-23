package com.company;

import java.util.Scanner;

public class Lesson_2 {

    public static void task_1() {
  /* 000 = 0 (умножение каждого нуля на 2 в степени все равно вернет 0)
     1 = 1 (1, умноженная на 2 в первой степени вернет 1)
     1000 = 8 ( 0,умноженный на 2 в степени все равно вернут 0; 1, умноженная на 2 в 3-ей степени(3 позиция с конца
     вернет 8);
     110011= 51 ((1*32)+(1*16)+0+0+2+1);
     1111111= 127 (64+32+16+8+4+2+1);
     11111111= 255 (128 + 127 (из прошлого примера));


     44 =101100 ( 0(22), 0(11), 1(5,5), 1(2,5), 0(1), 1(0.5));
     777 = 1100001001 ( 1 (388,5); 0 (194), 0(97), 1(48,5), 0(24),0(12), 0(6), 0(3), 1(1.5) , 1(0,5));
     2342 = 100100100110 ( 0(1171), 1(585,5), 1(292,5), 0(146),0 (73), 1(36,5), 0(18),0(9),1(4,5) 0(2),0 (1), 1 (0,5));
     655 =1010001111 ( 1 (327,5), 1(163,5), 1(81,5), 1(40,5), 0(20), 0 (10), 0 (5) , 1(2,5), 0(1), 1 (0.5));
     52 = 110100 (0 (26); 0 (13),1 (6,5) 0(3), 1(1,5), 1 (0,5));
     5 = 101 (1 (2,5), 0(1),1(0.5));
     22222= 101011011001110 (0 (11111), 1(5555,5), 1(2777,5), 1(1388,5),0(694), 0(347),1(173,5), 1(86,5), 0(43), 1(21,5),
     1(10,5), 0(5), 1(2,5), 0(1), 1(0,5).
*/

    }

    public static void task_2() {

        int n = 1266;
        int num1 = n / 1000;
        int num2 = (n - num1 * 1000) / 100;
        int num3 = (n - num1 * 1000 - num2 * 100) / 10;
        int num4 = n % 10;


        if (num1 == num2 | num2 == num3 | num3 == num4 | num4 == num1) {
            System.out.println("есть одинаковые цифры");
        } else {
            System.out.println("цифры разные");
        }
    }



    public static void task_3() {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        //  int num = 7778; - also possible to harcode such a number

        String stringOfNum = String.valueOf(num);
        if (stringOfNum.length() == 3) {
            System.out.println("Число трехзначное");
        } else {
            System.out.println("Число не трехзначное");
        }
        if (stringOfNum.charAt(stringOfNum.length() - 1) == '7') {
            System.out.println("Последняя цифра является 7!");
        } else {
            System.out.println("Последняя цифра не 7!");
        }
        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void task_4() {
        int a = 2;
        int b = 5;
        int c = 6;

        if (a + b > c && b + c > a && c + a > b) {

            System.out.println(" Такой треугольник существует");
        } else {

            System.out.println("Такой треугольник не существует");
        }
    }


    public static void task_5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n > 0) {
            System.out.println(++n);
        }
        if (n < 0) {
            System.out.println(n -= 2);
        }
        if (n == 0) {
            System.out.println(n += 10);
        }

    }

    public static void task_6() {

    /* int compareNum1 = 55;
    int compareNum2 = 88; - if hardcoded */

        Scanner scan = new Scanner(System.in);
        int compareNum1 = scan.nextInt();
        int compareNum2 = scan.nextInt();

        int max = compareNum1 > compareNum2 ? compareNum1 : compareNum2;
        System.out.println(max);
    }

    public static void task_7 () {
        Scanner scan = new Scanner(System.in);
        int devNum = scan.nextInt();
        if (devNum < 0) {
            System.out.println(" Ошибка, отрицательное число!");
        } else if (devNum % 10 == 1 && devNum % 100 != 11) {
            System.out.println(devNum + " программист");
            return;

        } else if (devNum % 100 < 10 || devNum % 100 > 20 && devNum % 10 >= 2 && devNum % 10 <= 4) {
            System.out.println(devNum + " программиста");
            return;
        } else {
            System.out.println(devNum + " программистов");
            return;
        }

    }

}

