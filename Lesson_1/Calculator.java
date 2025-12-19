public class Calculator {
    public static void main(String[] args) {
        int firstNum = 12;
        int secondNum = 3;
        // Проверка, что числа натуральные
        if (firstNum <= 0 || secondNum <= 0) {
            System.out.println("Числа должно быть натуральными!");
            return;
        }
        char sign = '/';
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%' && sign != '^') {
            System.out.println("Введите правильный знак('+' '-' '*' '/' '%' '^')");
            return;
        }
        double result = 0;
        if (sign == '+') {
            result = firstNum + secondNum;
        } else if (sign == '-') {
            result = firstNum - secondNum;
        } else if (sign == '*') {
            result = firstNum * secondNum;
        } else if (sign == '/') {
            result = (double) firstNum / secondNum;
        } else if (sign == '%') {
            result = firstNum % secondNum;
        } else if (sign == '^') {
            result = firstNum;
            for (int i = 0; i < secondNum - 1; i++) {
                result *= firstNum;
            }
        }
        System.out.printf("%d %s %d = %g", firstNum, sign, secondNum, result);
    }
}