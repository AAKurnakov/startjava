import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;
    private int min;
    private int max;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
        generateNewNumber();
    }

    public void start() {
        Player currentPlayer = player1;
        boolean isGameFinished = false;
        int attempt = 0;
        while (!isGameFinished) {
            attempt++;
            System.out.printf("\nХод %d. %s, введите число: ", attempt, currentPlayer.getName());
            int guess = readValidGuess();
            if (guess == targetNumber) {
                System.out.println(currentPlayer.getName() + " угадал число!");
                isGameFinished = true;
            } else {
                if (targetNumber > guess) {
                    System.out.printf("%d меньше того, что загадал компьютер%n", guess);
                    min = Math.max(min, guess);
                } else {
                    System.out.printf("%d больше того, что загадал компьютер%n", guess);
                    max = Math.min(max, guess);
                }
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    public void restart() {
        generateNewNumber();
    }

    private void generateNewNumber() {
        targetNumber = (int) (Math.random() * 100) + 1;
        min = 0;
        max = 100;
    }

    private int readValidGuess() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int guess = scanner.nextInt();
        scanner.nextLine();
        return guess;
    }
}

