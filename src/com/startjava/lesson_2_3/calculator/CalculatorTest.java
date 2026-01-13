package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите первое число: ");
            calculator.setFirstNum(inputNum(scanner));

            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            calculator.setSign(scanner.nextLine().charAt(0));

            System.out.println("Введите второе число: ");
            calculator.setSecondNum(inputNum(scanner));

            double result = calculator.calculate();
            printResult(result);
        } while (isContinue(scanner));
        scanner.close();
    }

    private static int inputNum(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static void printResult(double result) {
        if (result == (long) result) {
            System.out.printf("Результат: %d%n", (long) result);
        } else {
            System.out.printf("Результат: %.5f%n", result);
        }
    }

    private static boolean isContinue(Scanner scanner) {
        while (true) {
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            String answer = scanner.nextLine().trim().toLowerCase();
            
            if (answer.equals("yes")) {
                return true;
            }
            
            if (answer.equals("no")) {
                return false;
            }
            
            System.out.println("Ошибка: введите только \"yes\" или \"no\"!");
        }
    }
}