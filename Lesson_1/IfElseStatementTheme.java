import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык java");
        boolean isMale = false;
        if (!isMale) {
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
        int stepsYesterday = 11295;
        int stepsSum = stepsToday + stepsYesterday;
        System.out.printf("Количество шагов за вчера и сегодня - %d%n", stepsSum);
        if (stepsToday > stepsYesterday) {
            System.out.println("Сегодня шагов больше");
        } else if (stepsToday < stepsYesterday) {
            System.out.println("Вчера шагов было больше");
        } else {
            System.out.println("Одинаковое количество шагов");
        }
        double avgSteps = stepsSum / 2.0;
        System.out.printf("Среднее значение шагов - %.2f%n", avgSteps);

        System.out.println("\n3. Проверка количества гостей");
        int guestCount = 14;
        if (guestCount == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestCount < 0) {
            System.out.println("Число гостей не может быть отрицательным");
        } else if (guestCount % 2 == 0) {
            System.out.printf("Записалось %d гостей. Можно формировать пары для конкурсов.%n", guestCount);
        } else {
            System.out.printf("Записалось %d гостей. Нужны индивидуальные задания.%n", guestCount);
        }

        System.out.println("\n4. Определение первого символа никнейма");
        String name = "Elschamaly";
        System.out.printf("Имя %s начинается с ", name);
        int firstCharCode = name.charAt(0);
        if ((firstCharCode >= 'a' && firstCharCode <= 'z') || 
                (firstCharCode >= 'а' && firstCharCode <= 'я')) {
            System.out.printf("маленькой буквы %c%n", firstCharCode);
        } else if ((firstCharCode >= 'A' && firstCharCode <= 'Z') || 
                (firstCharCode >= 'А' && firstCharCode <= 'Я')) {
            System.out.printf("большой буквы %c%n", firstCharCode);
        } else if (firstCharCode >= '0' && firstCharCode <= '9') {
            System.out.printf("цифры %c%n", firstCharCode);
        } else {
            System.out.printf("символа %c%n", firstCharCode);
        }

        char firstChar = name.charAt(0);
        System.out.printf("Имя %s начинается с ", name);
        if (Character.isLowerCase(firstChar)) {
            System.out.printf("маленькой буквы %c%n", firstCharCode);
        } else if (Character.isUpperCase(firstChar)) {
            System.out.printf("большой буквы %c%n", firstCharCode);
        } else if (Character.isDigit(firstChar)) {
            System.out.printf("цифры %c%n", firstCharCode);
        } else {
            System.out.printf("символа %c%n", firstCharCode);
        }

        System.out.println("\n5. Инвентаризация");
        short snId = 123;
        short pcId = 143;
        boolean isEqualOnes = (snId % 10 == pcId % 10);
        boolean isEqualTens = ((snId / 10) % 10 == (pcId / 10) % 10);
        boolean isEqualHundreds = (snId / 100 == pcId / 100);
        if (snId == pcId) {
            System.out.printf("[%d]: Компьютер на 3-м этаже в кабинете 2%n", pcId);
        } else if (isEqualOnes || isEqualTens || isEqualHundreds) {
            String textBlock = """
                    Нет полного совпадения: 
                    База данных: [№%s]
                    Фактический: [№%s%s%s]
                    """.formatted(snId,
                            isEqualHundreds ? pcId / 100 : "_",
                            isEqualTens ? (pcId / 10) % 10 : "_",
                            isEqualOnes ? pcId % 10 : "_");
            System.out.printf(textBlock);
        } else {
            System.out.printf("[%d]: оборудование не идентифицировано%n", pcId);
        }

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

        BigDecimal depositBd = BigDecimal.valueOf(321123.79);
        BigDecimal depositRateBd = BigDecimal.valueOf(0.1);
        if (depositBd.compareTo(BigDecimal.valueOf(1e5)) == -1) {
            depositRateBd = BigDecimal.valueOf(0.05);
        } else if (depositBd.compareTo(BigDecimal.valueOf(3e5)) == -1) {
            depositRateBd = BigDecimal.valueOf(0.07);
        }
        BigDecimal accruedPercentBd = depositBd.multiply(depositRateBd);
        System.out.printf("""
                Сумма вклада - %.2f
                Сумма начисленного процента- %.2f
                Итоговая сумма с процентами - %.2f
                """, depositBd, accruedPercentBd, depositBd.add(accruedPercentBd));

        System.out.println("\n7. Определение оценки по предметам");
        double histPercent = 0.59;
        int histGrade = 3;
        if (histPercent <= 0.6) {
            histGrade = 2;
        } else if (histPercent > 0.91) {
            histGrade = 5;
        } else if (histPercent > 0.73) {
            histGrade = 4;
        }
        double csPercent = 0.92;
        int csGrade = 3;
        if (csPercent <= 0.6) {
            csGrade = 2;
        } else if (csPercent > 0.91) {
            csGrade = 5;
        } else if (csPercent > 0.73) {
            csGrade = 4;
        }
        double avgPercent = (histPercent + csPercent) / 2 * 100;
        double avgGrade = ((double) histGrade + csGrade) / 2;
        System.out.printf("""
                История: %d 
                Программирование: %d
                Средний балл по предметам: %.1f
                Средний процент по предметам: %.1f
                """, histGrade, csGrade, avgGrade, avgPercent);

        System.out.println("\n8. Расчет годовой прибыли");
        BigDecimal monthSale = BigDecimal.valueOf(13025.233);
        BigDecimal monthRent = BigDecimal.valueOf(5123.018);
        BigDecimal monthCostPrice = BigDecimal.valueOf(9001.729);
        BigDecimal yearProfit = monthSale.subtract(monthRent.add(monthCostPrice))
                .multiply(BigDecimal.valueOf(12));
        if (yearProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +%.2f", yearProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f", yearProfit);
        }
    }
}