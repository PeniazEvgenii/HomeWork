package home_work_1;

import java.util.Scanner;

public class YearType {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите год для проверки високостность");
        int year = getCheckInt();
        System.out.println(year);

        if (isYearLeap(year)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " обычный год");
        }
        
    }

    /**
     * Метод проверки года на високостность
     * @param year проверяемый год
     * @return true - год высокостный, false - год обычный
     */
    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /**
     * Метод ввода числа типа int
     * @return введенное с консоли число
     */
    public static int getCheckInt() {
        int temp;
        if (console.hasNextInt()) {
            temp = console.nextInt();
        } else {
            System.out.println("Введен некорректный год");
            console.next();
            temp = getCheckInt();
        }
        return temp;
    }
}
