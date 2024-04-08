package home_work_1;

import java.util.Scanner;

public class LetterCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер символа для проверки от 0 до 255");
        int value = console.nextInt();

        char symbol = (char)value;
        if (isLetter(symbol)) {
            System.out.println("Это буква английского алфавита: " + symbol);
        } else {
            System.out.println("Это не английская буква, а другой символ " + symbol);
        }
    }

    /**
     * Метод проверки символа на принадлежность букве
     * @param symbol проверяемый символ
     * @return true - символ является буквой, false - не является буквой
     */
    public static boolean isLetter(char symbol) {
        return (symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z');
    }

    /**
     * Метод проверки символа на принадлежность букве, используя класс Character
     * @param symbol проверяемый символ
     * @return true - символ является буквой, false - не является буквой
     */
    public static boolean isLetter2(char symbol) {
        return Character.isLetter(symbol);
    }
}
