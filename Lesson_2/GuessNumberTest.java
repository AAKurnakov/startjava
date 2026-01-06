import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2, scanner);
        boolean isContinueGame = true;
        while (isContinueGame) {
            game.start();
            isContinueGame = isContinue(scanner);
            if (isContinueGame) {
                game.restart();
            }
        }
        scanner.close();
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