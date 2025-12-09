import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод ASCII-символов");
        System.out.printf("%-10s%-12s%-12s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        char character;
        String description;
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                character = (char) i;
                description = Character.getName(i);
                System.out.printf("  %-12d%-13c%-21s%n", i, character, description);
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                character = (char) i;
                description = Character.getName(i);
                if (i < 100) {
                    System.out.printf("  %-12d%-13c%-21s%n", i, character, description);
                } else {
                    System.out.printf(" %-13d%-13c%-21s%n", i, character, description);
                }
            }
        }

        System.out.println("\n2. Вывод геометрических фигур");
        int circumflexCount = 1;
        for (int i = 5; i > 0; i--) {
            System.out.printf("%s ", "----------");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int k = 0; k < circumflexCount; k++) {
                System.out.printf("%s", "^");
            }
            System.out.println();
            circumflexCount += 2;
        }

        System.out.println("\n3. Вывод таблицы умножения");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0 && j == 1) {
                    System.out.printf("%3s", '|');
                } else if (i == 1 && j == 0) {
                    System.out.printf("--");
                } else if (i == 1 && j == 1) {
                    System.out.printf("+");
                } else if (i == 0) {
                    System.out.printf("%3d", j);
                } else if (i == 1) {
                    System.out.printf("---");
                } else if (j == 1) {
                    System.out.printf("%2s", '|');
                } else if (j == 0) {
                    System.out.printf("%d", i);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }

        System.out.println("\n4. Вывод чисел в несколько строк");
        int numCount = 0;
        for (int i = 1; i < 24; i += 2) {
            ++numCount;
            if (numCount == 1) {
                System.out.printf("%2d", i);
            } else if (numCount == 5) {
                System.out.printf("%3d\n", i);
                numCount = 0;
            } else {
                System.out.printf("%3d", i);
            }
        }
        if (numCount != 0) {
            while (numCount != 5) {
                ++numCount;
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5. Вывод чисел между min и max");
        int firstNum = 10;
        int secondNum = 5;
        int thirdNum = -1;
        int max = (firstNum > secondNum && firstNum > thirdNum) ? firstNum 
                : secondNum > thirdNum ? secondNum : thirdNum;
        int min = (firstNum < secondNum && firstNum < thirdNum) ? firstNum
                : secondNum < thirdNum ? secondNum : thirdNum;
        for (int i = ++min; i < max; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\n6. Разные операции над числом");
        int initialNumber = 2234321;
        int countOfTwo = 0;
        String resultNumber = "";
        int tempNumber = initialNumber;
        while (tempNumber > 0) {
            countOfTwo = (tempNumber % 10 == 2) ? ++countOfTwo : countOfTwo;
            resultNumber += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.printf("%s - %sпалиндром с %s (%d) количеством двоек", resultNumber,
                (resultNumber != String.valueOf(initialNumber)) ? "не " : "", 
                (countOfTwo % 2 == 0) ? "четным" : "нечетным", countOfTwo);

        System.out.println("\n\n7. Проверка счастливого числа");
        initialNumber = 101002;
        int totalDigits = 0;
        tempNumber = initialNumber;
        while (tempNumber != 0) {
            tempNumber /= 10;
            totalDigits++;
        }

        int halfLength = totalDigits / 2;
        int divisor = 1;
        for (int i = 0; i < halfLength; i++) {
            divisor *= 10;
        }
        int firstHalfNum = initialNumber / divisor;
        int secondHalfNum = initialNumber % divisor;

        tempNumber = initialNumber;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        while (totalDigits != 0) {
            if (totalDigits <= halfLength) {
                firstHalfSum += tempNumber % 10;
            } else {
                secondHalfSum += tempNumber % 10;
            }
            tempNumber /= 10;
            totalDigits--;
        }
        System.out.printf("%d - счастливое число%nСумма цифр %03d = %d%nСумма цифр %03d = %d\n", 
                initialNumber, secondHalfNum, secondHalfSum, firstHalfNum, firstHalfSum);

        System.out.println("\n8. Простой генератор пароля");
        Random random = new Random();
        System.out.print("Пароль: ");
        int passwordLength = 8;
        boolean hasLowerLetters = false;
        boolean hasUpperLetters = false;
        boolean hasDigits = false;
        boolean hasSpecialSymbols = false;
        int charType;
        int asciiCode;
        for (int i = 0; i < passwordLength; i++) {
            charType = random.nextInt(4);
            if (charType == 0) {
                asciiCode = random.nextInt(33, 48);
                hasSpecialSymbols = true;
            } else if (charType == 1) {
                asciiCode = random.nextInt(48, 58);
                hasDigits = true;
            } else if (charType == 2) {
                asciiCode = random.nextInt(65, 91);
                hasUpperLetters = true;
            } else {
                asciiCode = random.nextInt(97, 123);
                hasLowerLetters = true;
            }
            System.out.print((char) asciiCode);
        }
        System.out.printf("\nНадежность: %s", 
                (passwordLength >= 8 && hasLowerLetters && hasUpperLetters && hasSpecialSymbols) ? "Надежный"
                : passwordLength >= 8 && hasUpperLetters && hasDigits ? "Средний"
                : "Слабый");
    }
}