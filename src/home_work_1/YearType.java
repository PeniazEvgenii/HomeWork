package home_work_1;

import java.util.Scanner;

public class YearType {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите год для проверки високостность");
        int year = getCheckInt();
        System.out.println(year);

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " обычный год");
        }
    }

    public static int getCheckInt() {
        int temp;

        if (console.hasNextInt()) {    // не получается сделать && console.nextInt() > 0 . Просит второй ввод
            temp = console.nextInt();
        } else {
            System.out.println("Введен некорректный год");
            console.next();
            temp = getCheckInt();
        }

        return temp;
    }
}
