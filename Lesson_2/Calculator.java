public class Calculator {
    private int firstNum;
    private char sign;
    private int secondNum;

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSign(char sign) {
        if ("+-*/%^".indexOf(sign) == -1) {
            throw new IllegalArgumentException("Ошибка: операция %c не поддерживается!%n".formatted(sign));
        } 
        this.sign = sign;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public double calculate() {
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
                if (secondNum == 0) {
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