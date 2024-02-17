package home_work_1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для перевода");
        int number = console.nextInt();
        console.nextLine(); // очистка буфера ввода от символа enter
        System.out.println("для превода в байты ведите: \"b\"  для перевода в килобайты: \"kb\" ");
        String str = console.nextLine();

        if ("b".equalsIgnoreCase(str)) {
            System.out.println(number + " Кб " + "= " + number * 1024 + " б");
        } else if ("kb".equalsIgnoreCase(str)) {
            System.out.println(number + " б " + "= " +  number / 1024.0 + " Кб");
        } else {
            System.out.println("Выбрана неверная величина");
        }
    }
}
