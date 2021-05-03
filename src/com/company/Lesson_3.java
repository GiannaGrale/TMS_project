package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {

    public static void task_1() {

        int[] newArray = new int[10];
        int firstCounter = 0;
        int secondCounter = 2;
        while (firstCounter < 10) {
            newArray[firstCounter] = secondCounter;
            secondCounter += 2;
            firstCounter++;
        }

        for (firstCounter = 0; firstCounter < 10; firstCounter++) {
            System.out.print(newArray[firstCounter] + " ");
        }
        for (firstCounter = 0; firstCounter < 10; firstCounter++) {
            System.out.print("\n" + newArray[firstCounter]);
        }
        System.out.println("\n");
    }

    public static void task_2() {

        int[] secondArray = new int[99];
        for (int i = 1, j = 0; i <= secondArray.length; i++) {
            if (i % 2 != 0) {
                secondArray[j] = i;
                System.out.print(secondArray[j] + " ");
                j++;
            }
        }
        System.out.print("\n");
    }

    public static void task_2_1() {

        int[] secondArray = new int[99];
        for (int i = 99, j = 0; i <= secondArray.length; i--) {
            if (i % 2 != 0 && i > 0) {
                secondArray[j] = i;
                System.out.print(secondArray[j] + " ");
                j++;
            }
        }
        System.out.print("\n");
    }

    public static void task3() {

        int[] thirdArray = new int[15];
        int a = 0;
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] % 2 == 0) {
                a++;
            }
            System.out.print(thirdArray[i] + " ");
        }
        System.out.println();
        System.out.println("В массиве кол-во четных элементов равно: " + a);
        System.out.print("\n");

    }

    public static void task4() {

        int[] fourthArray = new int[20];
        int a = 0;
        for (int i = 0; i < fourthArray.length; i++) {
            fourthArray[i] = (int) (Math.random() * 21);
            System.out.print(fourthArray[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < fourthArray.length; i++) {
            if (fourthArray[i] % 2 != 0) {
                fourthArray[i] = 0;
                a++;
            }
            System.out.print(fourthArray[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task_5() {

        int[] fifthArray = new int[5];
        int[] anotherFifthArray = new int[5];

        double meanArray1 = 0;
        double meanArray2 = 0;

        for (int i = 0; i < fifthArray.length; i++) {
            fifthArray[i] = (int) (Math.random() * 16);
            System.out.print(fifthArray[i] + " ");
            meanArray1 += (double) fifthArray[i] / fifthArray.length;
        }
        System.out.print("\n");

        for (int j = 0; j < anotherFifthArray.length; j++) {
            anotherFifthArray[j] = (int) (Math.random() * 16);
            System.out.print(anotherFifthArray[j] + " ");
            meanArray2 += (double) anotherFifthArray[j] / anotherFifthArray.length;
        }
        System.out.print("\n");

        if (meanArray1 == meanArray2) {
            System.out.println("Средние арифметические значения двух массивов равны");
        } else if (meanArray1 > meanArray2) {
            System.out.println("Среднее арифметическое значение первого массива больше");
        } else {
            System.out.println("Среднее арифметическое значение второго массива больше");
        }

        System.out.print("\n");
    }

    public static void task_6() {
        int[] sixthArray = new int[4];
        for (int i = 0; i < sixthArray.length; i++) {
            sixthArray[i] = (int) (Math.random() * 11);
            System.out.print(sixthArray[i] + " ");
        }

        String result = "Массив имеет строго возрастающую последоватеьность";
        for (int i = 1; i < sixthArray.length; i++) {
            if (sixthArray[i - 1] >= sixthArray[i]) {
                result = "Массив не имеет строго возрастающей последовательности";
                break;
            }
        }

        System.out.print("\n" + result);
    }


    public static void task_7() {

        int[] seventhArray = new int[12];
        int maxNum = 0;
        int maxIndex = 0;

        for (int i = 0; i < seventhArray.length; i++) {
            seventhArray[i] = (int) (Math.random() * 16);
            System.out.print(seventhArray[i] + " ");
            if (maxNum <= seventhArray[i]) {
                maxNum = seventhArray[i];
                maxIndex = seventhArray[i];

            }
        }
        System.out.print("\n");
        System.out.println("Индекс максимального элемента равен " + maxIndex);
        System.out.print("\n");
    }

    public static void task_8() {
        System.out.println("Введите положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int scanNum = scanner.nextInt();
        if (scanNum < 0) {
            System.out.println("Некорректное число");
            return;
        }
        int[] eighthArray = new int[scanNum];

        for (int i = 0; i < eighthArray.length; i++) {
            eighthArray[i] = (int) (Math.random() * scanNum);
            System.out.print(eighthArray[i]);

        }
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < (scanNum / 2); i++) {
            leftSum += eighthArray[i];
            rightSum += eighthArray[scanNum - 1 - i];

        }
        System.out.print("\n");
        if (leftSum > rightSum) {
            System.out.println("Сумма левой половины массива больше, чем правой");
        } else if (rightSum > leftSum) {
            System.out.println("Сумма правой половины массива больше, чем левой");
        } else {
            System.out.println("Суммы обеих половин массива равны");
        }

    }

    public static void task_9() {

        System.out.println("Введите число больше 3-ех: ");
        Scanner scanner = new Scanner(System.in);
        int scNum = scanner.nextInt();
        int n = scNum;
        if (scNum <= 3) {
            System.out.println("Некорректное число");
            return;
        }

        int[] ninthArray = new int[n];
        int temp = 0;

        for (int i = 0; i < ninthArray.length; i++) {
            ninthArray[i] = (int) (Math.random() * (n + 1));
            if (ninthArray[i] % 2 == 0) {
                temp++;
            }
        }

        System.out.println(Arrays.toString(ninthArray));


        int[] anotherNinthArray = new int[temp];
        int index = 0;
        for (int i = 1; i < ninthArray.length; i++) {
            if (ninthArray[i] % 2 == 0) {
                anotherNinthArray[index] = ninthArray[i];
                index++;

            }

        }
             System.out.println(Arrays.toString(anotherNinthArray));
    }

    public static void twoDimensionalArray() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = v;

        int[][] tenthArray = new int[v][v];

        for (int i = 0; i < tenthArray.length; i++) {
            for (int j = 0; j < tenthArray[i].length; j++) {
                tenthArray[i][j] = (int) (Math.random() * 51);
                System.out.print(tenthArray[i][j] + "\t");
            }
                System.out.println();
        }

        // 1) Посчитать сумму четных элементов стоящих на главной диагонали

        int sum = 0;
        for (int i = 0; i < tenthArray.length; i++) {

            if (tenthArray[i][i] % 2 == 0) {
                sum += tenthArray[i][i];
            }
        }

        System.out.println("Сумма четных элементов стоящих на главной диагонали равна:" + sum);

        //2) Вывести нечетные элементы находящиеся под главной диагональю(включительно).

        int s = 0;
        for (int i = 0; i < tenthArray.length; i++) {
            for (int j = 0; j < tenthArray.length; j++) {
                if (j <= i && tenthArray[i][j] % 2 != 0) {
                    s += tenthArray[i][j];
                }

            }

        }

        System.out.println("Сумма нечетных элементов находящихся под главной диагональю включительно равна:" + s);

        //4) Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
        int z = 0;
        for (int i = 0; i < tenthArray.length; i++) {
            for (int j = 0; j < tenthArray.length - i - 1; j++) {

                if (tenthArray[i][j] % 2 == 0) {
                    z += tenthArray[i][j];

                }

            }
        }
        System.out.println("Сумма четных элементов находящихся над побочной  диагональю равна:" + z);

        // Проверить произведение элементов какой диагонали больше.

        int multi1 = 1;
        int multi = 1;
        for (int i = 0; i < tenthArray.length; i++) {
            for (int j = 0; j < tenthArray.length; j++) {
                if (j == i) {
                    multi = multi * tenthArray[i][j];

                }
            }
        }

        for (int i = 0; i < tenthArray.length; i++) {
            int j = tenthArray.length - i - 1;
            {
                multi1 = multi1 * tenthArray[i][j];
            }
        }
        System.out.println("Произвдение главной диагонали : " + multi);
        System.out.println("Произвдение побочной диагонали : " + multi1);

        int comparison = multi > multi1 ? multi : multi1;
        System.out.println("Большее произведение элементов диагонали равно " + comparison);


        //Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.) {

        for (int i = 0; i < tenthArray.length; i++) {
            for (int j = 0; j < tenthArray.length; j++) {

                System.out.print(tenthArray[j][i] + " ");
            }   System.out.print("\n");
        }
    }
}





