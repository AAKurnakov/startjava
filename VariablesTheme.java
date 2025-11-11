import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        final LocalTime localTimeStart = LocalTime.now();

        System.out.println("1. Вывод ASCII-графики");
        System.out.println("                     /\\" + "\n" +
                "   J    a  v     v  /  \\   " + "\n" +
                "   J   a a  v   v  /_( )\\  " + "\n" +
                "J  J  aaaaa  V V  /      \\ " + "\n" +
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
        float sumWithoutDiscount = penPrice + bookPrice;
        System.out.println("Стоимость товаров без скидки: " + sumWithoutDiscount);
        float discountSum = sumWithoutDiscount * 11 / 100;
        System.out.println("Сумма скидки: " + discountSum);
        float sumWithDiscount = sumWithoutDiscount - discountSum;
        System.out.println("Стоимость товаров со скидкой: " + sumWithDiscount);

        BigDecimal penPriceBd = new BigDecimal("105.50");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal sumWithoutDiscountBd = penPriceBd.add(bookPriceBd);
        System.out.println("Стоимость товаров без скидки(BDec): " + sumWithoutDiscountBd);
        BigDecimal discountSumBd = sumWithoutDiscountBd.multiply(BigDecimal.valueOf(0.11));
        System.out.println("Сумма скидки(BDec): " + discountSumBd.setScale(2, RoundingMode.HALF_UP));
        BigDecimal sumWithDiscountBd = sumWithoutDiscountBd.subtract(discountSumBd);
        System.out.println("Стоимость товаров со скидкой:(BDec): " + 
                sumWithDiscountBd.setScale(2, RoundingMode.HALF_UP));

        System.out.println("\n3. Перестановка значений ячеек в таблице");
        int cellA1 = 2;
        int cellB1 = 5;
        System.out.println("До перестановки: A1 = " + cellA1 + ", B1 = " + cellB1);
        System.out.println("Метод: с использованием третьей переменной");
        int temp = cellA1;
        cellA1 = cellB1;
        cellB1 = temp;
        System.out.println("Результат: A1 = " + cellA1 + ", B1 = " + cellB1);
        System.out.println("Метод: арифметических операций");
        int difference = cellB1 - cellA1;
        cellA1 += difference;
        cellB1 -= difference;
        System.out.println("Результат: A1 = " + cellA1 + ", B1 = " + cellB1);
        System.out.println("Метод: побитовый");
        int bitMask = cellA1 ^ cellB1;
        cellA1 = cellA1 ^ bitMask;
        cellB1 = cellB1 ^ bitMask;
        System.out.println("Результат: A1 = " + cellA1 + ", B1 = " + cellB1);

        System.out.println("\n4. Декодирование сообщения");
        int code1055 = 1055;
        int code1088 = 1088;
        int code1080 = 1080;
        int code1074 = 1074;
        int code1077 = 1077;
        int code1090 = 1090;
        System.out.printf("%4d%5d%5d%5d%5d%5d%n", code1055, code1088, code1080, code1074, code1077, code1090);
        System.out.printf("%2c%5c%5c%5c%5c%5c%n", (char) code1055, (char) code1088, (char) code1080, 
                (char) code1074, (char) code1077, (char) code1090);

        System.out.println("\n5. Анализ кода товара");
        int productCode = 123;
        int productCategory = productCode / 100;
        int remainder = productCode % 100;
        int subcategory = remainder / 10;
        int packageType = remainder % 10;
        int controlSum = productCategory + subcategory + packageType;
        int verificationCode = productCategory * subcategory * packageType;
        String textBlock = """
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """.formatted(productCode, productCategory, subcategory, 
                packageType, controlSum, verificationCode);
        System.out.println(textBlock);

        System.out.println("6. Тестирование датчиков перед запуском ракеты");
        byte maxByte = Byte.MAX_VALUE;
        String textBlockTemplate = """
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(maxByte, ++maxByte, --maxByte);
        System.out.println(textBlockTemplate);
        int maxInt = Integer.MAX_VALUE;
        textBlockTemplate = """
                [Пройденное расстояние, км]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(maxInt, ++maxInt, --maxInt);
        System.out.println(textBlockTemplate);
        short maxShort = Short.MAX_VALUE;
        textBlockTemplate = """
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(maxShort, ++maxShort, --maxShort);
        System.out.println(textBlockTemplate);
        long maxLong = Long.MAX_VALUE;
        textBlockTemplate = """
                [Время с момента старта, с]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(maxLong, ++maxLong, --maxLong);
        System.out.println(textBlockTemplate);
        char maxChar = Character.MAX_VALUE;
        textBlockTemplate = """
                [Код состояния системы]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted((int) maxChar, (int) ++maxChar, (int) --maxChar);
        System.out.print(textBlockTemplate);

        System.out.println("\n7. Вывод параметров JVM и ОС");
        Runtime runtime = Runtime.getRuntime();
        double totalMemory = runtime.totalMemory() / (1024 * 1024);
        double freeMemory = runtime.freeMemory() / (1024 * 1024);
        double usedMemory = (totalMemory - freeMemory);
        double maxMemory = runtime.maxMemory() / (1024 * 1024);
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
                """, runtime.availableProcessors(), totalMemory, freeMemory, usedMemory, maxMemory, 
                systemDisk.charAt(0), osVersion, javaVersion, filePathSeparator);

        System.out.println("\n8.Замер времени кода работы");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalTime localTimeEnd = LocalTime.now();
        long endTime = System.nanoTime();
        double workTime = (double) (endTime - startTime) / 1_000_000_000;
        System.out.printf("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %.3f сек    |
                """, dtf.format(localTimeStart), dtf.format(localTimeEnd), workTime);
    }
}