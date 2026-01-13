package com.startjava.lesson_1.final_;

import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNum = random.nextInt(1, 101);
        int min = 0;
        int max = 100;
        int midRange = (min + max) / 2;
        while (hiddenNum != midRange) {
            if (hiddenNum > midRange) {
                System.out.printf("%d меньше того, что загадал компьютер%n", midRange);
                min = midRange;
                midRange = Math.round((min + max) / 2);
                if (min == midRange && midRange != 100) {
                    midRange++;
                }
            } else {
                System.out.printf("%d больше того, что загадал компьютер%n", midRange);
                max = midRange;
                midRange = Math.round((min + max) / 2);
            }
        }
        System.out.println(midRange);
        System.out.printf("Вы победили! Загаданное число - %d", hiddenNum);
    }
}