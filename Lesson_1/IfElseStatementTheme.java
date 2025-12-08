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
        double avgSteps = stepsSum / 2.0;
        System.out.printf("Количество шагов за вчера и сегодня - %d\n", stepsSum);
        if (stepsToday > stepsYesterday) {
            System.out.println("Сегодня шагов больше");
        } else if (stepsToday < stepsYesterday) {
            System.out.println("Вчера шагов было больше");
        } else {
            System.out.println("Одинаковое количество шагов");
        }
        System.out.printf("Среднее значение шагов - %.2f\n", avgSteps);

        System.out.println("\n3. Проверка количества гостей");
        int guestCount = 14;
        boolean isEvenCount = (guestCount % 2 == 0);
        if (guestCount == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestCount < 0) {
            System.out.println("Число гостей не может быть отрицательным");
        } else if (isEvenCount) {
            System.out.printf("Записалось %d гостей. Можно формировать пары для конкурсов.\n", guestCount);
        } else {
            System.out.printf("Записалось %d гостей. Нужны индивидуальные задания.\n", guestCount);
        }

        System.out.println("\n4. Определение первого символа никнейма");
        String name = "Elschamaly";
        String startStr = "Имя %s начинается с ";
        int firstCharCode = name.charAt(0);
        if ((firstCharCode >= 'a' && firstCharCode <= 'z') || 
                (firstCharCode >= 'а' && firstCharCode <= 'я')) {
            System.out.printf(startStr + "маленькой буквы %c\n", name, firstCharCode);
        } else if ((firstCharCode >= 'A' && firstCharCode <= 'Z') || 
                (firstCharCode >= 'А' && firstCharCode <= 'Я')) {
            System.out.printf(startStr + "большой буквы %c\n", name, firstCharCode);
        } else if (firstCharCode >= '0' && firstCharCode <= '9') {
            System.out.printf(startStr + "цифры %c\n", name, firstCharCode);
        } else {
            System.out.printf(startStr + "символа %c\n", name, firstCharCode);
        }

        char firstChar = name.charAt(0);
        if (Character.isLowerCase(firstChar)) {
            System.out.printf(startStr + "маленькой буквы %c\n", name, firstCharCode);
        } else if (Character.isUpperCase(firstChar)) {
            System.out.printf(startStr + "большой буквы %c\n", name, firstCharCode);
        } else if (Character.isDigit(firstChar)) {
            System.out.printf(startStr + "цифры %c\n", name, firstCharCode);
        } else {
            System.out.printf(startStr + "символа %c\n", name, firstCharCode);
        }

        System.out.println("\n5. Инвентаризация");
        short snId = 212;
        short pcId = 216;
        if (snId == pcId) {
            System.out.printf("[%d]: Компьютер на 3-м этаже в кабинете 2\n", pcId);
        } else {
            System.out.printf("[%d]: оборудование не идентифицировано\n", pcId);
        }
        String strSnId = String.valueOf(snId);
        String strPcId = String.valueOf(pcId);
        String textBlock = """
                Частичное совпадение: [%s%s%s]
                """.formatted(strSnId.charAt(0) == strPcId.charAt(0) ? strPcId.charAt(0) : "_",
                        strSnId.charAt(1) == strPcId.charAt(1) ? strPcId.charAt(1) : "_",
                        strSnId.charAt(2) == strPcId.charAt(2) ? strPcId.charAt(2) : "_");
        System.out.println(textBlock);

        System.out.println("6. Подсчет начисленных банком процентов");
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
        int histGrade;
        if (histPercent <= 0.6) {
            histGrade = 2;
        } else if (histPercent > 0.91) {
            histGrade = 5;
        } else if (histPercent > 0.73) {
            histGrade = 4;
        } else {
            histGrade = 3;
        }
        double csPercent = 0.92;
        int csGrade;
        if (csPercent <= 0.6) {
            csGrade = 2;
        } else if (csPercent > 0.91) {
            csGrade = 5;
        } else if (csPercent > 0.73) {
            csGrade = 4;
        } else {
            csGrade = 3;
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
        BigDecimal yearSale = BigDecimal.valueOf(13025.233).multiply(BigDecimal.valueOf(12));
        BigDecimal yearRent = BigDecimal.valueOf(5123.018).multiply(BigDecimal.valueOf(12));
        BigDecimal yearCostPrice = BigDecimal.valueOf(9001.729).multiply(BigDecimal.valueOf(12));
        BigDecimal yearProfit = yearSale.subtract(yearRent.add(yearCostPrice));
        if (yearProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +%.2f", yearProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f", yearProfit);
        }
    }
}