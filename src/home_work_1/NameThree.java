package home_work_1;

import java.util.Scanner;

public class NameThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = console.nextLine();

        switch (name.toLowerCase()) {
            case "вася":
                System.out.println("Привет");
            case "анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}