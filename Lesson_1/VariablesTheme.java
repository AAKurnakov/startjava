import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        final LocalTime localTimeStart = LocalTime.now();

        System.out.println("1. Вывод ASCII-графики");
        System.out.println(
                "                     /\\\n" +
                "   J    a  v     v  /  \\\n" +
                "   J   a a  v   v  /_( )\\\n" +
                "J  J  aaaaa  V V  /      \\\n" +
                " JJ  a     a  V  /___/\\___\\\n");
        System.out.print("""
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """);

        System.out.println("\n2. Расчет стоимости товара");
        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discount = 0.11f;
        float basePrice = penPrice + bookPrice;
        float discountSum = basePrice * discount;
        float discountPrice = basePrice - discountSum;
        System.out.println("Стоимость товаров без скидки: " + basePrice);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Стоимость товаров со скидкой: " + discountPrice);
        
        BigDecimal penPriceBd = BigDecimal.valueOf(105.50);
        BigDecimal bookPriceBd = BigDecimal.valueOf(235.23);
        BigDecimal discountBd = BigDecimal.valueOf(0.11);
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd);
        BigDecimal discountSumBd = basePriceBd.multiply(discountBd);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountSumBd);
        System.out.println("Стоимость товаров без скидки(BDec): " + basePriceBd);
        System.out.println("Сумма скидки(BDec): " + discountSumBd.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Стоимость товаров со скидкой:(BDec): " + 
                discountPriceBd.setScale(2, RoundingMode.HALF_UP));

        System.out.println("\n3. Перестановка значений ячеек в таблице");
        int cellA1 = 5;
        int cellB1 = 2;
        System.out.println("До перестановки: A1 = " + cellA1 + ", B1 = " + cellB1);
        System.out.println("Метод: с использованием третьей переменной");
        int temp = cellA1;
        cellA1 = cellB1;
        cellB1 = temp;
        System.out.println("Результат: A1 = " + cellA1 + ", B1 = " + cellB1);
        System.out.println("Метод: арифметических операций");
        cellA1 += cellB1;
        cellB1 = cellA1 - cellB1;
        cellA1 -= cellB1;
        System.out.println("Результат: A1 = " + cellA1 + ", B1 = " + cellB1);
        System.out.println("Метод: побитовый");
        cellA1 ^= cellB1;
        cellB1 ^= cellA1;
        cellA1 ^= cellB1;
        System.out.println("Результат: A1 = " + cellA1 + ", B1 = " + cellB1);

        System.out.println("\n4. Декодирование сообщения");
        int code1055 = 1055;
        int code1088 = 1088;
        int code1080 = 1080;
        int code1074 = 1074;
        int code1077 = 1077;
        int code1090 = 1090;
        System.out.printf("%4d%5d%5d%5d%5d%5d%n", code1055, code1088, code1080, code1074, code1077, code1090);
        System.out.printf("%2c%5c%5c%5c%5c%5c%n", code1055, code1088, code1080, code1074, code1077, code1090);

        System.out.println("\n5. Анализ кода товара");
        int productCode = 123;
        int productCategory = productCode / 100;
        int remainder = productCode % 100;
        int subcategory = remainder / 10;
        int packageType = remainder % 10;
        int checksum = productCategory + subcategory + packageType;
        int verificationCode = productCategory * subcategory * packageType;
        String textBlock = """
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """.formatted(productCode, productCategory, subcategory, 
                packageType, checksum, verificationCode);
        System.out.println(textBlock);

        System.out.println("6. Тестирование датчиков перед запуском ракеты");
        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d\n
                """, temperature, ++temperature, --temperature);

        int passedDistance = Integer.MAX_VALUE;
        System.out.printf("""
                [Пройденное расстояние, км]:
                  Исходное: %d
                  +1: %d
                  -1: %d\n
                """, passedDistance, ++passedDistance, --passedDistance);

        short pressure = Short.MAX_VALUE;
        System.out.printf("""
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d\n
                """, pressure, ++pressure, --pressure);

        long timeSinceStart = Long.MAX_VALUE;
        System.out.printf("""
                [Время с момента старта, с]:
                  Исходное: %d
                  +1: %d
                  -1: %d\n
                """, timeSinceStart, ++timeSinceStart, --timeSinceStart);

        char systemStatus = Character.MAX_VALUE;
        System.out.printf("""
                [Код состояния системы]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """, (int) systemStatus, (int) ++systemStatus, (int) --systemStatus);

        System.out.println("\n7. Вывод параметров JVM и ОС");
        int bytesToMb = 1024 * 1024;
        Runtime rt = Runtime.getRuntime();
        double totalMemory = rt.totalMemory() / bytesToMb;
        double freeMemory = rt.freeMemory() / bytesToMb;
        double usedMemory = (totalMemory - freeMemory);
        double maxMemory = rt.maxMemory() / bytesToMb;
        String systemDisk = System.getProperty("user.dir");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String filePathSeparator = System.getProperty("file.separator");
        System.out.printf("""
                Характеристики JVM:
                  доступное число ядер: %d
                  выделенная память (МБ): %.1f
                  свободная память (Мб): %.1f
                  используемая память (Мб): %.1f
                  максимально доступная для выделения память (Мб): %.1f
                Параметры ОС:
                  системный диск: %s
                  версия ОС: %s
                  версия Java: %s
                  сепаратор: %s
                """, rt.availableProcessors(), totalMemory, freeMemory, usedMemory, maxMemory, 
                systemDisk.charAt(0), osVersion, javaVersion, filePathSeparator);

        System.out.println("\n8.Замер времени работы кода");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalTime localTimeEnd = LocalTime.now();
        long endTime = System.nanoTime();
        double workTime = (double) (endTime - startTime) / 1e9;
        System.out.printf("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %.3f сек    |
                """, dtf.format(localTimeStart), dtf.format(localTimeEnd), workTime);
    }
}