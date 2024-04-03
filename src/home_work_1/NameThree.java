package home_work_1;

import java.util.Scanner;

public class NameThree implements ICommunicationPrinter{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = console.nextLine();
        NameThree three = new NameThree();
        System.out.println(three.welcom(name));
    }

    @Override
    public String welcom(String name) {
        String result = "";
        switch (name.toLowerCase()) {
            case "вася":
                result = "Привет!\n";
            case "анастасия":
                result += "Я тебя так долго ждал";
                break;
            default:
                result = "Добрый день, а вы кто?";
        }
        return result;
    }
}