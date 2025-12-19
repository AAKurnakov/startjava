import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод ASCII-символов");
        System.out.printf("%-10s%-12s%-12s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        char character;
        String description;
        for (int i = 33; i <= 122; i++) {
            if ((i < 48 && i % 2 != 0) || (i >= 97 && i % 2 == 0)) {
                System.out.printf("  %-12d%-13c%-21s%n", i, (char) i, Character.getName(i));
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
            for (int j = 0; j < circumflexCount; j++) {
                System.out.printf("%s", "^");
            }
            System.out.println();
            circumflexCount += 2;
        }

        System.out.println("\n3. Вывод таблицы умножения");
        System.out.printf("%3s", '|');
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n--+------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d%2s", i, '|');
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
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
        int max = 0;
        int min = 0;
        if (firstNum > secondNum) {
            max = (firstNum > thirdNum) ? firstNum : thirdNum;
            min = (secondNum < thirdNum) ? secondNum : thirdNum;
        } else {
            max = (secondNum > thirdNum) ? secondNum : thirdNum;
            min = (firstNum < thirdNum) ? firstNum : thirdNum;
        }
        for (int i = --max; i > min; i--) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\n6. Разные операции над числом");
        int initialNumber = 2234321;
        int countOfTwo = 0;
        int reversedNumber = 0;
        int currNumber = initialNumber;
        while (currNumber > 0) {
            int digit = currNumber % 10;
            if (digit == 2) {
                countOfTwo++;
            }
            reversedNumber = reversedNumber * 10 + digit;
            currNumber /= 10;
        }
        if (reversedNumber == initialNumber) {
            System.out.printf("%d - палиндром с ", reversedNumber);
        } else {
            System.out.printf("%d - не палиндром с ", reversedNumber);
        }
        if (countOfTwo % 2 == 0) {
            System.out.printf("четным (%d) количеством двоек", countOfTwo);
        } else {
            System.out.printf("нечетным (%d) количеством двоек", countOfTwo);
        }

        System.out.println("\n\n7. Проверка счастливого числа");
        initialNumber = 101002;
        int tempNumber = initialNumber;
        int firstHalfNum = initialNumber / 1000;
        int secondHalfNum = initialNumber % 1000;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int countOfDigits = 1;
        while (tempNumber != 0) {
            if (countOfDigits < 3) {
                firstHalfSum += tempNumber % 10;
            } else {
                secondHalfSum += tempNumber % 10;
            }
            tempNumber /= 10;
            countOfDigits++;
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
        int asciiCode;
        for (int i = 0; i < passwordLength; i++) {
            asciiCode = random.nextInt(33, 123);
            if (asciiCode >= 33 && asciiCode < 48) {
                hasSpecialSymbols = true;
            } else if (asciiCode >= 48 && asciiCode < 58) {
                hasDigits = true;
            } else if (asciiCode >= 65 && asciiCode < 91) {
                hasUpperLetters = true;
            } else if (asciiCode >= 97 && asciiCode < 123) {
                hasLowerLetters = true;
            } else {
                continue;
            }
            System.out.print((char) asciiCode);
        }
        System.out.printf("\nНадежность: %s", 
                (passwordLength >= 8 && hasLowerLetters && hasUpperLetters && hasSpecialSymbols) ? "Надежный"
                : passwordLength >= 8 && hasUpperLetters && hasDigits ? "Средний"
                : "Слабый");
    }
}