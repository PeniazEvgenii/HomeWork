package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class NameTwo implements ICommunicationPrinter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = console.nextLine();
        NameTwo two = new NameTwo();
        System.out.println(two.welcom(name));
    }

    @Override
    public String welcom(String name) {
        String result = "";
        if (Objects.equals(name.toLowerCase(), "вася")) {
            result = "Привет!\nЯ тебя так долго ждал";
        } else if (Objects.equals(name.toLowerCase(), "анастасия")) {
            result = "Я тебя так долго ждал";
        } else {
            result = "Добрый день, а вы кто?";
        }
        return result;
    }
}
