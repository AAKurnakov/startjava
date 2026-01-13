package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.scanner = scanner;
    }

    public void start() {
        generateTargetNumber();
        boolean isFinishedGame = false;
        int attempt = 0;
        while (!isFinishedGame) {
            attempt++;
            System.out.printf("\nХод %d. %s, введите число: ", attempt, currentPlayer.getName());
            int guess = inputGuess();
            if (isGuessed(guess)) {
                isFinishedGame = true;
            } else {
                switchPlayer();
            }
        }
    }

    private void generateTargetNumber() {
        targetNumber = (int) (Math.random() * 100) + 1;
    }

    private int inputGuess() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int guess = scanner.nextInt();
        scanner.nextLine();
        return guess;
    }

    private boolean isGuessed(int guess) {
        if (guess == targetNumber) {
            System.out.println(currentPlayer.getName() + " угадал число!");
            return true;
        }
        if (targetNumber > guess) {
            System.out.printf("%d меньше того, что загадал компьютер%n", guess);
        } else {
            System.out.printf("%d больше того, что загадал компьютер%n", guess);
        }
        return false;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}

