import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык java");
        boolean isMan = false;
        if (!isMan) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        int age = 18;
        if (age > 18) {
            System.out.println("Он уже совершеннолетний");
        } else {
            System.out.println("Он еще не совершеннолетний или только-только им стал");
        }

        double height = 1.8;
        if (height < 1.8) {
            System.out.println("Его рост до 179 см");
        } else {
            System.out.println("Он выше 179 см");
        }

        System.out.println("\n2. Поиск большего числа шагов");
        int stepsToday = 12000;
        int stepsYesterday = 11294;
        System.out.printf("Количество шагов за вчера и сегодня - %d\n", stepsToday + stepsYesterday);
        if (stepsToday > stepsYesterday) {
            System.out.println("Сегодня шагов больше");
        } else if (stepsToday < stepsYesterday) {
            System.out.println("Вчера шагов было больше");
        } else {
            System.out.println("Одинаковое количество шагов");
        }

        System.out.println("\n3. Проверка количества гостей");
        int guestCount = 14;
        boolean isEvenCount = (guestCount % 2 == 0);
        if (guestCount == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (isEvenCount && guestCount > 0) {
            System.out.printf("Записалось %d гостей. Можно формировать пары для конкурсов.\n", guestCount);
        } else if (!isEvenCount && guestCount > 0) {
            System.out.printf("Записалось %d гостей. Нужны индивидуальные задания.\n", guestCount);
        } else {
            System.out.println("Число гостей не может быть отрицательным");
        }

        System.out.println("\n4. Определение первого символа никнейма");
        String name = "Elschamaly";
        int firstCharCode = name.charAt(0);
        if ((firstCharCode >= 'a' && firstCharCode <= 'z') || 
                (firstCharCode >= 'а' && firstCharCode <= 'я')) {
            System.out.printf("Имя %s начинается с маленькой буквы '%c'\n", name, firstCharCode);
        } else if ((firstCharCode >= 'A' && firstCharCode <= 'Z') || 
                (firstCharCode >= 'А' && firstCharCode <= 'Я')) {
            System.out.printf("Имя %s начинается с большой буквы '%c'\n", name, firstCharCode);
        } else if (firstCharCode >= '0' && firstCharCode <= '9') {
            System.out.printf("Имя %s начинается с цифры '%c'\n", name, firstCharCode);
        } else {
            System.out.printf("Имя %s начинается с символа '%c'\n", name, firstCharCode);
        }

        System.out.println("\n5. Инвентаризация");
        short snId = 212;
        short pcId = 216;
        boolean isHundreadsEqual = (snId / 100 == pcId / 100);
        boolean isTensEqual = ((snId % 100) / 10 == (pcId % 100) / 10);
        boolean isOnesEqual = (snId % 10 == pcId % 10);
        int computerNum = snId / 100;
        int floorNum = (snId % 100) / 10;
        int officeNum = snId % 10;
        String textBlock = "";
        if (isHundreadsEqual && isTensEqual && isOnesEqual) {
            textBlock = """
                    [№%d]: %d компьютер на %d-м этаже в кабинете %d
                    """.formatted(pcId, computerNum, floorNum, officeNum);
        } else if (isHundreadsEqual && isTensEqual) {
            textBlock = """
                    [№%d]: %d компьютер на %d-м этаже
                    """.formatted(pcId, computerNum, floorNum);
        } else if (isHundreadsEqual && isOnesEqual) {
            textBlock = """
                    [№%d]: компьютер в кабинете %d
                    """.formatted(pcId, computerNum, officeNum);
        } else if (isTensEqual && isOnesEqual) {
            textBlock = """
                    [№%d]: компьютер на %d-м этаже в кабинете %d
                    """.formatted(pcId, floorNum, officeNum);
        } else {
            textBlock = "оборудование не идентифицировано";
        }
        System.out.println(textBlock);

        System.out.println("\n6. Подсчет начисленных банком процентов");
        float deposit = 321123.79f;
        float depositRate = (deposit < 1e5) ? 0.05f 
                : (deposit >= 1e5 && deposit < 3e5) ? 0.07f : 0.1f;
        float accruedPercent = deposit * depositRate;
        System.out.printf("""
                Сумма вклада - %f
                Сумма начисленного процента- %f
                Итоговая сумма с процентами - %f
                """, deposit, accruedPercent, deposit + accruedPercent);

        BigDecimal depositBd = new BigDecimal("321123.79");
        BigDecimal depositRateBd;
        if (depositBd.compareTo(BigDecimal.valueOf(1e5)) == -1) {
            depositRateBd = new BigDecimal("0.05");
        } else if (depositBd.compareTo(BigDecimal.valueOf(3e5)) == -1) {
            depositRateBd = new BigDecimal("0.07");
        } else {
            depositRateBd = new BigDecimal("0.1");
        }
        BigDecimal accruedPercentBd = depositBd.multiply(depositRateBd);
        System.out.printf("""
                Сумма вклада - %.2f
                Сумма начисленного процента- %.2f
                Итоговая сумма с процентами - %.2f
                """, depositBd, accruedPercentBd, depositBd.add(accruedPercentBd));

        System.out.println("\n7. Определение оценки по предметам");
        double histScorePercent = 0.59;
        double programmingScorePercent = 0.92;
        int histScore;
        if (histScorePercent <= 0.6) {
            histScore = 2;
        } else if (histScorePercent > 0.91) {
            histScore = 5;
        } else if (histScorePercent > 0.73) {
            histScore = 4;
        } else {
            histScore = 3;
        }
        int programmingScore;
        if (programmingScorePercent <= 0.6) {
            programmingScore = 2;
        } else if (programmingScorePercent > 0.91) {
            programmingScore = 5;
        } else if (programmingScorePercent > 0.73) {
            programmingScore = 4;
        } else {
            programmingScore = 3;
        }
        double averageScorePercent = (histScorePercent + programmingScorePercent) / 2 * 100;
        double averageScoreSubject = ((double) histScore + (double) programmingScore) / 2;
        System.out.printf("""
                История: %d 
                Программирование: %d
                Средний балл по предметам: %.1f
                Средний процент по предметам: %.1f
                """, histScore, programmingScore, averageScoreSubject, averageScorePercent);

        System.out.println("\n8. Расчет годовой прибыли");
        BigDecimal monthSale = new BigDecimal("13025.233");
        BigDecimal monthRent = new BigDecimal("5123.018");
        BigDecimal monthCostPrice = new BigDecimal("9001.729");
        BigDecimal yearSale = monthSale.multiply(BigDecimal.valueOf(12));
        BigDecimal yearExpenses = monthRent.add(monthCostPrice).multiply(BigDecimal.valueOf(12));
        BigDecimal yearProfit = yearSale.subtract(yearExpenses);
        int compareResult = yearProfit.compareTo(BigDecimal.ZERO);
        char sign = (compareResult == 1) ? '+' : '\0';
        if (sign == '+') {
            System.out.printf("Прибыль за год: %c%.2f", sign, yearProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f", yearProfit);
        }
    }
}