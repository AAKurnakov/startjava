public class Calculator {
    private int firstNum;
    private char sign;
    private int secondNum;

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSign(char sign) {
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%' && sign != '^') {
            throw new IllegalArgumentException("Ошибка: операция %c не поддерживается!%n".formatted(sign));
        } 
        this.sign = sign;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public double calculate() {
        return calculate(firstNum, sign, secondNum);
    }

    private double calculate(int firstNum, char sign, int secondNum) {
        switch (sign) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '%':
                return firstNum % secondNum;
            case '/':
                if (this.secondNum == 0) {
                    throw new IllegalArgumentException("Деление на ноль запрещено");
                }
                return (double) firstNum / secondNum;
            case '^':
                return (secondNum == 0) ? 1 : pow(firstNum, secondNum);
            default:
                // никогда не выполнится, но без этого требует возврат значения
                throw new IllegalArgumentException("Операция не поддерживается");
        }
    }

    private double pow(int base, int exponent) {
        double result = base;
        for (int i = 0; i < Math.abs(exponent) - 1; i++) {
            result *= base;
        }
        return (exponent > 0) ? result : 1 / result;
    }
}