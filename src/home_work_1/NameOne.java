package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class NameOne implements ICommunicationPrinter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = console.nextLine();
        NameOne one = new NameOne();
        System.out.println(one.welcom(name));

    }

    @Override
    public String welcom(String name) {
        String result = "";
        if (Objects.equals(name.toLowerCase(), "вася")) {
            result = "Привет!\n";
        }
        if (Objects.equals(name.toLowerCase(), "анастасия") || Objects.equals(name.toLowerCase(), "вася")) {
            result += "Я тебя так долго ждал";
        } else {
            result = "Добрый день, а вы кто?";
        }
        return result;
    }
}
