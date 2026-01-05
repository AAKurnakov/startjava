import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите первое число: ");
            int firstNum = readValidNum();
            calculator.setFirstNum(firstNum);

            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            char sign = scanner.nextLine().charAt(0);
            calculator.setSign(sign);

            System.out.println("Введите второе число: ");
            int secondNum = readValidNum();
            calculator.setSecondNum(secondNum);

            double result = calculator.calculate();
            printResult(result);
        } while (askToContinue());
        scanner.close();
    }

    private static int readValidNum() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static boolean askToContinue() {
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

    private static void printResult(double result) {
        if (result == (long) result) {
            System.out.printf("Результат: %d%n", (long) result);
        } else {
            System.out.printf("Результат: %.3f%n", result);
        }
    }
}