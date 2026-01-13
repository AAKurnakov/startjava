package com.startjava.lesson_2_3.method.naming;

public class NonBooleanMethods {
    public void findLongestWord() {
        System.out.printf("%s() -> найти самое длинное слово в предложении из книги по Java%n",
                Methods.getCurrentMethodName());
    }

    public void chooseMenuOption() {
        System.out.printf("%s() -> выбрать пункт меню в текстовом редакторе на macOS%n",
                Methods.getCurrentMethodName());
    }

    public void calcAverageGrade() {
        System.out.printf("%s() -> вычислить среднее значение оценок в школе №1234%n",
                Methods.getCurrentMethodName());
    }

    public void countUniqueWords() {
        System.out.printf("%s() -> посчитать уникальное количество слов в \"Война и Мир\"%n",
                Methods.getCurrentMethodName());
    }

    public void showErrorMessage() {
        System.out.printf("%s() -> вывести сообщение об ошибке%n",
                Methods.getCurrentMethodName());
    }

    public void syncWithCloud() {
        System.out.printf("%s() -> синхронизировать данные с облачным хранилищем%n",
                Methods.getCurrentMethodName());
    }

    public void restoreFromBackup() {
        System.out.printf("%s() -> восстановить данные из резервной копии от 11.03.2024%n",
                Methods.getCurrentMethodName());
    }

    public void pauseDownload() {
        System.out.printf("%s() -> приостановить загрузку mp3-файла группы \"Ария\"%n",
                Methods.getCurrentMethodName());
    }

    public void resetToFactorySettings() {
        System.out.printf("%s() -> сбросить настройки до заводских для пылесоса Mi%n",
                Methods.getCurrentMethodName());
    }

    public void writeFile() {
        System.out.printf("%s() -> записать содержимое в файл по указанному пути на флешку%n",
                Methods.getCurrentMethodName());
    }

    public void convertCelsiusToFahrenheit() {
        System.out.printf("%s() -> преобразовать температуру из Цельсия в Фаренгейт%n",
                Methods.getCurrentMethodName());
    }

    public void evaluateExpression() {
        System.out.printf("%s() -> ввести математическое выражение с тремя аргументами%n",
                Methods.getCurrentMethodName());
    }

    public void findGameWinner() {
        System.out.printf("%s() -> выявить победителя среди гонщиков игры \"Need For Speed\"%n",
                Methods.getCurrentMethodName());
    }

    public void searchBookByAuthor() {
        System.out.printf("%s() -> найти книгу по имени писателя%n",
                Methods.getCurrentMethodName());
    }
}