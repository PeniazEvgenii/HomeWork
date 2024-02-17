package home_work_1;

import java.util.Scanner;

public class LetterCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер символа для проверки от 0 до 255");
        int value = console.nextInt();

        char symbol = (char)value;

        if (symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z') {
            System.out.println("Это буква английского алфавита: " + symbol);
        } else {
            System.out.println("Это не английская буква, а другой символ " + symbol);
        }
    }
}
