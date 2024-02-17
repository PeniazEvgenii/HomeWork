package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class NameTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = console.nextLine();

        if (Objects.equals(name.toLowerCase(), "вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name.toLowerCase(), "анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
