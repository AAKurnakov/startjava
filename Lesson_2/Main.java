public class Main {
    public static void main(String[] args) {
        System.out.println("НЕ BOOLEAN-МЕТОДЫ ");
        NonBooleanMethods nonBoolean = new NonBooleanMethods();
        nonBoolean.getLongestWord();
        nonBoolean.chooseMenuOption();
        nonBoolean.calcAverageGrade();
        nonBoolean.getUniqueWordCount();
        nonBoolean.showErrorMessage();
        nonBoolean.syncWithCloudData();
        nonBoolean.restoreFromBackupByDate();
        nonBoolean.pauseAriaMp3Download();
        nonBoolean.resetToFactorySettings();
        nonBoolean.saveToUsbDriveByPath();
        nonBoolean.convertCelsiusToFahrenheit();
        nonBoolean.evaluateExpression();
        nonBoolean.findNeedForSpeedWinner();
        nonBoolean.searchBookByAuthor();

        System.out.println("\nBOOLEAN-МЕТОДЫ");
        boolean result;
        BooleanMethods booleanMethods = new BooleanMethods();
        result = booleanMethods.isContinueProgram();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.hasUniqueDigit();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.isLetterInput();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.hasEqualsDigits();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.hasRemainingLivesInMarioGame();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.isEmptyOrBlank();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.isEvenDiceRoll();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.isValidFilePathBySsd();
        System.out.print(" - " + result + "\n");
        result = booleanMethods.isExistFilePath();
        System.out.print(" - " + result + "\n");
    }
}