public class Main {
    public static void main(String[] args) {
        System.out.println("НЕ BOOLEAN-МЕТОДЫ ");
        runNonBoolean();

        System.out.println("\nBOOLEAN-МЕТОДЫ");
        runBoolean();
    }

    private static void runNonBoolean() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.chooseMenuOption();
        nonBm.calcAverageGrade();
        nonBm.countUniqueWords();
        nonBm.showErrorMessage();
        nonBm.syncWithCloud();
        nonBm.restoreFromBackup();
        nonBm.pauseDownload();
        nonBm.resetToFactorySettings();
        nonBm.writeFile();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.evaluateExpression();
        nonBm.findGameWinner();
        nonBm.searchBookByAuthor();
    }

    private static void runBoolean() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isContinueProgram());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetterInput());
        System.out.println(bm.hasEqualsDigits());
        System.out.println(bm.hasRemainingLives());
        System.out.println(bm.isBlank());
        System.out.println(bm.isEvenDiceRoll());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isExistFile());
    }
}