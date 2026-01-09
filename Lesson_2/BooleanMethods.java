public class BooleanMethods {
    public boolean isContinueProgram() {
        System.out.printf("%s() -> программа выполняется далее или завершается? - ",
                Methods.getCurrentMethodName());
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.printf("%s() -> последовательность содержит уникальную цифру? - ",
                Methods.getCurrentMethodName());
        return false;
    }

    public boolean isLetterInput() {
        System.out.printf("%s() -> пользователь ввел букву или что-то другое? - ",
                Methods.getCurrentMethodName());
        return true;
    }

    public boolean hasEqualsDigits() {
        System.out.printf("%s() -> в проверяемых числах, есть равные цифры? - ",
                Methods.getCurrentMethodName());
        return false;
    }

    public boolean hasRemainingLives() {
        System.out.printf("%s() -> в игре \"Марио\" остались попытки? - ",
                Methods.getCurrentMethodName());
        return true;
    }

    public boolean isBlank() {
        System.out.printf("%s() -> пользователь ввёл пустую строку или из одних пробелов? - ",
                Methods.getCurrentMethodName());
        return false;
    }

    public boolean isEvenDiceRoll() {
        System.out.printf("%s() -> на кубике, который бросил компьютер, выпало четное число? - ",
                Methods.getCurrentMethodName());
        return true;
    }

    public boolean isValidPath() {
        System.out.printf("%s() -> путь до файла, который вы ищите на ssd, действительный? - ",
                Methods.getCurrentMethodName());
        return false;
    }

    public boolean isExistFile() {
        System.out.printf("%s() -> файл по указанному адресу существует? - ",
                Methods.getCurrentMethodName());
        return true;
    }
}