import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            while (!scan.hasNextInt()) {
                System.out.print("Ошибка: число должно быть целым! Введите еще раз: ");
                scan.next();
            }
            int firstNum = scan.nextInt();

            char sign;
            while (true) {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                sign = scan.next().charAt(0);
                if (calculator.isValidSign(sign)) {
                    break;
                } else {
                    System.out.printf("Ошибка: операция %c не поддерживается!%n", sign);
                }
            }

            int secondNum;
            while (true) {
                System.out.print("Введите второе число: ");
                if (scan.hasNextInt()) {
                    secondNum = scan.nextInt();
                    if (sign == '/' && !calculator.isNonZero(secondNum)) {
                        System.out.println("Ошибка: деление на ноль запрещено!");
                        continue;
                    } 
                    break;
                } else {
                    System.out.print("Ошибка: число должно быть целым! ");
                    scan.next();
                }
            }

            double result = calculator.calculate(firstNum, sign, secondNum);
            System.out.printf("Результат = %g%n%n", result);
            scan.nextLine();

            String input = "";
            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                input = scan.nextLine().trim().toLowerCase();
                if (input.equals("yes") || input.equals("no")) {
                    break;
                } else {
                    System.out.println("Ошибка: введите только \"yes\" или \"no\"!");
                }
            }
            if (input.equals("no")) {
                scan.close();
                break;
            }
        }
    }
}