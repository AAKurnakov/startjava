public class Calculator {
    public double calculate(int firstNum, char sign, int secondNum) {
        double result = 0;
        switch (sign) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            case '/':
                result = (double) firstNum / secondNum;
                break;
            case '^':
                if (secondNum == 0) {
                    result = 1;
                    break;
                } else {
                    result = firstNum;
                    for (int i = 0; i < secondNum - 1; i++) {
                        result *= firstNum;
                    }
                    if (secondNum > 0) {
                        return result;
                    } else {
                        return 1 / result;
                    }
                }
        }
        return result;
    }

    public boolean isValidSign(char sign) {
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%' && sign != '^') {
            return false;
        } else {
            return true;
        }
    }

    public boolean isNonZero(int number) {
        if (number != 0) {
            return true;
        } else {
            return false;
        }
    }
}